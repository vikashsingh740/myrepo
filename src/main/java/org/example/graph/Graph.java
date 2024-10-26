package org.example.graph;

import java.util.*;

public class Graph {
    Map<Integer, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int src) {
        adjList.putIfAbsent(src, new ArrayList<>());
    }

    public void addEdge(Edge edge) {
        adjList.putIfAbsent(edge.src, new ArrayList<>());
        adjList.putIfAbsent(edge.dest, new ArrayList<>());
        adjList.get(edge.src).add(edge);
    }

    public void printGraph(Graph graph) {
        for (Map.Entry<Integer, List<Edge>> entry : graph.adjList.entrySet()) {
            System.out.println(entry.getKey());
            for (Edge edge : entry.getValue()) {
                System.out.println(edge.src + " , " + edge.dest);
            }
            System.out.println("===========================");
        }
    }

    public void bfs(Graph graph, int src, List<Integer> visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while (!queue.isEmpty()){
           int a = queue.remove();
           if (!visited.contains(a)) {
               System.out.print(a+" ");
               visited.add(a);
               List<Edge> edgeList = graph.adjList.get(a);
               for (Edge edge : edgeList){
                   queue.add(edge.dest);
               }
           }
        }
    }

    public void dfs(Graph graph, int src, List<Integer> visited){
        visited.add(src);
        System.out.print(src);
        for (int i=0;i<graph.adjList.get(src).size();i++){
            Edge edge = graph.adjList.get(src).get(i);
            if (!visited.contains(edge.dest)){
                dfs(graph, edge.dest, visited);
            }
        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge(new Edge(1, 2));
        graph.addEdge(new Edge(1, 4));
        graph.addEdge(new Edge(2, 3));
        graph.addEdge(new Edge(2, 1));
        graph.addEdge(new Edge(3, 4));
        graph.addEdge(new Edge(3, 2));
        graph.addEdge(new Edge(4, 3));
        graph.addEdge(new Edge(4, 1));

        graph.printGraph(graph);
        List<Integer> list = new ArrayList<>();
        graph.bfs(graph,1,list);
        list = new ArrayList<>();
        graph.dfs(graph,1,list);
    }
}
