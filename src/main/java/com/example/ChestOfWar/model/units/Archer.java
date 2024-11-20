package com.example.ChestOfWar.model.units;

import com.example.ChestOfWar.model.units.unit_states.States;

public class Archer extends Unit{

    public Archer(String name) {
        super(name);
    }

    @Override
    public void feature() {
        System.out.println("Сожри свинца");
    }

    @Override
    public String toString() {
        if (this.state == States.ALIVE) {
            return String.format("Я лучник %s. Живой и собираюсь таким остаться.", this.name);
        } else {
            return String.format("Я лучник %s. Умер, но мне и здесь неплохо.", this.name);
        }

    }
}
