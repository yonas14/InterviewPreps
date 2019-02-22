package LinkedList;

public class LinkedList {

    public Node head;
    public int listCount;

    public LinkedList( int d){
        head = new Node(d);
        listCount = 1;
    }
    public boolean addToTail(int d){
        Node end = new Node(d);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        listCount++;
        System.out.println(d+" appended to tail!");
        return true;
    }

    public boolean addToHead(int d){
        Node newHead = new Node(d);

        newHead.next = head;
        head = newHead;
        listCount++;

        return true;
    }
    public void show(){
        Node current = head;
        while(current.next!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public static void main(String [] args){

        LinkedList linkedList = new LinkedList(6);
        linkedList.addToTail(9);
        linkedList.addToTail(8);
        linkedList.addToTail(11);
        linkedList.addToHead(10);
        linkedList.show();
    }

}

