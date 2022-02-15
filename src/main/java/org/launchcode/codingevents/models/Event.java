package org.launchcode.codingevents.models;

public class Event {
    private String name;
    private String eventDescription;

    public Event(String name, String eventDescription) {
        this.name = name;
        this.eventDescription = eventDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public String toString() {
        return name;
    }

}
