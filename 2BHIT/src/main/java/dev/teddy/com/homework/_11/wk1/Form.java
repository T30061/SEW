package dev.teddy.com.homework._11.wk1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Form {
    protected double x;
    protected double y;

    @Override
    public String toString() {
        return "Form{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
