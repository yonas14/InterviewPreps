package Trees;

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

//        int height = height(root);
////      if root doesn't have any children, set to null
//        if(root.left == null && root.right == null){
//            root = null;
//        }
//
////      if the height of the tree is one
//        if(height == 1 && (root.right == null || root.left == null)){
//            if(root.right == null){
//                root = root.left;
//                root.parent = null;
//                return root;
//            }else {
//                root = root.right;
//                root.parent = null;
//                return root;
//            }
//        }else {
//            if(height == 1 && value == root.value){
//                System.out.println("Has two children, but height is 1");
//
//                root.left.parent = root.right;
//                root.right.parent = null;
//                root.left.parent.left = root.left;
//                return root.left.parent;
//            }else{
//                //Has two child and length > 1
//                Node successor = findSuccsor(root);
//                while (root.value != successor.parent.value){
//                    successor.right = successor.parent;
//                    successor.left = successor.parent.left;
//
//                }
//
//            }
//        }

//
//        if(root.left == null){
//
//        }else if(root.right.value == value){
//
//        }else{
//        }
//       if the left child is null, assign the root to be the right child
        if(current.left == null){
            current = current.right;
            return current;

        }else if(current.right == null){
//      if the right child is null, assign the root to be the left child.
            current = current.left;
            current.parent = null;
            return current;
        }else{
//       if the node more than 1 children, find the successors
//       replace the parents left subtree with the successors subtree

            Node successor = findSuccsor(current);
            if(successor.right != null){
                successor.parent.left = successor.right;
                successor.parent.left.parent = current.parent;

               // successor.right = current.right;
            }else{

            }

            successor.right = current.right;
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
