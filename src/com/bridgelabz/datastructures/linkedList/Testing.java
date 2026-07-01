package com.bridgelabz.datastructures.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    void testDeleteNode() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        list.delete(40);

        assertFalse(list.search(40));
    }

    @Test
    void testSize() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        list.delete(40);

        assertEquals(3, list.size());
    }




}
