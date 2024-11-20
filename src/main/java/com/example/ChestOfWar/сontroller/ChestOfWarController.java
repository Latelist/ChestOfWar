package com.example.ChestOfWar.сontroller;

import com.example.ChestOfWar.model.units.Archer;
import com.example.ChestOfWar.model.units.Unit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //класс, который отвечает за прием HTTP-запросов
public class ChestOfWarController {
    @GetMapping //функция с такой аннотацией возвращает шаблон, который соответствует имени строки
    public String game() {

        Unit archer1 = new Archer("archer1");
        System.out.println(archer1.toString());

        Unit archer2 = new Archer("archer2");
        System.out.println(archer2);

        archer2.attack(archer1);
        System.out.println(archer1);
        return "game";
    }



}
