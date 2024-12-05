package com.example.ChestOfWar.сontroller;

import com.example.ChestOfWar.model.units.Archer;
import com.example.ChestOfWar.model.units.Unit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        int rows = 1;
        int cols = 1;

        model.addAttribute("rows", rows);
        model.addAttribute("cols", cols);

        int row = 0;
        int col = 0;

        model.addAttribute("row", row);
        model.addAttribute("col", col);

        int rowOffset = 52;
        model.addAttribute("rowOffset", rowOffset);

        int cellSize = 50;
        model.addAttribute("cellSize", cellSize);

        int xOffset = 0;
        model.addAttribute("xOffset", xOffset);

        return "game-board";
    }



}
