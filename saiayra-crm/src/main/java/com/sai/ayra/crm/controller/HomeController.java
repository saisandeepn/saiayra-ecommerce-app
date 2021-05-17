package com.sai.ayra.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
  @RequestMapping("/")
  public String hello() {
    return "login";
  }
  /*
   * Accepts the request param named 'name" and passes it to the next view i.e.,
   * welcome.jsp
   */
  @PostMapping("/welcome")
  public String welcome(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name); // Setting the model data in the view
    return "welcome"; // Returns the view name to be rendered by the browser, i.e., welcome.jsp
  }
}
