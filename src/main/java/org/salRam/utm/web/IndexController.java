package org.salRam.utm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController
{
    @RequestMapping("/")
    public View index() {
        return new RedirectView("/dashboard/home", true, false);
    }
}
