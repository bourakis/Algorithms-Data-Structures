
package graphexample;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int id;
    private List<Edge> neighbours = new ArrayList<Edge>();
    // ΠΡΟΣΟΧΗ: ως neighbours ΘΕΩΡΩ ΤΑ edges ΠΟΥ ΣΧΕΤΙΖΟΝΤΑΙ
    // με κάθε node, ΟΧΙ ΤΟΥΣ ΓΕΙΤΟΝΙΚΟΥΣ ΚΟΜΒΟΥΣ
    
    public Node(int id){
        this.id = id;
    }
    
    public int getNodeId(){
        return this.id;       
    }
    
    public void addNeighbour(Edge e){
        if (this.neighbours.contains(e)){
            System.out.println("This edge has already been defined");
        }
        else{
            this.neighbours.add(e);
            System.out.println("Succesfully added "+e);
        }
    }
    
    public void getNeighbours(){
        System.out.println("List of all edges that node "+this.id+" has:");
        System.out.println("=================================");
        for (int i = 0; i<this.neighbours.size(); i++){
            System.out.println("ID of edge: "+neighbours.get(i).getId() + "\nID of the first node: "+neighbours.get(i).getIdOfStartNode());
            System.out.println("ID of the second node: "+neighbours.get(i).getIdOfEndNode());
            System.out.println("");
            
        }
        System.out.println(neighbours);
    }
}
