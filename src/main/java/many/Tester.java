package many;

import java.lang.reflect.Array;
import java.util.*;

public class Tester {

    public static void main(String[] args) {

        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","TMC");
        System.out.println(stocks.get("2330"));
        for(String key: stocks.keySet())
        {
            System.out.println(stocks.get(key));
        }

        // set();
        //arrayTest();
       // list();

    }

    private static void set() {
        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(8);
        set.add(4);
        set.add(1);
        set.add(5);
        System.out.println(set);
        for (int n :set)
        {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(2);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(66,88,77,54,22);
        for (int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 1;
        int s = numbers[4];
        int[] score = {88, 69, 74, 25, 65};
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }
        for (int n : score) {
            System.out.println(n);
        }
    }
}
