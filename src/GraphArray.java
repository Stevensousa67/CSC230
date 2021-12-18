import java.util.*;

class GraphArray {

    // Adding an edge to an undirected graph

    static void addEdge(ArrayList<ArrayList<Integer>> edg,
                        int u, int v) {
        edg.get(u).add(v);
        edg.get(v).add(u);
    }

    // Print the adjacent edges

    static void printGraph(ArrayList<ArrayList<Integer>> edg) {
        for (int i = 0; i < edg.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < edg.get(i).size(); j++) {
                System.out.print(" -> " + edg.get(i).get(j));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Creating a graph with 5 vertices(nodes)
        int V = 5;
        ArrayList<ArrayList<Integer>> edg
                = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            edg.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(edg, 0, 1);
        addEdge(edg, 0, 4);
        addEdge(edg, 1, 2);
        addEdge(edg, 1, 3);
        addEdge(edg, 1, 4);
        addEdge(edg, 2, 3);
        addEdge(edg, 3, 4);

        printGraph(edg);
    }
}
