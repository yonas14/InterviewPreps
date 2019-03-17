package Graphs;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Iterator;

public class start{

    private static Graph graph;
    public static void main(String [] args){

        graph = new Graph(5);
        addEdge(1,2);
        addEdge(1,3);
        addEdge(2,1);
        addEdge(2,3);
        addEdge(3,1);
        addEdge(3,2);
        print();
        breadthFirstTraversal();
    }

    public static void addEdge(int i, int n){
        graph.adjacencyList[i].add(n);
    }
    public static void print(){
        System.out.println("i " + "adjacentNodes");
        System.out.println("- ------------");
        for(int i = 1; i<graph.adjacencyList.length-1; i++){
            System.out.print(i+" ");
            System.out.println(graph.adjacencyList[i]);
        }
    }

    public static void breadthFirstTraversal(){

        int [] visited = new int[graph.v];
        System.out.println("Breadth First Traversal");


        for(int i = 1; i < visited.length-1; i++){
            if(visited[i] == 0){
                System.out.print(i+ " ");
                visited[i] = 1;
                for (Iterator j = graph.adjacencyList[i].iterator(); j.hasNext();){
                    int k = (int) j.next();
                    System.out.println(k);
                    visited[k] = 1;
                }
            }
            System.out.println();
        }
    }
    public static void depthFirstTraversal(){}


}
