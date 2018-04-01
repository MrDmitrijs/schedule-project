package lv.sandbox.conferenceschedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@SuppressWarnings("unused")
class HelloWorldController {

    private static final String HOME_VIEW = "Home";

    @RequestMapping
    String home() {
        return HOME_VIEW;
    }

    @RequestMapping("/dimon")
    @ResponseBody
    String dimon() {
        return "Dimon Limon!";
    }

    @RequestMapping("/artur")
    @ResponseBody
    String artur() {
        return "Artur Perdun!";
    }
}
