package Zadania;

import java.util.*;

public class main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        List<String> listaString = Arrays.asList("Antek", "Wiesiek", "Stefan", "maniek", "jacek", "Józek", "edgar", "babcia gienia");
        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("pierwszy", "Alojzy");
        myMap.put("drugi", "Bolek");
        myMap.put("trzeci", "Celestyn");
        myMap.put("czwarty", "Daniel");
        myMap.put("piąty", "Patryk");

        System.out.println(listaString);

        int N;

        for (int i = 1; i < 100; i++) {
            lista.add(i);
        }

        System.out.println(sortBy3(lista));

        N = 5;
        System.out.println("sortowanie co N-tego elementu dla N=" + N + sortByN(lista, N));
        N = 12;
        System.out.println("sortowanie co N-tego elementu dla N=" + N + sortByN(lista, N));

        System.out.println("sortowanie elementów mniejszych od N=" + N + sortBiggerThanN(lista, N));

        System.out.println("sortowanie elementów bez dużych liter : " + sortWithoutBiggerLetters(listaString));

        System.out.println("wartość logiczna zamiany listy na zbiór to :" + DoubleElement(listaString));

        System.out.println(myMap);
        System.out.println(reverseMap(myMap));
    }


    public static List sortBy3(List<Integer> list) {

        List<Integer> retLista = new ArrayList<>();
        for (int i = 0; i < (list.size()); i += 3) {
            retLista.add(list.get(i));

            //  System.out.println(list.get(i));

        }
        return retLista;
    }

    public static List sortByN(List<Integer> list, int n) {

        List<Integer> retLista = new ArrayList<>();
        for (int i = 0; i < (list.size()); i += n) {
            retLista.add(list.get(i));
            ;
            //   System.out.println(list.get(i));

        }
        return retLista;
    }

    public static List sortBiggerThanN(List<Integer> list, int n) {

        List<Integer> retLista = new ArrayList<>();
        for (int i = 0; i < (list.size()); i++) {
            if (list.get(i) < n) retLista.add(list.get(i));
        }
        return retLista;
    }

    public static List sortWithoutBiggerLetters(List<String> list) {


        boolean has = false;
        List<String> retLista = new ArrayList<>();
        for (int i = 0; i < (list.size()); i++) {

            char[] charArray = list.get(i).toCharArray();
            has = false;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] >= 'A' & charArray[j] <= 'Z') {
                    has = true;
                }
            }
            if (!has) retLista.add(list.get(i));
        }
        return retLista;
    }

    public static boolean DoubleElement(List<String> list) {

        Set<String> set = new HashSet<String>(list);

        if (set.size() != list.size()) return false;
        return true;
    }

    public static Map <String, String> reverseMap(Map <String, String> map) {
        Map<String, String> temp = new HashMap<String, String>();

        for (String key : map.keySet()){
            String elem = map.get(key);

            temp.put(elem, key);
            }
        return temp ;
    }
}

