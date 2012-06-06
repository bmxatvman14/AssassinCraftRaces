/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.monstuhs.assassincraftraces.Models.Base;

import org.bukkit.event.Event;

/**
 *
 * @author James
 */
public interface RaceTrait {
    
    boolean HandlesEvent(Class<Event> eventClass);
    void HandleEvent(Event event);    
}
