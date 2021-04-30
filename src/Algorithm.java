
import java.util.LinkedList;

public class Algorithm {

    int[][] graph;
    private static int numVertices; // Number of vertices in graph

    public boolean bfs(int[][] residualGraph, int source, int sink, int[] parent) {
        LinkedList<Integer> queue = new LinkedList<>(); // queue like structure
        boolean[] visited = new boolean[numVertices]; // keeps track of visited vertices
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        for (int i = 0; i < numVertices; ++i) {
            visited[i] = false;
        }

        // Standard BFS Loop- looping through all vertices
        while (!queue.isEmpty()) {
            int u = queue.poll();
            // checks neighbours in vertex u
            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && (residualGraph[u][v] > 0)) {
                    // if not visited and is a positive value, visit
                    if (v == sink) {
                        parent[v] = u; // since sink is found, returns true and exits
                        return true;
                    }
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return false; // we sink wasn't reached, returns false
    }

    // Returns max flow from S to T in a graph
    public int fordFulkerson(Passer passer, int source, int sink) {
        graph = passer.getGraph();
        numVertices = passer.getNumNodes();
        int[][] residualGraph = new int[numVertices][numVertices];
        int[] parent = new int[numVertices];
        int maxFlow = 0;

        for (int n = 0; n < numVertices; n++) {
            for (int i = 0; i < numVertices; i++) {
                residualGraph[n][i] = graph[n][i];
            }
        }

        // Augment the flow while a path from source to sink exists
        while (bfs(residualGraph, source, sink, parent)) {

            float pathFlow = Float.MAX_VALUE; // to store the path flow
            for (int i = sink; i != source; i = parent[i]) {
                pathFlow = Math.min(pathFlow, residualGraph[parent[i]][i]);
            }

            // Update residual capacities of the edges and reverse edges along the path
            for (int i = sink; i != source; i = parent[i]) {
                residualGraph[parent[i]][i]-= pathFlow;
                residualGraph[i][parent[i]]+= pathFlow;

                System.out.println(+parent[i] + " -> " + i + " | Capacity = " + residualGraph[i][parent[i]] + " | Flow = " + pathFlow);
            }

            maxFlow+= pathFlow; // Add the path flow to overall flow
        }

        return maxFlow; // Returns the overall flow
    }

}
