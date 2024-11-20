package com.example.ChestOfWar.model.units;

import com.example.ChestOfWar.model.units.unit_interfaces.UnitInterface;
import com.example.ChestOfWar.model.units.unit_states.States;

public abstract class Unit implements UnitInterface {
    String name;
    int move;
    int live;
    States state;

    public Unit(String name) {
        this.name = name;
        this.move = 1;
        this.live = 1;
        this.state = States.ALIVE;
    }

    public void attack(Unit unit) {
        unit.live -= 1;
        unit.die();
    }

    public void die() {
        if (this.live == 0) {
            this.state = States.DEAD;
        }
    }
}



