package DataStructuresTest;

import DataStructures.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList<Integer> emptyList;
    private MyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        emptyList = new MyLinkedList<>();
    }

    @Test
    void addNode() {

    }

    @Test
    void addFront() {

    }

    @Test
    void deleteFront() {

    }

    @Test
    void deletePosition() {

    }

    @Test
    void get() {
        try {
            list.get(10);
            fail("Check size condition in the get method");

        } catch (IndexOutOfBoundsException e) {

        }

        try {
            list.get(-1);
            fail("Check negative number condition in the get method");
        } catch (IndexOutOfBoundsException e) {

        }

        Integer x = list.get(3);
        assertEquals((Integer)40, x, "Integer is");

        x = list.get(1);
        assertEquals((Integer)20, x, "Integer is");

    }

    @Test
    void getLast() {
        try {
            emptyList.getLast();
            fail("Check get Last method. It should throw an exception");
        } catch (NoSuchElementException e) {

        }

        Integer x = list.getLast();
        assertEquals((Integer)50, x, "Integer is");
    }

    @Test
    void insert() {

    }

    @Test
    void indexOf() {
    }

}