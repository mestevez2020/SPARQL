package com.example.sparql;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class AppController implements ErrorController {
    @GetMapping("/")
    public String menu() {
        System.out.println("HELOOO");
        return "home";
    }

    @ExceptionHandler
    public String handleException(Model model, Exception ex, HttpServletRequest request) {
        return "home.htmlll";
    }
}
