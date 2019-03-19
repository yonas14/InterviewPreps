package Graphs;

import java.util.Iterator;
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
    public void breadthFirstTraversal(int s){

        int [] visited = new int[v];
        System.out.println("Breadth First Traversal");
        LinkedList<Integer> q = new LinkedList<Integer>();
        visited[s] = 1;
        q.add(s);
        while (q.size() != 0 ){
            s = q.poll();
            Iterator<Integer> itr = adjacencyList[s].listIterator();
            System.out.print(s + " ");
            while (itr.hasNext()){
                int k = itr.next();
                if(visited[k] == 0){
                    visited[k] = 1;
                    q.add(k);
                }
            }
        }
    }
    public  void depthFirstTraversal(){

        
    }

    public void addEdge(int s, int n){
        adjacencyList[s].add(n);
    }


}
