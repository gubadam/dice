package com.gubadam.dice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {

    @GetMapping({"/d", "/d/{diceSize}"})
    public String greeting(@PathVariable(name="diceSize", required=false) Integer diceSize, Model model) {
        if (diceSize == null) diceSize = 6;

        int diceRoll = (int)(Math.random() * diceSize) + 1;
        model.addAttribute("diceSize", diceSize);
        model.addAttribute("diceRoll", diceRoll);
        return "d";
    }
/*
@ResponseBody
    @GetMapping("/d6")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home/greeting";
    }
*/
}