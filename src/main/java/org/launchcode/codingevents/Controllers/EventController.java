package org.launchcode.codingevents.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String listEvents(Model model){
//    List<String> events = new ArrayList<>();
//    events.add("Birthday");
//    events.add("Holidays");
//    events.add("Anniversary's");
    model.addAttribute("events", events);
    return "events/index";

    }


    @GetMapping("create")
    public String renderCreateForm(){
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
    events.add(eventName);
    return "redirect:/events";
    }
}
