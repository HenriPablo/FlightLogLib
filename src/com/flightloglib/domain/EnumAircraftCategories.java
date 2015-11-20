/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

/**
 *
 * @author tomekpilot
 * 
 *  available categories:
 *      Airplane
 *      Rotorcraft
 *      Glider
 *      Lighter than air
 *      Powered lift
 *      Powered parachute
 *      Weight-shift-control
 * 
 *	provided by EnumEnrcraftCategories
 */
public enum EnumAircraftCategories {
    
	Airplane(1, "airplane"),
	Rotorcraft(2, "rotorcraft"),
	Lighter_Than_Air(3, "lighter than air"),
	Powered_Lift(4, "powered lift"),
	Powered_Parachute(5, "powered parachute"),
	Weight_Shift_Control(6, "weight shift control");
    
    
	
	final long id;
	private long version;
	
	final String description;
	
	private EnumAircraftCategories( long id, String description ){ 
	    this.id = id;
	    this.description = description;
	}
	
	public long getId(){ 
	    return id; 
	}
	
	public String getDescription(){ 
	    return description; 
	}
	
	public String toString(){
	    return description;
	}    

    /**
     * @return the version
     */
    public long getVersion() {
	return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(long version) {
	this.version = version;
    }
}
