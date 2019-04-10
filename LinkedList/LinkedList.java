package LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    public int listCount;

    public LinkedList( int d){
        head = new Node(d);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        tail = curr;
        listCount = 1;
    }

    public boolean delete(int d){

        if(head.data == d ){
            head.data = head.next.data;
            head.next = head.next.next;
            return true;

        }
        Node curr = head;
        while(curr.data != d && curr.next!= null){
            curr = curr.next;
        }

        if(curr.data == d){
            Node temp = curr;
            if(curr.next != null) {
                curr.data = temp.next.data;
                curr.next = temp.next.next;
                curr.prev = temp.prev;
                listCount--;
            }else{
                 tail = curr.prev;
                 tail.next = null;
                 listCount--;
            }
        }
        return true;
    }

    public boolean partion(int d){

        Node curr = head;

        while (curr!= null){
            if(curr.data < d){

            }else{

            }
            curr = curr.next;
        }

        return true;
    }



    public boolean addToTail(int d){
        Node end = new Node(d);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        end.prev = current;
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
        linkedList.addToTail(14);
        linkedList.addToTail(19);
        linkedList.show();
        linkedList.show();
    }

}

