package Graphs;

import java.util.LinkedList;

public class Graph {

    int v;
    LinkedList<Integer> adjacencyList[];

    Graph(int v){
        this.v = v ;
        adjacencyList = new LinkedList[v];

        for(int i=0; i<v; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }


}
