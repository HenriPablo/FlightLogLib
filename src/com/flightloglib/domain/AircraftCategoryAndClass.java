/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import javax.persistence.*;

/**
 *
 * @author tomekpilot
 */
@Entity
public class AircraftCategoryAndClass {    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_category_and_class_id")
    @SequenceGenerator( name = "aircraft_category_and_class_id", sequenceName = "aircraft_category_and_class_id")
    long id;
    private long version;
    
    @Transient
    @Enumerated(EnumType.ORDINAL)    
    private EnumAircraftCategories aircraftCategoryHints = EnumAircraftCategories.Airplane;

    private String aircraftCategory;
    
    @Transient
    @Enumerated(EnumType.ORDINAL)
    private EnumAircraftClass aircraftClassHints = EnumAircraftClass.SingleEngineLand;
    
    private String aircraftClass;
    
    public long getId() {
        return id;
    }

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
     * @return the aircraftCategoryHints
     */
    public EnumAircraftCategories getAircraftCategoryHints() {
	return aircraftCategoryHints;
    }

    /**
     * @param aircraftCategoryHints the aircraftCategoryHints to set
     */
    public void setAircraftCategoryHints(EnumAircraftCategories aircraftCategoryHints) {
	this.aircraftCategoryHints = aircraftCategoryHints;
    }

    /**
     * @return the aircraftCategory
     */
    public String getAircraftCategory() {
	return aircraftCategory;
    }

    /**
     * @param aircraftCategory the aircraftCategory to set
     */
    public void setAircraftCategory(String aircraftCategory) {
	this.aircraftCategory = aircraftCategory;
    }

    /**
     * @return the aircraftClassHints
     */
    public EnumAircraftClass getAircraftClassHints() {
	return aircraftClassHints;
    }

    /**
     * @param aircraftClassHints the aircraftClassHints to set
     */
    public void setAircraftClassHints(EnumAircraftClass aircraftClassHints) {
	this.aircraftClassHints = aircraftClassHints;
    }

    /**
     * @return the aircraftClass
     */
    public String getAircraftClass() {
	return aircraftClass;
    }

    /**
     * @param aircraftClass the aircraftClass to set
     */
    public void setAircraftClass(String aircraftClass) {
	this.aircraftClass = aircraftClass;
    }
    
    @Override
    public String toString(){
        return this.aircraftCategory + " " + this.aircraftClass;
    }
}
