package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    private final String ADDITION = "+";
    private final String SUBTRACTION = "-";
    private final String MULTIPLICATION = "*";
    private final String DIVISION = "/";
    @GetMapping
    public String show() {
        return "index";
    }
    @PostMapping("/calculator")
    public String calculator(@RequestParam("input1") double num1, @RequestParam("input2") double num2,@RequestParam String calcul, Model model) {
        double result = 0;
        switch (calcul) {
            case ADDITION:
                result = num1 + num2;
                break;
            case SUBTRACTION:
                result = num1 - num2;
                break;
            case MULTIPLICATION:
                result = num1 * num2;
                break;
            case DIVISION:
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
