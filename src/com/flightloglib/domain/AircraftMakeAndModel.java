/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tomekpilot
 */
@Entity
public class AircraftMakeAndModel implements Serializable {

    long id;
    private long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_make_and_model_id")
    @SequenceGenerator( name = "aircraft_make_and_model_id", sequenceName = "aircraft_make_and_model_id", allocationSize = 1 )
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }
    
    /* Aircraft Category and Class */
    private AircraftCategoryAndClass aircraftCategoryAndClass;

    /* make: Cessna */
    private String aircraftMake;
    
    /* model : C-172 */
    private String aircraftModel;

    /* N54666 */
    private String aircraftTailNumber;

    /* nickname */
    private String nickname;
    private boolean complex = false;
    private boolean hiPerformance = false;

    @Override
    public String toString() {
	return this.getAircraftMake() + " " + this.getAircraftTailNumber();
    }

    /**
     * @return the aircraftType
     */
    public String getAircraftMake() {
	return aircraftMake;
    }

    /**
     * @param aircraftType the aircraftType to set
     */
    public void setAircraftMake(String aircraftMake) {
	this.aircraftMake = aircraftMake;
    }

    /**
     * @return the aircraftTailNumber
     */
    public String getAircraftTailNumber() {
	return aircraftTailNumber;
    }

    /**
     * @param aircraftTailNumber the aircraftTailNumber to set
     */
    public void setAircraftTailNumber(String aircraftTailNumber) {
	this.aircraftTailNumber = aircraftTailNumber;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
	return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    /**
     * @return the complex
     */
    public boolean isComplex() {
	return complex;
    }

    /**
     * @param complex the complex to set
     */
    public void setComplex(boolean complex) {
	this.complex = complex;
    }

    /**
     * @return the hiPerformance
     */
    public boolean isHiPerformance() {
	return hiPerformance;
    }

    /**
     * @param hiPerformance the hiPerformance to set
     */
    public void setHiPerformance(boolean hiPerformance) {
	this.hiPerformance = hiPerformance;
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
    
    public void setAircraftCategoryAndClass( AircraftCategoryAndClass aircraftCategoryAndClass ){
        this.aircraftCategoryAndClass = aircraftCategoryAndClass;
    }
    
    @ManyToOne
    public AircraftCategoryAndClass getAircraftCategoryAndClass(){
        return this.aircraftCategoryAndClass;
    }

    /**
     * @return the aircraftModel
     */
    public String getAircraftModel() {
        return aircraftModel;
    }

    /**
     * @param aircraftModel the aircraftModel to set
     */
    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }
}
