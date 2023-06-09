package org.example.hw2.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
