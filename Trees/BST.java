package Trees;

import javafx.scene.SubScene;

public class BST {
    Node root;


    public void add(int value){
        root = addRecrusively(root, value);
    }
    public void getMaxRecurse(){
       System.out.println("Max Recursively: "+ getMaxRecurse(root).value);
    }
    public void getMinRecurse(){
        System.out.println("Min Recursively: "+ getMinRecurse(root).value);
    }

    public void findSucc(){
        System.out.println("====================");
//        System.out.println("Right successor: "+ findSuccsor(root.left.right.right).value);
    }
    public Node findValue(int value, Node root){
        return searchValue(value, root);
    }

    public void maxDepth(){
        System.out.println("Max height is: " + height(root));
    }

    public void depthFirstTraversal(){

        DFT(root);
    };

    private Node addRecrusively(Node current, int value){

        if(current == null){
            return new Node(value);
        }
        Node temp;
        if(current.value > value){
            temp = this.addRecrusively(current.left,value);
            current.left = temp;
            temp.parent = current;
        }else if(current.value <= value){
            temp = this.addRecrusively(current.right, value);
            current.right = temp;
            temp.parent = current;
        }
        return current;
    }
//  Given a value, find the node
    private static Node searchValue(int value, Node current) {

        if(current == null){
            System.out.print("Value not found in the Tree");
            return null;
        }else if(current.value == value){
            System.out.println("Found the value");
            return current;
        }else if( current.value <= value){
            searchValue(value, current.right);
        }else if(current.value > value){
            searchValue(value, current.left);
        }
        return null;
    }


    public Node getMinimum(){
        Node min;
        if(root.left == null || root == null){
            return root;
        }else
            min = root;
            while(min.left!= null){
                min = min.left;

            }
        return min;
    }

    public Node getMax(){
        Node max;
        if(root.right == null || root == null){
            return root;
        }else
            max = root;
        while(max.right!= null){
            max = max.right;

        }
        return max;
    }

    private Node getMaxRecurse(Node current){
        Node max;
        if(current.right == null || root == null){
            return current;
        }else{

            max = getMaxRecurse(current.right);
        }
        return max;
    }

    private Node getMinRecurse(Node current){
        Node min;
        if(current.left == null || root == null){
            return current;
        }else{

            min = getMinRecurse(current.left);
        }
        return min;
    }
//    Finds the true successor
    private Node findSuccsor(Node current){
        if(root.right != null){
            return getMinRecurse(root.right);
        }else {
            Node parent = current.parent;
            while( parent != null && parent == current.right){

                current = parent;
                parent = parent.parent;
            }
            return parent;
        }
    }
//  Deletion process of Node Z
//  if  Z doesn't have a child, simply set to null
//  if  Z has only one child and it is the right child then set  Z to its right child,
//  vise versa if the only child of Z is the right child
//  But if Z has both left and right children, then find the successor, Right side of the tree

    public Node deleteNode(int value, Node current ){

        Node x = current;
        if(current.left == null){
            Node finall = transplant(current, current.right);
        }else if(current.right == null){
            Node finall = transplant(current, current.left);
        }else{
            Node y = getMinRecurse(current.right);
            if(y.parent.right != y){
                Node finall = transplant(y, y.right);

            }
        }

        return null;
    }
    public Node transplant(Node u, Node v){

//      Is the node a left child
        if(u.parent == null){
            v.parent = null;
            return v;
        }else if(u.parent.left == u){
            u.parent.left = v;
            return u.parent.left;
        }else(u.parent.right == u){
            if(v == null){
                v.parent = u.parent;
                return v.parent;
            }
        }
        return null;
    }

//  This helps find the height
    private int height(Node current){

        if(current == null){
            return -1;
        }else{
            int lheight = height(current.left);
            int rheight = height(current.right);

            if( lheight > rheight){
                return lheight +1 ;
            }else {
                return rheight +1;
            }
        }
    }

//    Breadth first traversal
    public void BFT(Node root){
        int height = height(root);
        System.out.println("====================");
        System.out.println("Breadth First Traversal ");
        for(int i =0;  i <= height; i++){
            printGivenLevel(root, i);
        }
    }

    private void DFT(Node current){
        if (current == null){
            return;
        }else{
            System.out.println(current.value);
            DFT(current.left);
            DFT(current.right);
        }

    }
//  print given level where level is set to i
    private void printGivenLevel(Node current, int level){

        if(current == null){
            return;
        }
        if(level == 0){
            System.out.print(current.value + " ");
        }else if(level >= 1){
            printGivenLevel(current.right, level-1);
            printGivenLevel(current.left, level-1);
        }

    }
}
