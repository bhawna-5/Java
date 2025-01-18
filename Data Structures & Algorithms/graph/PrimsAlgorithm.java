package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 6));
        graph[0].add(new Edge(0, 3, 10));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1, 3, 15));

        graph[2].add(new Edge(2, 0, 6));
        graph[2].add(new Edge(2, 3, 30));

        graph[3].add(new Edge(3, 1, 15));
        graph[3].add(new Edge(3, 2, 30));
    }

    public static void prim(ArrayList<PrimsAlgorithm.Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<PrimsAlgorithm.Pair> pq = new PriorityQueue<>();
        int mstCost = 0;
        pq.add(new PrimsAlgorithm.Pair(0, 0));
        while (!pq.isEmpty()) {
            PrimsAlgorithm.Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                mstCost += curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    PrimsAlgorithm.Edge e = graph[curr.node].get(i);
                    pq.add(new PrimsAlgorithm.Pair(e.dest, e.weight));
                }
            }
        }
        System.out.println(mstCost);
    }


    public static void primAlgo(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        ArrayList<Edge> mstEdges = new ArrayList<>(); // Store edges in MST

        pq.add(new Pair(src, 0));
        int[] parent = new int[graph.length]; // Track parent of each node
        parent[src] = -1; // Source has no parent

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                // If the node has a parent, add the corresponding edge to the MST
                if (parent[curr.node] != -1)
                    mstEdges.add(new Edge(parent[curr.node], curr.node, curr.cost));
                // Add all adjacent edges to the priority queue
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                        //parent[e.dest] = curr.node; // Update parent for the destination
                    }
                }
            }
        }

        // Output the edges of the MST
        System.out.println("Edges in the MST:");
        for (Edge edge : mstEdges) {
            System.out.println("Src: " + edge.src + ", Dest: " + edge.dest + ", Weight: " + edge.weight);
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        primAlgo(graph, 0);
    }
}


