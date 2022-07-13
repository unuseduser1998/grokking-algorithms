package io.ezekielmitchell.Chapter6;


import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {


    //Breadth-first algorithm: allows me to find the shortest distance between two things
    //commonly used in graphs and other 'shortest path problems'
    // Answers two questions
    // 1) Is there a path from node A to node B?       2) What is the shortest path from node A to node B?

    // Graph: a set of connections
    // Graphs are made up of nodes and edges -- nodes can be connected to many other nodes (neighbors)
    // Graphs model how different things are connected to one another

    // Queues are similar to stacks -- I cannot random search through a queue, only enqueue and dequeue
    // Queues are FIFO, Stacks are LIFO data structures

    // Complexity: O(V+E)

    private final int V;   // No. of vertices
    private final LinkedList<Integer>[] adj; //Adjacency Lists

    // Constructor
    BreadthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean[] visited = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String[] args) {
        BreadthFirstSearch g = new BreadthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}

// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/