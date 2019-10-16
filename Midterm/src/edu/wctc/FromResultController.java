package edu.wctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FromResultController {

    @RequestMapping("/showMainMenu")
    public String showMainMenu() {
        return "main-menu";
    }
}
