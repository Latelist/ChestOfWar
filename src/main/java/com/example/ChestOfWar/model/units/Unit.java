package com.example.ChestOfWar.model.units;

import com.example.ChestOfWar.model.units.unit_interfaces.UnitInterface;
import com.example.ChestOfWar.model.units.unit_states.States;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

public abstract class Unit implements UnitInterface {
    private static int nextID = 0;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int ID;
    @Getter
    @Setter
    private int move;
    @Getter
    @Setter
    private int live;
    @Getter
    @Setter
    private States state;
    @Getter
    @Setter
    private int[] coordinates;

    public Unit(String name, int[] coordinates) {
        this.ID = nextID++;
        this.name = name;
        this.move = 1;
        this.live = 1;
        this.state = States.ALIVE;
        this.coordinates = coordinates;
    }

    public void attack(@NotNull Unit unit) {
        unit.live -= 1;
        unit.die();
    }

    public void die() {
        if (this.live == 0) {
            this.state = States.DEAD;
        }
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Unit)) return false;
        final Unit other = (Unit) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getMove() != other.getMove()) return false;
        if (this.getLive() != other.getLive()) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        if (!java.util.Arrays.equals(this.getCoordinates(), other.getCoordinates())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Unit;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getMove();
        result = result * PRIME + this.getLive();
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        result = result * PRIME + java.util.Arrays.hashCode(this.getCoordinates());
        return result;
    }

    public String toString() {
        return "Unit(name=" + this.getName() + ", move=" + this.getMove() + ", live=" + this.getLive() + ", state=" + this.getState() + ", coordinates=" + java.util.Arrays.toString(this.getCoordinates()) + ")";
    }

}



