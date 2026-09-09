public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("double LL is emptyy");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            size--;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        size--;
        temp.next = null;
        tail.prev = null;
        tail = temp;
        return val;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(5);
        ll.addLast(11);
        ll.addLast(12);
        ll.print();
        ll.reverse();
        ll.print();
     
    }
}
