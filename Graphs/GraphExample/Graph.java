
package graphexample;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes = new ArrayList<Node>();
    private int numberOfNodes = 0;
    
    public void createNode(Node node){
        this.nodes.add(node);
        this.numberOfNodes++;
    }
    public int getNumberOfNodes(){
        return this.numberOfNodes;
    }
    public boolean checkForAvailability(){
        return (this.numberOfNodes > 1);
    }
}
