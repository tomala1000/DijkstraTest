package MyDijkstra;

import java.util.*;

// with streams:
// set.stream().forEach(v -> v.setCalculatedDistance(Float.MAX_VALUE));
// from.setCalculatedDistance(0);

public class Dijkstra {

    public float calculate(Graph graph, Vertex from, Vertex to) {

        Set<Vertex> vertices = new HashSet<>(graph.getVertices());

        for (Vertex v : vertices) {
            if (v != from) {
                v.setCalculatedDistance(Float.MAX_VALUE);
            } else v.setCalculatedDistance(0);
        }

        // with streams:
        // set.stream().forEach(v -> v.setCalculatedDistance(Float.MAX_VALUE));
        // from.setCalculatedDistance(0);


        Queue<Vertex> queue = new PriorityQueue<>(vertices);

        from.setWay(Arrays.asList(from.name()));

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            for (Edge e : current.getEdges()) {
                Vertex next = e.other(current);
                float distance = current.getCalculatedDistance() + e.getValue();
                if (distance < next.getCalculatedDistance()) {
                    next.setCalculatedDistance(distance);

                //    next.way.add(current.name());

                    List<String> tempWay = new ArrayList<String>(current.getWay());
                    tempWay.add(next.name());
                    next.setWay(tempWay);

//                    System.out.println(current.name());v
//                   next.wayQ.add(current.name());

                    queue.remove(next);
                    queue.add(next);
                }
            }
          //  to.way.add(to.name());
        }
        return to.getCalculatedDistance();
    }
}




