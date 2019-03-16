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


    }

    public static void addEdge(int i, int n){

        graph.adjacencyList[i].add(n);
    }

    public static void breadthFirstTraversal(){}
    public static void depthFirstTraversal(){}

    
}
