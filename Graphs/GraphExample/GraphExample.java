
package graphexample;

public class GraphExample {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        
        graph.createNode(node1); // προσθήκη στη λίστα των κόμβων του 
                                 // graph και αύξηση κατά 1 του αριθμού 
                                 // των κόμβων
        graph.createNode(node2);
        graph.createNode(node3);
        
        // δημιουργεί 
        Edge e12 = new Edge(node1, node2, 5, 1);
        Edge e13 = new Edge(node1, node3, 12, 2);
        
        if (graph.checkForAvailability()){
            node1.addNeighbour(e12); // σύνδεση των κόμβων 1 και 2
            node1.addNeighbour(e13);
            node1.getNeighbours();
        }
        else{
            System.out.println("Πρέπει να υπάρχουν τουλάχιστον 2 κόμβοι στο γράφημα");
            
        }

    }
    
}
