import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    LinkedList<Integer> adj[];
    int V;

    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void search(int currentNode) {
        boolean[] visitedNode = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(currentNode);
        visitedNode[currentNode] = true;

        while (!queue.isEmpty()) {
            int p = queue.poll();

            System.err.println(p);

            Iterator<Integer> i = adj[p].listIterator();

            while (i.hasNext()) {
                int m = i.next();
                if (!visitedNode[m]) {
                    visitedNode[m] = true;
                    queue.add(m);
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(3, 1);

        g.search(2);
    }
}
