package Trees;

public class starter {
    public static void main(String args []){

        BST tree = add2Tree();

    }
    public static BST add2Tree(){
        BST bst = new BST();

        bst.add(20);
        bst.add(8);
        bst.add(22);
//        bst.add(4);
//        bst.add(12);
//        bst.add(10);
//        bst.add(14);
        Node tree = bst.root;
        bst.getMinimum();
        bst.getMax();

        bst.getMaxRecurse();
        bst.getMinRecurse();

        bst.findSucc();

        bst.deleteNode(20, tree);

        bst.findValue(4, tree);

        bst.maxDepth();

        bst.BFT();
        bst.depthFirstTraversal();


        return bst;
    };

}
