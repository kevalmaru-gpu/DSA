public class DoublyCircularLinkedList {
    
    class Node{
        public int data;
        public Node lptr,rptr;

        public Node(int data){
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node headNode = null, tailNode = null;

    public void AddNode(int data){
        Node newNode = new Node(data);
    
        if (headNode == null){
            headNode = newNode;
            tailNode = newNode;
            tailNode.rptr = headNode;
            headNode.lptr = tailNode;
        }
        else{
            tailNode.rptr = newNode;
            newNode.lptr = tailNode;
            tailNode = newNode;

            tailNode.rptr = headNode;
            headNode.lptr = tailNode;
        }
    }

    public void DeleteNode(){
        tailNode = tailNode.lptr;

        tailNode.rptr = headNode;
        headNode.lptr = tailNode;
    }

    public void Display(){
        Node tmpNode = headNode;

        while(tmpNode != tailNode){
            System.out.println(tmpNode.data);
            tmpNode = tmpNode.rptr;
        }
        System.out.println(tmpNode.data);
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList linkedList = new DoublyCircularLinkedList();

        System.out.println("Phase 1");
        linkedList.AddNode(10);
        linkedList.AddNode(20);
        linkedList.Display();
        System.out.println("\nPhase 2");
        linkedList.AddNode(200);
        linkedList.AddNode(400);
        linkedList.Display();
        System.out.println("\nPhase 3");
        linkedList.DeleteNode();
        linkedList.Display();
    }
}
