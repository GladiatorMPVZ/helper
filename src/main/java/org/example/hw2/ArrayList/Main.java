package org.example.hw2.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        boolean result = list.remove("Bob");
        System.out.println(list);
        System.out.println(result);

        System.out.println(list.contains("Alice"));
        System.out.println(list.contains("Bob"));

        System.out.println(list.get(1));

        list.set(0, "Jake");

        System.out.println(list);

        System.out.println(list.size());
    }
}
