package org.example.hw2.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");

        System.out.println("List size: " + list.size());

        System.out.println("List elements:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Eve: " + list.indexOf("Eve"));

        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add("Eve", 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
