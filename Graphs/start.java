package Graphs;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Iterator;
import java.util.LinkedList;

public class start{

    private static Graph graph;
    public static void main(String [] args){

        graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        print();
        graph.breadthFirstTraversal(2);
    }


    public static void print(){
        System.out.println("i " + "adjacentNodes");
        System.out.println("- ------------");
        for(int i = 1; i<graph.adjacencyList.length-1; i++){
            System.out.print(i+" ");
            System.out.println(graph.adjacencyList[i]);
        }
    }


    public static void depthFirstTraversal(){}


}