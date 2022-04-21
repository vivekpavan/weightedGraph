package com.weightedGraph;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var graph = new weightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","B",1);
        graph.addEdge("B","C",2);
        graph.addEdge("A","C",10);
//        graph.addEdge("A","C",10);
//        graph.print();
//        var path = graph.getShortestPath("A","C");
//        System.out.println(path);
//        var distance = graph.getShortDistance("A","C");
//        System.out.println(distance);
//        System.out.println(graph.hasCycle());
        var tree  = graph.getMinimumSpanningTree();
        tree.print();
    }
}
