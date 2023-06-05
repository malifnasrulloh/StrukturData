import java.util.*;

public class BFSTranversal {
    private Integer node;
    private LinkedList<Integer>[] adj;
    private Queue<Integer> queue;

    public BFSTranversal(int size){
        node = size;
        adj = new LinkedList[node];
        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }
    public void insertEdge(int src, int dest){
        adj[src].add(dest);
    }
    public void BFS(int vertex){
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[vertex] = true;
        queue.add(vertex);
        while(queue.size() != 0){
            vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < adj[vertex].size(); i++) {
                a = adj[vertex].get(i);
                if(!nodes[a]){
                    nodes[a] = true;
                    queue.add(a);   
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSTranversal graph = new BFSTranversal(6);

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);

        System.out.println("Breadth First Traversal for the graph is:");
        graph.BFS(0);
    }
}
