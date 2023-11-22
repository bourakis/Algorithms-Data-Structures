// Node class representing a node in the linked list
class Node 
{
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class representing the linked list
class LinkedList 
{
    Node head; // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() 
    {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the elements of the linked list
    public void printList() 
    {
        Node current = head;
        System.out.print("Linked List: ");
      
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListExample
{
    public static void main(String[] args) 
    {
        // Creating a linked list
        LinkedList linkedList = new LinkedList();

        // Inserting elements at the beginning
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(7);
        linkedList.insertAtBeginning(12);

        // Printing the linked list
        linkedList.printList();
    }
}
