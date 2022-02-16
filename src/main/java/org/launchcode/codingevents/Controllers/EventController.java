package org.launchcode.codingevents.Controllers;



import org.launchcode.codingevents.data.EventData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 import org.launchcode.codingevents.models.Event;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<Event> events = new ArrayList<>();


    @GetMapping
    public String listEvents(Model model){
//    List<String> events = new ArrayList<>();
//    events.add("Birthday");
//    events.add("Holidays");
//    events.add("Anniversary's");
    model.addAttribute("events", EventData.getAll());
    model.addAttribute("title", "All Events");
    return "events/index";

    }


    @GetMapping("create")
    public String renderCreateForm(Model model){
        model.addAttribute("title", "Create Events");
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription){
    //events.add(new Event(eventName, eventDescription));
        EventData.add(new Event(eventName, eventDescription));
    return "redirect:";
    }

    @GetMapping("delete")
    public String dislplayDeleteEvent(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEvent(@RequestParam(required = false) int[] eventIds){
       if (eventIds != null){
        for (int id : eventIds){
            EventData.remove(id);
        }}
        return "redirect: ";
    }

}
