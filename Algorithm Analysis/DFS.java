import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    LinkedList<Integer> adj[];
    int V;

    @SuppressWarnings("unchecked")
    DFS(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void search(int s, boolean[] visited) {

        visited[s] = true;
        System.out.println(s);

        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();

            if (!visited[n]) {
                visited[n] = true;
                search(n, visited);
            }
        }
    }

    void init(int s) {
        boolean[] visited = new boolean[V];

        search(s, visited);
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 2);

        dfs.init(0);
    }
}
