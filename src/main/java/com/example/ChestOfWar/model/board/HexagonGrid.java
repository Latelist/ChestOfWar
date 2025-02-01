package com.example.ChestOfWar.model.board;
import java.util.*;
import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
//идея: может сделать не круглую сетку, а с нормальным количеством ячеек типа прямоугольную?
//А ненужные ячейки выпилить потом?
public class HexagonGrid {
    public ArrayList<EisensteinInteger> hexagons;

    // Конструктор для инициализации
    public HexagonGrid() {
        this.hexagons = new ArrayList<EisensteinInteger>();
        generateHexagonGrid(hexagons);
    }

    public void generateHexagonGrid(ArrayList<EisensteinInteger> hexagons) {
        hexagons.add(new EisensteinInteger(0,0));
        hexagons.add(new EisensteinInteger(1,0));
        hexagons.add(new EisensteinInteger(0,1));
        hexagons.add(new EisensteinInteger(-1,1));
        hexagons.add(new EisensteinInteger(-1,0));
        hexagons.add(new EisensteinInteger(0,-1));
        hexagons.add(new EisensteinInteger(1,-1));
        hexagons.add(new EisensteinInteger(2,0));
        hexagons.add(new EisensteinInteger(2,1));
        hexagons.add(new EisensteinInteger(1,1));
        hexagons.add(new EisensteinInteger(0,2));
        hexagons.add(new EisensteinInteger(-1,2));
        hexagons.add(new EisensteinInteger(-2,1));
        hexagons.add(new EisensteinInteger(-2,0));
        hexagons.add(new EisensteinInteger(-2,-1));
        hexagons.add(new EisensteinInteger(-1,-1));
        hexagons.add(new EisensteinInteger(0,-2));
        hexagons.add(new EisensteinInteger(1,-2));
        hexagons.add(new EisensteinInteger(2,-1));
        hexagons.add(new EisensteinInteger(3,0));
        hexagons.add(new EisensteinInteger(3,1));
        hexagons.add(new EisensteinInteger(2,2));
        hexagons.add(new EisensteinInteger(0,-1));
        hexagons.add(new EisensteinInteger(1,2));
        hexagons.add(new EisensteinInteger(0,3));
        hexagons.add(new EisensteinInteger(-1,3));
        hexagons.add(new EisensteinInteger(-2,2));
        hexagons.add(new EisensteinInteger(-3,2));
        hexagons.add(new EisensteinInteger(-3,1));
        hexagons.add(new EisensteinInteger(-3,0));
        hexagons.add(new EisensteinInteger(-3,-1));
        hexagons.add(new EisensteinInteger(-2,-2));
        hexagons.add(new EisensteinInteger(-1,-2));
        hexagons.add(new EisensteinInteger(0,-3));
        hexagons.add(new EisensteinInteger(1,-3));
        hexagons.add(new EisensteinInteger(2,-2));
        hexagons.add(new EisensteinInteger(3,-2));
        hexagons.add(new EisensteinInteger(3,-1));
    }

    @Override
    public String toString() {
        Gson gson = new Gson();

        return gson.toJson(this.hexagons);
    }

    public ArrayList<int[]> gridToArray(ArrayList<EisensteinInteger> hexagons) {
        ArrayList<int[]> coordinateArray = new ArrayList<>();
        for (EisensteinInteger hexagon : hexagons) {
            int[] coordinates = new int[2];
            coordinates[0] = hexagon.a;
            coordinates[1] = hexagon.b;
            coordinateArray.add(coordinates);
        }
        return coordinateArray;
    }

    public String toGson(ArrayList<int[]> coordinateArray) {
        Gson gson = new Gson();
        return gson.toJson(coordinateArray);
    }

}
