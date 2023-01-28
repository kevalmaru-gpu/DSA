import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int a, b, w;

    public int compareTo(Edge comparedEdge){
        return this.w - comparedEdge.w;
    }
}

class Graph{
    int V, E;
    Edge[] edges;

    Graph(int v, int e){
        V = v;
        E = e;
        edges = new Edge[E];

        for (int i=0; i<E; i++){
            edges[i] = new Edge();
        }
    }

    void print(){
        for (int e=0; e<E; e++){
            System.out.printf("%d\t%d\t%d\n", edges[e].a, edges[e].b, edges[e].w);
        }
    }

    void MST(){
        Arrays.sort(edges);
    }
}

public class Krushkal{
    public static void main(String[] args) {
        Graph graph = new Graph(3, 2);

        graph.edges[0].a = 0;
        graph.edges[0].b = 1;
        graph.edges[0].w = 5;

        graph.edges[1].a = 0;
        graph.edges[1].b = 2;
        graph.edges[1].w = 4;

        graph.MST();
        graph.print();
    }
}