import java.util.LinkedList;

public class Graph {

    int V;
    LinkedList<Integer> adjList[];

    Graph(int V) {

        this.V = V;
        adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }

    }

    private void addEdge(int srcEdge, int destEdge) {
        adjList[srcEdge].add(destEdge);
        //adjList[destEdge].add(srcEdge);
    }

    private void printGraph() {
        for (int i = 0 ; i < V; i ++) {
            System.out.println("Adjacency list of vertex: " + i);
            for (Integer list: adjList[i]) {
                System.out.print(list+"--");
            }
            System.out.print("\n\n");
        }
    }

    private void BFS(int startVertex) {

        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        System.out.println("BFS for "+ startVertex);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur+"--");
            for (Integer adj: adjList[cur]) {
                if(!visited[adj]) {
                    visited[adj] =  true;
                    queue.add(adj);
                }
            }
        }
        System.out.println("\n");
    }

    private void DFS(int startVertex)
    {
        boolean visited[] = new boolean[V];
        System.out.println("DFS for "+ startVertex);
        DFSUtil(startVertex, visited);
        System.out.println("\n");
    }

    private void DFSUtil(int startVertex, boolean[] visited) {

        visited[startVertex] = true;
        System.out.print(startVertex+"--");
        for (Integer adj: adjList[startVertex]) {
            if(!visited[adj]) {
                DFSUtil(adj, visited);
            }
        }
    }

    public static void main(String args[])
    {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        g.BFS(0);
        g.BFS(1);
        g.BFS(2);
        g.BFS(3);
        g.BFS(4);


        g.DFS(0);
        g.DFS(1);
        g.DFS(2);
        g.DFS(3);
        g.DFS(4);

    }




}
