package Graphs;

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
    }

    public static void addEdge(int i, int n){
        graph.adjacencyList[i].add(n);
    }
    public static void print(){
        for(int i = 1; i<graph.adjacencyList.length-1; i++){
            System.out.print(i+" ");
            System.out.println(graph.adjacencyList[i]);
        }
    }

    public static void breadthFirstTraversal(){}
    public static void depthFirstTraversal(){}


}
