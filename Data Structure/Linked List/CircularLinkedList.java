public class CircularLinkedList {
    
    private class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node headNode = null, tailNode = null;
    
    public void AddNode(int data){
        Node newNode = new Node(data);

        if (headNode == null){
            headNode = newNode;
            tailNode = newNode;
            tailNode.next = headNode;
        }
        else{
            tailNode.next = newNode;
            tailNode = newNode;
            tailNode.next = headNode;
        }
    }

    public void DeleteNode(){
        Node tmpNode = headNode;

        while(tmpNode.next != tailNode){
            tmpNode = tmpNode.next;
        }

        tailNode = tmpNode;
        tailNode.next = headNode;
    }

    public void Display(){
        Node tmpNode = headNode;
        
        while(tmpNode != tailNode){
            System.out.println(tmpNode.data);
            tmpNode = tmpNode.next;
        }
        System.out.println(tmpNode.data);
    }

    public void ClearScreen(){
        System.out.println("\033[H\033[2J");
        return;
    }

    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();

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
