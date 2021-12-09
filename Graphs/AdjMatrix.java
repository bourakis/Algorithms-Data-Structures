import java.util.Scanner;

public class AdjMatrix 
{
    private final int vertices;
    private int[][] adjacency;
    
    public AdjMatrix(int v)
    {
        vertices = v;
        adjacency = new int[vertices + 1][vertices + 1];
        // για να μη χρειάζεται να ξεκινάω την αρίθμηση από το 0
    }        
    
    public static void main(String[] args) 
    {
        int v, e;
        int count = 1;
        int to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        
        AdjMatrix graph;
        
        System.out.println("Enter the number of vertices: ");
        v = sc.nextInt();
        graph = new AdjMatrix(v);
        System.out.println("Enter the number of edges: ");
        e = sc.nextInt();
        
        while (count <= e)
        {
            System.out.println("Enter the edge <to> <from>");

            to = sc.nextInt();
            from = sc.nextInt();
            graph.makeEdge(to, from);
            count++;
        }
        
        graph.printAdjMatrix();
    }
    
    // method makeEdge
    public void makeEdge(int to, int from)
    {
        adjacency[to][from] = 1;
        adjacency[from][to] = 1; //(για undirected graphs)
    }
    
    public int getEdge(int to, int from)
    {
        return adjacency[to][from];
    }
    
    public void printAdjMatrix()
    {
        for  (int i = 1; i<=vertices; i++)
        {
            for (int j = 1; j<= vertices; j++)
            {
                System.out.print(adjacency[i][j] + " ");
            }

            System.out.println("");
        }
    }
}
