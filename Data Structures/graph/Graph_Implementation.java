package graph;

import java.util.ArrayList;

public class Graph_Implementation {
    static class edge {
        int src;
        int destination;

        public edge(int src, int dest) {
            this.src = src;
            this.destination = dest;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();// to create an empty arraylist in each index
            // of array so that it won't be null anymore
        }
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 3));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));

    }

    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        for (int i = 0; i < graph[1].size(); i++) {
            edge e = graph[1].get(i);

            System.out.print(e.src+" ");
            System.out.print(e.destination+" ");
        }
    }
}
