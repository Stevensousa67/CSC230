import java.util.*;

//Traversing a graph Depth First Traversal
class GraphDFT {
    private int Vertices;   // No. of vertices 

    // adjacency list declaration
    private LinkedList<Integer> adj_list[];

    // graph Constructor: to initialize adjacency lists as per no of vertices 
    GraphDFT(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }

    //add an edge to the graph 
    void addEdge(int v, int w) {
        adj_list[v].add(w);  // Add w to v's list. 
    }

    // helper function for DFS technique
    void DFS_helper(int v,boolean visited[]) {
        // current node is visited 
        visited[v] = true;
        System.out.print(v+" ");

        // process all adjacent vertices 
        Iterator<Integer> i = adj_list[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }


    void DFT(int v) {
        //initially none of the vertices are visited 
        boolean visited[] = new boolean[Vertices];

        // call recursive DFS_helper function for DFS technique 
        DFS_helper(v, visited);
    }
}
class Main{
    public static void main(String args[])
    {
        //create a graph object and add edges to it
        GraphDFT g = new GraphDFT(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        //print the DFS Traversal sequence  try running this with different starting points
        System.out.println("Depth First Traversal for given graph"+
                "(with 0 as starting vertex)");
        g.DFT(0);
    }
}