package com.example.ChestOfWar.model.board;

public class EisensteinInteger {
    public int a, b;// a + b * w
    public static int currentid;
    public int id;

    EisensteinInteger(int a, int b) {
        this.a = a;
        this.b = b;

        this.id = currentid++;
    }

    EisensteinInteger add(EisensteinInteger other) {
        return new EisensteinInteger(this.a + other.a, this.b + other.b);
    }

    EisensteinInteger multiply(int scalar) {
        return new EisensteinInteger(this.a * scalar, this.b * scalar);
    }

    @Override
    public String toString() {
        return "{" + "\"x\": " + a + ", \"y\": " + b + "}";
    }
}
