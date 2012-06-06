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
public abstract class RaceTrait {
    
    private static String _name;
    private static String _description;
    private Event _eventsHandled;
    
    public abstract void HandleEvent(Event event);
    
}
