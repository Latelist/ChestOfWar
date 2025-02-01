package com.example.ChestOfWar.сontroller;

import com.example.ChestOfWar.model.board.HexagonGrid;
import com.example.ChestOfWar.model.units.Archer;
import com.example.ChestOfWar.model.units.Unit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //класс, который отвечает за прием HTTP-запросов
public class ChestOfWarController {
    @GetMapping("/game") //функция с такой аннотацией возвращает шаблон, который соответствует имени строки
    public String game(Model model) {


        Unit archer1 = new Archer("archer1", new int[]{0, 0});
        System.out.println(archer1.toString());

        Unit archer2 = new Archer("archer2", new int[]{0, 0});
        System.out.println(archer2);

        archer2.attack(archer1);
        System.out.println(archer1);



        model.addAttribute("unit", archer1);


        return "game";
    }
    @GetMapping("/game-board")
    public String showGameBoard(Model model) {
//        HexagonGrid board = new HexagonGrid();
//        String coordinatesJson = board.toGson(board.gridToArray(board.hexagons));
        return "game-board";
    }

    @GetMapping("/api/coordinates")
    @ResponseBody
    public String getCoordinatesJson() {
        HexagonGrid board = new HexagonGrid();
        return board.toGson(board.gridToArray(board.hexagons));
    }



}
