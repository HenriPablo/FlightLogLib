/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import com.flightloglib.domain.CrewMember;

/**
 *
 * @author tomek
 */
@Entity
public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_id")
    @SequenceGenerator( name = "flight_id", sequenceName = "flight_id", allocationSize = 1 )
    long id;
    
    private long version;

    private BigDecimal asFlightInstructor;
    private BigDecimal crossCountry;

    /* conditions of flight */
    private BigDecimal day;
    private BigDecimal night;
    private BigDecimal actualInstrument;
    private BigDecimal simulatedInstrument;
    private BigDecimal groundTrainer;

    /* type of piloting time */
    private BigDecimal dualReceived;
    private BigDecimal pilotInCommand;
    private BigDecimal secondInCommand;

    private BigDecimal totalDurationOfFlight;

    String remarks = "";

    @OneToOne(cascade = CascadeType.ALL)
    Airport departure;

    private String via;

    @OneToOne(cascade = CascadeType.ALL)
    Airport destination;


    @OneToOne( cascade= CascadeType.ALL)
    private AircraftMakeAndModel aircraftMakeAndModel;

    private Date date;
    private int noInstAproaches;
    private int noDayLandings;
    private int noNightLandings;

    @ManyToMany(cascade= CascadeType.ALL)
    private Set<CrewMember>  crewMembers = new HashSet <CrewMember>( );


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }


    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    /**
     * @return the via
     */
    public String getVia() {
        return via;
    }

    /**
     * @param via the via to set
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * @return the aircraftMakeAndModel
     */

    public AircraftMakeAndModel getAircraftMakeAndModel() {
        return aircraftMakeAndModel;
    }

    /**
     * @param aircraftMakeAndModel the aircraftMakeAndModel to set
     */
    public void setAircraftMakeAndModel(AircraftMakeAndModel aircraftMakeAndModel) {
        this.aircraftMakeAndModel = aircraftMakeAndModel;
    }




    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the noInstAproaches
     */
    public int getNoInstAproaches() {
        return noInstAproaches;
    }

    /**
     * @param noInstAproaches the noInstAproaches to set
     */
    public void setNoInstAproaches(int noInstAproaches) {
        this.noInstAproaches = noInstAproaches;
    }

    /**
     * @return the noDayLandings
     */
    public int getNoDayLandings() {
        return noDayLandings;
    }

    /**
     * @param noDayLandings the noDayLandings to set
     */
    public void setNoDayLandings(int noDayLandings) {
        this.noDayLandings = noDayLandings;
    }

    /**
     * @return the noNightLandings
     */
    public int getNoNightLandings() {
        return noNightLandings;
    }

    /**
     * @param noNightLandings the noNightLandings to set
     */
    public void setNoNightLandings(int noNightLandings) {
        this.noNightLandings = noNightLandings;
    }

    /**
     * @return the asFlightInstructor
     */
    public BigDecimal getAsFlightInstructor() {
        return asFlightInstructor;
    }

    /**
     * @param asFlightInstructor the asFlightInstructor to set
     */
    public void setAsFlightInstructor(BigDecimal asFlightInstructor) {
        this.asFlightInstructor = asFlightInstructor;
    }

    /**
     * @return the crossCountry
     */
    public BigDecimal getCrossCountry() {
        return crossCountry;
    }

    /**
     * @param crossCountry the crossCountry to set
     */
    public void setCrossCountry(BigDecimal crossCountry) {
        this.crossCountry = crossCountry;
    }

    /**
     * @return the day
     */
    public BigDecimal getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(BigDecimal day) {
        this.day = day;
    }

    /**
     * @return the night
     */
    public BigDecimal getNight() {
        return night;
    }

    /**
     * @param night the night to set
     */
    public void setNight(BigDecimal night) {
        this.night = night;
    }

    /**
     * @return the actualInstrument
     */
    public BigDecimal getActualInstrument() {
        return actualInstrument;
    }

    /**
     * @param actualInstrument the actualInstrument to set
     */
    public void setActualInstrument(BigDecimal actualInstrument) {
        this.actualInstrument = actualInstrument;
    }

    /**
     * @return the simulatedInstrument
     */
    public BigDecimal getSimulatedInstrument() {
        return simulatedInstrument;
    }

    /**
     * @param simulatedInstrument the simulatedInstrument to set
     */
    public void setSimulatedInstrument(BigDecimal simulatedInstrument) {
        this.simulatedInstrument = simulatedInstrument;
    }

    /**
     * @return the groundTrainer
     */
    public BigDecimal getGroundTrainer() {
        return groundTrainer;
    }

    /**
     * @param groundTrainer the groundTrainer to set
     */
    public void setGroundTrainer(BigDecimal groundTrainer) {
        this.groundTrainer = groundTrainer;
    }

    /**
     * @return the dualReceived
     */
    public BigDecimal getDualReceived() {
        return dualReceived;
    }

    /**
     * @param dualReceived the dualReceived to set
     */
    public void setDualReceived(BigDecimal dualReceived) {
        this.dualReceived = dualReceived;
    }

    /**
     * @return the pilotInCommand
     */
    public BigDecimal getPilotInCommand() {
        return pilotInCommand;
    }

    /**
     * @param pilotInCommand the pilotInCommand to set
     */
    public void setPilotInCommand(BigDecimal pilotInCommand) {
        this.pilotInCommand = pilotInCommand;
    }

    /**
     * @return the secondInCommand
     */
    public BigDecimal getSecondInCommand() {
        return secondInCommand;
    }

    /**
     * @param secondInCommand the secondInCommand to set
     */
    public void setSecondInCommand(BigDecimal secondInCommand) {
        this.secondInCommand = secondInCommand;
    }

    /**
     * @return the totalDurationOfFlight
     */
    public BigDecimal getTotalDurationOfFlight() {
        return totalDurationOfFlight;
    }

    /**
     * @param totalDurationOfFlight the totalDurationOfFlight to set
     */
    public void setTotalDurationOfFlight(BigDecimal totalDurationOfFlight) {
        this.totalDurationOfFlight = totalDurationOfFlight;
    }
    
    /*------------------------------------------------------------------------------------------------------------------
     * times breakdown
     * -----------------------------------------------------------------------------------------------------------------*/

       /*
        * crewmember(s)
        
    private Set <CrewMember>  crewMembers = new HashSet <CrewMember>( );*/

    /**
     * @return the crewMembers
     */
    //@OneToMany(cascade= CascadeType.ALL
    public Set <CrewMember> getCrewMembers() {
        return crewMembers;
    }

    /**
     * @param crewMembers the crewMembers to set
     */
    public void setCrewMembers( Set <CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
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
    
    /*  aircraft Category And Class
        type of time:
            single-engine land,
            multi-engine land,
            rotorcraft helicopter
    */
    enum aircraftCategoryAndClass{ 
            SINGLE_ENGINE_LAND, 
            SINGLE_ENGINE_SEA,
            MULTI_ENGINE_LAND,
            MULTI_ENGINE_SEA,
            ROTORCRAFT_HELICOPTER }
      
    
}
