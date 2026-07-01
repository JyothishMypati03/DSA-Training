package com.bridgelabz.datastructures.linkedList;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
public class LinkedListTesting {

    @Test
    void test() {

        LinkedList<Integer> list = new LinkedList<>(List.of(50, 30, 70));

        assertEquals(3, list.size());
        assertEquals(50, list.get(0));
        assertEquals(30, list.get(1));
        assertEquals(70, list.get(2));
    }



}
