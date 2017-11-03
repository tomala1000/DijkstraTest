package MyDijkstra;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Vertex wroclaw = new Vertex("Wrocław");
        Vertex lodz = new Vertex("Lódź");
        Vertex warszawa = new Vertex("Warszawa");
        Vertex katowice = new Vertex("Katowice");
        Vertex poznan = new Vertex("Poznan");
        Vertex krakow = new Vertex("Krakow");
        Vertex gdansk = new Vertex("Gdansk");
        Vertex gdynia = new Vertex("Gdynia");

        Vertex newYork = new Vertex("NewYork");
        Vertex boston = new Vertex("Boston");

        ArrayList<Vertex> vertexList = new ArrayList<>();
        vertexList.add(wroclaw);
        vertexList.add(lodz);
        vertexList.add(katowice);
        vertexList.add(poznan);
        vertexList.add(krakow);
        vertexList.add(gdansk);
        vertexList.add(gdynia);
        vertexList.add(newYork);
        vertexList.add(boston);

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

        for (Vertex vertex : vertexList) {
            System.out.println(vertex);

        }



        //Vertex koniec = wroclaw.getEdges().get(0).other(wroclaw);
       // System.out.println(koniec);

    }
}




