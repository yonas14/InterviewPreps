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

    private Node addRecrusively(Node current, int value){

        if(current == null){
            return new Node(value);
        }

        if(current.value > value){
            current.left = this.addRecrusively(current.left,value);
        }else if(current.value < value){
            current.right = this.addRecrusively(current.right, value);
        }else{
            return current;
        }
        return current;
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


    private Node findSuccsor(Node current){
        if(current == null || current.right == null){
            return current;
        }else {
            while(current.right){}

        }



    }




}
