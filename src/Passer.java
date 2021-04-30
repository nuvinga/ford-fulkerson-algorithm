import java.io.File;
import java.util.Scanner;

public class Passer {

    int[][] graph;
    int numNodes;

    public Passer(String path) {
        File file = new File(path);
        try{
            Scanner reader = new Scanner(file);
            numNodes = Integer.parseInt(reader.nextLine());
            graph = new int[numNodes][numNodes];
            // initializing graph for all zeros
            for (int i = 0; i < numNodes; i++) {
                for (int n = 0; n < numNodes; n++) {
                    graph[i][n] = 0;
                }
            }

            while (reader.hasNextLine()) {
                String[] nodeInfo = reader.nextLine().split("\\s+");
                graph[Integer.parseInt(nodeInfo[0])][Integer.parseInt(nodeInfo[1])] = Integer.parseInt(nodeInfo[2]);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getNumNodes() {
        return numNodes;
    }

    public int[][] getGraph() {
        return graph;
    }


}
