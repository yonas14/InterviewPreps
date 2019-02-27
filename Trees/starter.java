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
        bst.add(4);
        bst.add(12);
        bst.add(10);
        bst.add(14);

        bst.getMinimum();
        bst.getMax();

        bst.getMaxRecurse();
        bst.getMinRecurse();

        bst.findSucc();

        bst.findValue(00);

        return bst;
    };

}
