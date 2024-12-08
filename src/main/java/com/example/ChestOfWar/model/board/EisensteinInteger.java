package com.example.ChestOfWar.model.board;

public class EisensteinInteger {
    int a, b; // a + b * w

    EisensteinInteger(int a, int b) {
        this.a = a;
        this.b = b;
    }

    EisensteinInteger add(EisensteinInteger other) {
        return new EisensteinInteger(this.a + other.a, this.b + other.b);
    }

    EisensteinInteger multiply(int scalar) {
        return new EisensteinInteger(this.a * scalar, this.b * scalar);
    }

    @Override
    public String toString() {
        return a + " + " + b + "w";
    }
}
