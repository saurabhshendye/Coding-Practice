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
    void add() {

    }

    @Test
    void addFront() {
        list.addFront(0);
        Integer x =  list.get(0);
        assertEquals((Integer)0, x, "Integer is");
        assertEquals(6,  list.size, "Size is");
    }

    @Test
    void deleteFront() {
        list.deleteFront();

        Integer x = list.get(0);
        assertEquals((Integer)20, x, "First number should be");
        assertEquals(4, list.size, "Size of the list");
    }

    @Test
    void deletePosition() {
        list.deletePosition(3);

        Integer x = list.get(3);
        assertEquals((Integer)50, x, "New element at this position");
        assertEquals(4, list.size, "Expected Size");
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