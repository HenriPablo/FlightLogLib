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
public class Pilot {
    
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pilot_id")
   @SequenceGenerator( name = "pilot_id", sequenceName = "pilot_id", allocationSize = 1 )
   long id;
   private long version;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    private String firstName;
    private String lastName;

    private String certificateNo;

    private String email;
    private String phone;

    private String address1;
    private String address2;
    private String city;
    private String stateProvince;
    private String zip;

    private String notes; 

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the certificateNo
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * @param certificateNo the certificateNo to set
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * @param stateProvince the stateProvince to set
     */
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
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
    
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
}
    
}
