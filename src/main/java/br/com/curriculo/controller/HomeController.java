package br.com.curriculo.controller;

import br.com.curriculo.model.Curriculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping
    public ModelAndView home( ){
        Curriculo cr = new Curriculo();

        ModelAndView mv = new ModelAndView("home");
        mv.addObject("curriculo",cr);

        return mv;
    }
}
