package dev.teddy.com.shoolwork._12.wk1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class _JunitTest_Stack {
    @Test
    void testPushAndPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        assertEquals("A", stack.peek());
        stack.push("B");
        assertEquals("B", stack.peek());
    }

    @Test
    void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPopOnEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.pop(), "Pop auf leerem Stack soll null liefern");
    }

    @Test
    void testPeekOnEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.peek(), "Peek auf leerem Stack soll null liefern");
    }

    @Test
    void testIsEmpty() {
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());

        stack.push("Test");
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testLifoOrder() {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        assertEquals("3", stack.pop());
        assertEquals("2", stack.pop());
        assertEquals("1", stack.pop());
    }

    @Test
    void testPushNullValue() {
        Stack<String> stack = new Stack<>();
        stack.push(null);

        assertNull(stack.peek());
        assertNull(stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testMultipleOperationsMixed() {
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.isEmpty());

        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.peek());

        stack.pop();
        assertEquals(5, stack.peek());

        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(5, stack.pop());

        assertTrue(stack.isEmpty());
    }

    @Test
    void testStackWithEmployeeObjects() {
        Stack<Stack_Employee> stack = new Stack<>();

        Stack_Employee e1 = new Stack_Employee("Alice", 1);
        Stack_Employee e2 = new Stack_Employee("Bob", 2);
        Stack_Employee e3 = new Stack_Employee("Charlie", 3);

        stack.push(e1);
        stack.push(e2);
        stack.push(e3);

        // LIFO
        assertEquals(e3, stack.peek());
        assertEquals(e3, stack.pop());
        assertEquals(e2, stack.pop());
        assertEquals(e1, stack.pop());

        assertTrue(stack.isEmpty());
    }
}
