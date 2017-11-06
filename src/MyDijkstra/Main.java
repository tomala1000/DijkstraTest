package MyDijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Vertex wroclaw = new Vertex("Wrocław");
        Vertex lodz = new Vertex("Łódź");
        Vertex warszawa = new Vertex("Warszawa");
        Vertex katowice = new Vertex("Katowice");
        Vertex poznan = new Vertex("Poznan");
        Vertex krakow = new Vertex("Krakow");
        Vertex gdansk = new Vertex("Gdansk");
        Vertex gdynia = new Vertex("Gdynia");

        Vertex newYork = new Vertex("NewYork");
        Vertex boston = new Vertex("Boston");


        List<Vertex> citiesList = Arrays.asList(wroclaw, lodz, warszawa, katowice, poznan, krakow, gdansk, gdynia, newYork, boston);
        ArrayList<Vertex> vertexList = new ArrayList<>();

        wroclaw.link(lodz, 216.8f);
        wroclaw.link(poznan, 184.4f);
        wroclaw.link(katowice, 194.5f);
        krakow.link(katowice, 80.36f);
        krakow.link(warszawa, 294.8f);
        krakow.link(lodz, 217.8f);
        lodz.link(warszawa, 139.1f);
        poznan.link(lodz, 217.8f);
        poznan.link(gdansk, 337.9f);
        lodz.link(gdansk, 336.9f);
        warszawa.link(gdansk, 417.4f);
        gdynia.link(gdansk, 22.4f);
        boston.link(newYork, 337.9f);



//        for (Vertex city : citiesList) {
//            System.out.println("lista połączeń z " + city + " to : ");
//            for (Edge e : city.getEdges()) {
//                System.out.println("początek : " + e.getVertices()[0] + ", koniec to : " +
//                        e.getVertices()[1] + ", wartość : " + e.getValue());
//            }
//                          }
//
        Graph Cities = new Graph (citiesList);

       Dijkstra newDij = new Dijkstra();
        System.out.println("droga z katowic do warszawy to : "+newDij.calculate(Cities, katowice, warszawa));


        System.out.println("d. to : "+warszawa.getWay().size());

        for (String A : warszawa.way){
            System.out.println(A);
        }
    }


}

