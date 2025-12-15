package dev.teddy.com.shoolwork._12.wk1;

public class _Main_Stack {
    public static void main(String[] args) {
        Stack<Stack_Employee> employeeStack = new Stack<>();//new stack
        Stack_Employee e1 = new Stack_Employee("Alice", 101);
        Stack_Employee e2 = new Stack_Employee("Bob", 102);//stack Employee
        Stack_Employee e3 = new Stack_Employee("Charlie", 103);

        employeeStack.push(e1);//push new Stack_Employee on Stack
        employeeStack.push(e2);
        employeeStack.push(e3);//oberste

        System.out.println("Peek: " + employeeStack.peek());
        System.out.println("Pop: " + employeeStack.pop());//output
        System.out.println("Pop: " + employeeStack.pop());
        System.out.println("Peek nach zwei Pops: " + employeeStack.peek());
        System.out.println("Pop: " + employeeStack.pop());
        System.out.println("Peek nach drei Pops: " + employeeStack.peek());
    }
}
