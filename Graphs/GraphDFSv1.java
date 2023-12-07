import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphDFSv1 
{
    private int numVertices;
    private List<Integer>[] adjacencyLists;
    private boolean[] visited;

    public GraphDFSv1(int numVertices) 
    {
        this.numVertices = numVertices;
        adjacencyLists = (List<Integer>[]) new ArrayList[numVertices];

        for (int i = 0; i < numVertices; i++) 
        {
            adjacencyLists[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) 
    {
        adjacencyLists[u].add(v);
    }

    public void dfs(int startVertex) 
    {
        visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);

        while (!stack.isEmpty()) 
        {
            int vertex = stack.pop();

            if (!visited[vertex]) 
            {
                visited[vertex] = true;
                System.out.print(vertex + " ");

                for (int neighbor : adjacencyLists[vertex]) 
                {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        GraphDFSv1 g = new GraphDFSv1(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);

        System.out.println("Following is the DFS traversal:");

        g.dfs(0);

        System.out.println();
    }
}
