package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // all members of class are static encapsulation(storing behaviors)
    //need a place to put events
    public static final Map<Integer, Event> events = new HashMap<>();

    //get all events
    public static Collection<Event> getAll() {
        return events.values();
    }

    //get a single event
    public static Event getByID(int id) {
        return events.get(id);
    }




    // add event
    public static void add(Event event){
     events.put(event.getId(),event);
    }

    // remove a event

    public static void remove(int id){
        events.remove(id);
    }
}
