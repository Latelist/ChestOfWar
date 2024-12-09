package com.example.ChestOfWar.model.board;
import java.util.ArrayList;
import java.util.List;

public class HexagonGrid {
    public List<EisensteinInteger> hexagons;

    // Конструктор для инициализации
    public HexagonGrid(int rows, int cols, double size) {
        this.hexagons = generateHexagonGrid(rows, cols, size);
    }

    // Метод для генерации шестиугольной решетки
    public List<EisensteinInteger> generateHexagonGrid(int rows, int cols, double size) {
        // Смещения для соседей по числам Эйзенштейна
        EisensteinInteger[] directions = {
                new EisensteinInteger(1, 0),  // Направление вправо
                new EisensteinInteger(-1, 1), // Направление влево-вверх
                new EisensteinInteger(0, 1),  // Направление вверх
                new EisensteinInteger(1, 1),  // Направление вправо-вверх
                new EisensteinInteger(1, -1), // Направление вправо-вниз
                new EisensteinInteger(0, -1)  // Направление вниз
        };

        List<EisensteinInteger> hexagons = new ArrayList<>();

        // Центральная точка (0, 0) будет центром первого шестиугольника
        EisensteinInteger center = new EisensteinInteger(0, 0);
        hexagons.add(center); // Добавляем центральный шестиугольник

        // Генерация координат для всех шестиугольников на поле
        // Используем размеры поля (rows и cols)
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Начинаем от центральной точки
                EisensteinInteger currentHex = center;

                // Смещение по строкам и столбцам
                // Смещения по x и y зависят от позиции в сетке
                EisensteinInteger offset = new EisensteinInteger(col, row);

                // Применяем смещение для каждого шестиугольника в поле
                currentHex = currentHex.add(offset);

                // Добавляем вычисленную точку в список
                hexagons.add(currentHex);
            }
        }

        return hexagons;
    }

    @Override
    public String toString() {
        return "HexagonGrid{" +
                "hexagons=" + hexagons +
                '}';
    }
}
