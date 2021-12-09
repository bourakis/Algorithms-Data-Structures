
package graphexample;

public class Edge {
    private int id;
    private Node start;
    private Node end;
    private double weight;
    
    public Edge(Node s, Node e, double w, int id){
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }
    
    public Node getStart(){
        return this.start;
    }
    public Node getEnd(){
        return this.end;
    }
    public int getId(){
        return this.id;
    }
    public double getWeight(){
        return this.weight;
    }
    public int getIdOfStartNode(){
        return this.start.getNodeId(); // μέθοδος της Node class
    }
    public int getIdOfEndNode(){
        return this.end.getNodeId(); // μέθοδος της Node class
    }
    
}
