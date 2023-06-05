import java.util.Iterator;
import java.util.LinkedList;

public class DFSTranversal {
    private LinkedList<Integer>[] adj;
    private boolean[] visited;

    public DFSTranversal(int size){
        adj = new LinkedList[size];
        visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int src, int dest){
        adj[src].add(dest);
    }

    public void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> iterator = adj[vertex].listIterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n]){
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        DFSTranversal graph = new DFSTranversal(8);
        
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);

        System.out.println("Depth First Traversal for the graph is:");
        graph.DFS(0);
    }
}
