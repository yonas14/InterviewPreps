package Trees;

public class starter {
    public static void main(String args []){

        BST tree = add2Tree();

    }
    public static BST add2Tree(){
        BST bst = new BST();
        bst.add(4);
        bst.add(3);
        bst.add(1);
        bst.add(5);

        bst.getMinimum();
        bst.getMax();

        bst.getMaxRecurse();

        return bst;
    };

}
