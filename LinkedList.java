public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void insertFront(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        new_node=head;
    }

    public void insertAfter(int pos,int data){
        Node new_node= new Node(data);
        if (pos==0){
            insertFront(new_node.data);
        }
        else{

        }
    }

    public static void main(String[] args) {

    }
}
