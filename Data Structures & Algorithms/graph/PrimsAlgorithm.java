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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
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
    public static void primAlgo(ArrayList<Edge>[] graph, int src) {
        boolean[] vis = new boolean[graph.length]; // Visited array
        int[] parent = new int[graph.length]; // Parent array to track MST edges
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Min-Heap for smallest cost
        int[] minCost = new int[graph.length]; // To track the minimum cost of reaching a node

        // Initialize all costs to infinity and parent to -1
        for (int i = 0; i < graph.length; i++) {
            minCost[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        // Start from the source node
        minCost[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int node = curr.node;

            // Skip if already visited
            if (vis[node]) continue;

            // Mark node as visited
            vis[node] = true;

            // Explore neighbors
            for (Edge e : graph[node]) {
                int neighbor = e.dest;
                int weight = e.weight;

                // If not visited and weight is less than current cost
                if (!vis[neighbor] && weight < minCost[neighbor]) {
                    minCost[neighbor] = weight;
                    parent[neighbor] = node; // Update parent for MST
                    pq.add(new Pair(neighbor, weight));
                }
            }
        }

        // Print the MST edges
        System.out.println("Edges in MST:");
        for (int i = 1; i < graph.length; i++) { // Start from 1 to skip the source
            System.out.println("Src: " + parent[i] + ", Dest: " + i + ", Weight: " + minCost[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        primAlgo(graph, 0);
    }
}


