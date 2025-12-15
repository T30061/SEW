package dev.teddy.com.shoolwork._12.wk1;

public class Stack_Employee {
    private String name;
    private int id;

    public Stack_Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}
