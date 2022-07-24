package ClassTasks.dsa.test;

import ClassTasks.dsa.ArrayList;
import ClassTasks.dsa.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ListTest {
    List list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList();
    }

    @Test
    public void newListIsEmptyTest() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItem_listIsNotEmptyTest() {
        list.add("G-string");
        assertFalse(list.isEmpty());
    }

    @Test
    void addItem_removeItem_listIsEmptyTest() {
        list.add("E-string");
        list.remove("E-string");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_sizeIncreaseTest() {
        list.add("A-string");
        assertEquals(1, list.size());
    }

    @Test
    void addX_addY_sizeIsTwoTest() {
        list.add("G-string");
        list.add("A-string");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removeY_sizeIsTwoTest() {
        list.add("G-string");
        list.add("A-string");
        list.add("E-string");
        list.remove("A-string");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removeY_listNotEmpty() {
        list.add("G-string");
        list.add("A-string");
        list.add("E-string");
        list.remove("A-string");
        assertFalse(list.isEmpty());
    }

    @Test
    void addX_retrieveXTest() {
        list.add("G-string");
        String gotten = list.get(0);
        assertEquals("G-string", gotten);
    }
}
