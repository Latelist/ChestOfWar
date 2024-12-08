package com.example.ChestOfWar.model.board;
import java.util.ArrayList;
import java.util.List;

public class HexagonGrid {

    public List<EisensteinInteger> generateHexagonGrid(int rows, int cols, double size) {
            // Расстояния между соседними шестиугольниками
            // В шестиугольной сетке для каждого шестиугольника нужно учитывать координаты соседей
            // Обычный сдвиг для шестиугольников с учетом чисел Эйзенштейна

            // Смещения по числам Эйзенштейна для соседей
            EisensteinInteger[] directions = {
                    new EisensteinInteger(1, 0),  // Направление вправо
                    new EisensteinInteger(-1, 1), // Направление влево-вверх
                    new EisensteinInteger(0, 1),  // Направление вверх
                    new EisensteinInteger(1, 1),  // Направление вправо-вверх
                    new EisensteinInteger(1, -1), // Направление вправо-вниз
                    new EisensteinInteger(0, -1)  // Направление вниз
            };

            List<EisensteinInteger> hexagons = new ArrayList<>();

            // Центр первого шестиугольника
            EisensteinInteger center = new EisensteinInteger(0, 0);
            hexagons.add(center);

            // Генерация координат шестиугольников в поле
            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    // Для каждой ячейки создаем шестиугольник, смещая от центра
                    // Начинаем от центральной точки и двигаемся вдоль направлений
                    EisensteinInteger currentHex = center;

                    // Для каждого шестиугольника добавляем смещения в зависимости от его положения
                    for (int dir = 0; dir < 6; dir++) {
                        EisensteinInteger shift = directions[dir].multiply(row);
                        currentHex = currentHex.add(shift);
                        hexagons.add(currentHex);
                    }
                }
            }
            return hexagons;
        }
}
