/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * 
 * Airport generated by hbm2java
 * 
 */
@Entity
@Table(name = "airport")
@NamedQueries({
    @NamedQuery(name = "Airport.findAll", query = "SELECT a FROM Airport a"),
    @NamedQuery(name = "Airport.findById", query = "SELECT a FROM Airport a WHERE a.id = :id" ),
    @NamedQuery(name = "Airport.findByIcaoIdentifier", query = "SELECT a FROM Airport a WHERE a.icaoIdentifier = :icaoIdentifier"),
    @NamedQuery(name = "Airport.findByLongName", query = "SELECT a FROM Airport a WHERE a.longName = :longName"),
    @NamedQuery(name = "Airport.findByVersion", query = "SELECT a FROM Airport a WHERE a.version = :version")})
public class Airport   implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airport_id")
    @SequenceGenerator( name = "airport_id", sequenceName = "airport_id", allocationSize = 1)
    long id;

    @Column( name="version")
    @Version
    private long version;

    @Column( name="icao_identifier")
    String icaoIdentifier = "ksrq";
    
    @Column( name="long_name")
    private String longName;
    
    private Date createdOn;
    private Date modifiedOn;
    
    
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getIcaoIdentifier() {
	return icaoIdentifier;
    }

    public void setIcaoIdentifier(String icaoIdentifier) {
	this.icaoIdentifier = icaoIdentifier;
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

    public String getLongName() {
        return longName;
}

    public void setLongName(String longName) {
        this.longName = longName;
    }

    @Override
    public String toString() {
        return  this.icaoIdentifier + ": " + this.longName;
    } 

    /**
     * @return the createdOn
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return the modifiedOn
     */
    public Date getModifiedOn() {
        return modifiedOn;
    }

    /**
     * @param modifiedOn the modifiedOn to set
     */
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
    
}