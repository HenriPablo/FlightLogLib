/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;


/**
 *
 * @author tomekpilot
 *
 * available classes within categories:
 *
 * ------------------------------------ 
 * CATEGORY CLASS
 * -------------------------------------
 *
 * Airplane:
 *	single-engine land, 
 *	multi-engine land, 
 *	single-engine sea,
 *	multi-engine sea
 *
 * Rotorcraft:
 *	helicopter, 
 *	gyroplane
 *
 * Lighter-than-air: 
 *	airship, 
 *	balloon
 *
 * Powered-parachute:
 *	powered parachute land,
 *	powered parachute sea
 *
 * Weight-shift-control: 
 *	weight-shift-control land,
 *	weight-shift-control sea
 */
public enum EnumAircraftClass {
    
    SingleEngineLand(	1, "Single-Engine Land"),
    MultiEngineLand(	2, "Multi-Engine Land"),
    SingleEngineSea(	3, "Single-Engine Sea"),
    MultiEngineSea(	4, "Multi-Engine Sea"),
    Helicopter(		5, "Helicopter"),
    Gyroplane(		6, "Gyroplane"),
    Airship(		7, "Airship"),
    Balloon(		8, "Balloon");
    
    private long id;
    private long version;
    
    private String description;
    
    private EnumAircraftClass( long id, String description ){
	this.id = id;
	this.description = description;
    }

    /**
     * @return the id
     */
    public long getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
	this.id = id;
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

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }
    
    
    
}
