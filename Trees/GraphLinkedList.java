
package graphlinkedlist;

import java.util.LinkedList;

public class GraphLinkedList 
{
    int vertex;
    LinkedList<Integer> list[];
    
    public GraphLinkedList(int v)
    {
        this.vertex = v;
        list = new LinkedList[v];
        
        for (int i =0; i<vertex; i++)
        {
            list[i] = new LinkedList<>();
        }
    }
    
    public void addEdge(int source, int destination)
    {
        list[source].add(destination);
        list[destination].add(source); // for UNDIRECTED graph
    }
    
    public void printGraph()
    {
        for (int i=0; i<vertex ; i++)
        {
            if (list[i].size() > 0)
            {
                System.out.print("Vertex "+i+" is connected to: ");
                
                for (int j = 0; j<list[i].size(); j++)
                {
                    System.out.println(list[i].get(j) + "   ");
                }
                
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) 
    {
        GraphLinkedList graph = new GraphLinkedList(7);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        
        graph.printGraph();

    }
}
