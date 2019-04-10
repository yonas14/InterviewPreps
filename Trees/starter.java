package Trees;

import java.net.Inet4Address;
import java.util.ArrayList;

public class starter {
    public static void main(String args []){

        BST tree = add2Tree();

    }
    public static BST add2Tree(){
        BST bst = new BST();

        bst.add(20);
        bst.add(8);
        bst.add(23);
        bst.add(21);
        bst.add(22);
//        bst.add(10);
//        bst.add(14);

        Node tree = bst.root;
        bst.heap = new ArrayList<>(10);
        bst.heap.add(0, -1);
//        heap = bst.heap;

        bst.BFT(tree, bst.heap);
        bst.depthFirstTraversal();

        bst.getMinimum();
        bst.getMax();

        bst.getMaxRecurse();
        bst.getMinRecurse();

        bst.findSucc();

       Node newTree =  bst.deleteRec(tree,20);

        bst.findValue(4, tree);

        bst.maxDepth();

//        bst.BFT(newTree, heap);





        return bst;
    };

}
