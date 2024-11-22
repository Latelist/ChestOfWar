package com.example.ChestOfWar.model.units;

import com.example.ChestOfWar.model.units.unit_states.States;

public class Archer extends Unit{

    public Archer(String name, int[] coordinates) {
        super(name, coordinates);
    }

    @Override
    public void feature() {
        System.out.println("Сожри свинца");
    }

    @Override
    public String toString() {
        if (this.getState() == States.ALIVE) {
            return String.format("Я лучник %s c ID %d. Живой и собираюсь таким остаться.", this.getName(), this.getID());
        } else {
            return String.format("Я лучник %s c ID %d. Умер, но мне и здесь неплохо.", this.getName(), this.getID());
        }

    }
}
