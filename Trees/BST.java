package Trees;

import javafx.scene.SubScene;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BST {
    Node root;
    ArrayList<Integer>  heap;
    int count = 0;

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
//          **********
//          If the current node is null
//          go up the tree until you find the first node which is left of its parent
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

    public Node deleteRec(Node root,int key){
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
        if (key < root.value)
            root.left = deleteRec(root.left, key);
        else if (key > root.value)
            root.right = deleteRec(root.right, key);

            // if key is same as root's key, then This is the node
            // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.value = getMinRecurse(root.right).value;
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }
        /* Otherwise, recur down the tree */
        return root;
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
    public void BFT(Node root, ArrayList<Integer> heap){
        int height = height(root);
        System.out.println("====================");
        System.out.println("Breadth First Traversal ");
        for(int i =0;  i <= height; i++){
            printGivenLevel(root, i);
//            insetMinHeap(root.value);
        }
        for(int i=0; i<= height; i++){
            if(i==0){
                insetMinHeap(insertMinHeapValue(root,i));
            }else {
                insertMinHeapValue(root, i);

            }
        }
    }



    public int insertMinHeapValue(Node current, int level){

        if( current == null){
            return 0;
        }
        if(level == 0){
            return current.value;
        }else{
            insetMinHeap(insertMinHeapValue(current.left, level-1));
            insetMinHeap(insertMinHeapValue(current.right, level-1));
        }
        return current.value;
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

    private void insetMinHeap(int nodeValue){
        count++;
        if(count ==1){
            heap.add(count, nodeValue);
        }else{
            heap.add(count, nodeValue);
            if(heap.get(parent(count)) > heap.get(count)){
                heapfyDown(count);
            }
        }
    }

    private void heapfyDown(int index){

        while(heap.get(parent(index)) > heap.get(index) && index > 0){
            swap(index, parent(index));
            index = parent(index);

        }

    }
//  returns the index to the parent
    private int parent(int i){
        return i/2;
    }

    private int right(int i){
        return 2 * i;
    }

    private int left(int i){
        return 2 * i + 1;
    }

    private void swap(int current, int parent){
        int temp = heap.get(parent);
        heap.add(parent, heap.get(current));
        heap.add(current, temp);
    }

    private void printHeap(){
        for(int i =1; i<=count; i++){
            System.out.print(heap.get(i));
        }
    }
}
