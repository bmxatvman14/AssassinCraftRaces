/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.monstuhs.assassincraftraces.Models.Traits;

import java.util.ArrayList;
import me.monstuhs.assassincraftraces.Models.Base.RaceTrait;
import org.bukkit.event.Event;

/**
 *
 * @author James
 */
public class BreathUnderwater implements RaceTrait {

    private static ArrayList<Class<Event>> _handledEvents;
    
    public BreathUnderwater(){
        
    }
    
    @Override
    public boolean HandlesEvent(Class<Event> eventClass) {
        return _handledEvents.contains(eventClass);
    }

    @Override
    public void HandleEvent(Event event) {
        
    }
    
}
