import java.util.Scanner;

public class djikstras {
    
    
    int minDistance(int dist[], Boolean visited[], int V)
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
 
        for (int v = 0; v < V; v++)
            if (visited[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed distance array
    void printSolution(int dist[], int V)
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }
 
   
    void dijkstra(int graph[][], int src, int V)
    {
        int dist[] = new int[V]; 
       
        Boolean visited[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
          
            int u = minDistance(dist, visited, V);
 
            // Mark the picked vertex as processed
            visited[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)
 
             
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
        // print the constructed distance array
        printSolution(dist, V);
    }
 
    // Driver method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the number of Edges: ");
        int e = sc.nextInt();
        //  Let us create the example graph discussed above 
        int graph[][] = new int[V][V];
        System.out.println("Enter the elements of adjacency matrix according to graph: ");
        
        for(int j = 0; j<e; j++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph[v1][v2] = sc.nextInt();
        }
        
        sc.close();
        djikstras t = new djikstras();
        t.dijkstra(graph, 0, V);
    }
}