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
        int n;
        int cost;

        public Pair(int n, int cost) {
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
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

    public static void prim(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int mstCost = 0;
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                mstCost += curr.cost;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    pq.add(new Pair(e.dest, e.weight));
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
            if (!vis[curr.n]) {
                vis[curr.n] = true;

                // If the node has a parent, add the corresponding edge to the MST
                if (parent[curr.n] != -1) {
                    mstEdges.add(new Edge(parent[curr.n], curr.n, curr.cost));
                }

                // Add all adjacent edges to the priority queue
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                        parent[e.dest] = curr.n; // Update parent for the destination
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
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph);
        primAlgo(graph, 0);
    }
}
