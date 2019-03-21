package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    int V;
    LinkedList<Integer> adjacencyList[];

    Graph(int v){
        this.V = v ;
        adjacencyList = new LinkedList[v];

        for(int i=0; i<v; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void breadthFirstTraversal(int s){

        int [] visited = new int[V];
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


    public void depthFirstChecker(int visited [], int s){

        visited[s] = 1;
        System.out.print(s +" ");
        Iterator<Integer> itr = adjacencyList[s].listIterator();
        while(itr.hasNext()){
            int k = itr.next();
            if(visited[k] == 0){
                depthFirstChecker(visited, k);
            }
        }

    }



    public  void depthFirstTraversal(int s){
        int [] visitied = new int[V];

        depthFirstChecker(visitied, s);
    }

    public void addEdge(int s, int n){
        adjacencyList[s].add(n);
    }


}
