package linkedList;

public class DesignLinkedList {
	class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    
    private Node head;
    private int size;
    
    public  DesignLinkedList() {
        
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        
        if(size==1){
            return head.value;
        }
        Node current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current.value;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return ;
        }
        
        if(index<=0){
            Node prev= head;
            head=new Node(val);
            head.next = prev;
            size++;
        }
        else{
            size++;
            Node curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            Node node=new Node(val);
            node.next=curr.next;
            curr.next = node;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size || index<0){
            return;
        }
        size--;
        
        if(index==0){
            head=head.next;
            return;
        }
        
        Node curr=head;
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        
        curr.next=curr.next.next;
    }
}
