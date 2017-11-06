package MyDijkstra;

import java.util.*;

public class Vertex implements Comparable<Vertex> {

    private final List<Edge> edges = new ArrayList<>();
    private final String name;
    private float value;
    private float calculatedDistance;

    public List<String> way = new ArrayList<String>();

    public List<String> getWay() {
        return way;
    }

    public void setWay(List<String> way) {
        this.way = way;
    }


    public Vertex(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void link(Vertex other, float value) {
        Edge edge = new Edge(this, other, value);
        edges.add(edge);
        other.edges.add(edge);
    }

    public float getCalculatedDistance() {
        return calculatedDistance;
    }

    public void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    @Override
    public int compareTo(Vertex o) {
        return Float.compare(value, o.value);
    }

    @Override
    public String toString() {
        return name;
    }
}
