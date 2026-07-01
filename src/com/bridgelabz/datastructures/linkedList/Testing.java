package com.bridgelabz.datastructures.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    void testSearchNode() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        assertTrue(list.search(30));
    }

    @Test
    void testSearchNodeNotFound() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        assertFalse(list.search(100));
    }





}
