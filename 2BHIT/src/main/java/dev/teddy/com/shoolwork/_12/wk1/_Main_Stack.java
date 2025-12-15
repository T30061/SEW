package dev.teddy.com.shoolwork._12.wk1;

import dev.teddy.com.shoolwork._11.wk1.wk1.Mitarbeiter;

public class _Main_Stack {
    public static void main(String[] args) {
        Stack<Object> employeeStack = new Stack<>();//new stack
        Mitarbeiter m1 = new Mitarbeiter("Bob", 21321, 12);
        Mitarbeiter m2 = new Mitarbeiter("Bob1", 21821, 22);
        Mitarbeiter m3 = new Mitarbeiter("Bob2", 21721, 32);
        Mitarbeiter m4 = new Mitarbeiter("Bob3", 21521, 42);
        Manager ma1 = new Manager("Tim",321521312,1251251, 1);

        employeeStack.push(m1);//push new Stack_Employee on Stack
        employeeStack.push(m2);
        employeeStack.push(m4);
        employeeStack.push(m3);//oberste
        employeeStack.push(ma1);//oberste

        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop().toString());
        }

    }
}
