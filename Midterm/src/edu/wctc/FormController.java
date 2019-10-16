package edu.wctc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "form";
    }

    @RequestMapping("/processForm")
    public String doSomething(HttpServletRequest request,
                              Model model) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");

        String avatar = request.getParameter("avatar");
        avatar = avatar.toUpperCase();
        String img = "resources/img/default.jpg";
        switch (avatar) {
            case "CAT":
                img = "resources/img/cat.png";
                break;
            case "DEER":
                img = "resources/img/deer.png";
                break;
            case "MONKEY":
                img = "resources/img/monkey.png";
                break;
            case "RACCOON":
                img = "resources/img/raccoon.png";
                break;
        }

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("username", username);
        model.addAttribute("img", img);

        return "form-result";
    }
}
