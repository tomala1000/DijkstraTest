package MyDijkstra;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Vertex> vertices;

    public Graph(List vertices) {
        if (vertices == null) {
            throw new IllegalArgumentException("Vertices cannot be null");
        }
        this.vertices = vertices;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List vertices(){
        return vertices;
}




    }

    ;


