package Trees;

public class starter {
    public static void main(String args []){

        BST tree = add2Tree();

    }
    public static BST add2Tree(){
        BST bst = new BST();
        bst.add(20);
        bst.add(8);
        bst.add(1);
        bst.add(5);

        bst.getMinimum();
        bst.getMax();

        bst.getMaxRecurse();
        bst.getMinRecurse();

        bst.findSucc();

        return bst;
    };

}
