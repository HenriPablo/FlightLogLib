/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import javax.persistence.*;

/**
 *
 * @author tomekpilot
 */
@Entity
public class TimeSummary {

     long id;
     private long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_summary_id")
    @SequenceGenerator( name = "time_summary_id", sequenceName = "time_summary_id", allocationSize = 1 )
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    private int noInstrumentApproaches;
    private int noLanding;

    /* aircraft category and classification */

    private double airplaneSingeEngineLand;
    private double airplaneMultiEngineLand;
    private double rotorcraftHelicopter;

    private double asFlightInstructor;
    private double crossCountry;

    /* conditions of flight */
    private double dayTime;
    private double nightTime;
    private double actualInstrument;
    private double simulatedInstrument;

    private double groundTrainer;

    /* type of piloting time */
    private double dualReceived;
    private double pilotInCommand;
    private double secondInCommand;

    private double totalDurationOfFlight;


    /*
     * FAA Form 8710-1 FLIGHT TIME TOTALS FOR USE ON CHECKRIDE APPLICATIN FORM
     *  - times not shown above only, ie. total is already accounted for;
     *
     */
    private BigDecimal solo;
    private BigDecimal crossCountryInstReceived;
    private BigDecimal crossCountrySolo;
    private BigDecimal crossCountryPic;

    /* include both CTUAL and SIMULATED */
    private BigDecimal instrument;

    private BigDecimal nightInstructionReceived;
    private int nightTakeOffAndLandings;
    private BigDecimal nightPic;
    private BigDecimal nightPicSolo;
    private int nightTakeOffAndLandingSolo;

    /*
     * total times per aircraft type, ie C-172: 153.2 hrs.
     *  - shoul be a has of TYPE - TIME
     */
    private HashMap totalTimePerAircraftType;    

    /**
     * @return the noInstrumentApproaches
     */
    public int getNoInstrumentApproaches() {
        return noInstrumentApproaches;
    }

    /**
     * @param noInstrumentApproaches the noInstrumentApproaches to set
     */
    public void setNoInstrumentApproaches(int noInstrumentApproaches) {
        this.noInstrumentApproaches = noInstrumentApproaches;
    }

    /**
     * @return the noLanding
     */
    public int getNoLanding() {
        return noLanding;
    }

    /**
     * @param noLanding the noLanding to set
     */
    public void setNoLanding(int noLanding) {
        this.noLanding = noLanding;
    }

    /**
     * @return the airplaneSingeEngineLand
     */
    public double getAirplaneSingeEngineLand() {
        return airplaneSingeEngineLand;
    }

    /**
     * @param airplaneSingeEngineLand the airplaneSingeEngineLand to set
     */
    public void setAirplaneSingeEngineLand(double airplaneSingeEngineLand) {
        this.airplaneSingeEngineLand = airplaneSingeEngineLand;
    }

    /**
     * @return the airplaneMultiEngineLand
     */
    public double getAirplaneMultiEngineLand() {
        return airplaneMultiEngineLand;
    }

    /**
     * @param airplaneMultiEngineLand the airplaneMultiEngineLand to set
     */
    public void setAirplaneMultiEngineLand(double airplaneMultiEngineLand) {
        this.airplaneMultiEngineLand = airplaneMultiEngineLand;
    }

    /**
     * @return the rotorcraftHelicopter
     */
    public double getRotorcraftHelicopter() {
        return rotorcraftHelicopter;
    }

    /**
     * @param rotorcraftHelicopter the rotorcraftHelicopter to set
     */
    public void setRotorcraftHelicopter(double rotorcraftHelicopter) {
        this.rotorcraftHelicopter = rotorcraftHelicopter;
    }

    /**
     * @return the asFlightInstructor
     */
    public double getAsFlightInstructor() {
        return asFlightInstructor;
    }

    /**
     * @param asFlightInstructor the asFlightInstructor to set
     */
    public void setAsFlightInstructor(double asFlightInstructor) {
        this.asFlightInstructor = asFlightInstructor;
    }

    /**
     * @return the crossCountry
     */
    public double getCrossCountry() {
        return crossCountry;
    }

    /**
     * @param crossCountry the crossCountry to set
     */
    public void setCrossCountry(double crossCountry) {
        this.crossCountry = crossCountry;
    }

    /**
     * @return the day
     */
    public double getDayTime() {
        return dayTime;
    }

    /**
     * @param day the day to set
     */
    public void setDayTime(double dayTime) {
        this.dayTime = dayTime;
    }

    /**
     * @return the night
     */
    public double getNightTime() {
        return nightTime;
    }

    /**
     * @param night the night to set
     */
    public void setNightTime(double nightTime) {
        this.nightTime = nightTime;
    }

    /**
     * @return the actualInstrument
     */
    public double getActualInstrument() {
        return actualInstrument;
    }

    /**
     * @param actualInstrument the actualInstrument to set
     */
    public void setActualInstrument(double actualInstrument) {
        this.actualInstrument = actualInstrument;
    }

    /**
     * @return the simulatedInstrument
     */
    public double getSimulatedInstrument() {
        return simulatedInstrument;
    }

    /**
     * @param simulatedInstrument the simulatedInstrument to set
     */
    public void setSimulatedInstrument(double simulatedInstrument) {
        this.simulatedInstrument = simulatedInstrument;
    }

    /**
     * @return the groundTrainer
     */
    public double getGroundTrainer() {
        return groundTrainer;
    }

    /**
     * @param groundTrainer the groundTrainer to set
     */
    public void setGroundTrainer(double groundTrainer) {
        this.groundTrainer = groundTrainer;
    }

    /**
     * @return the dualReceived
     */
    public double getDualReceived() {
        return dualReceived;
    }

    /**
     * @param dualReceived the dualReceived to set
     */
    public void setDualReceived(double dualReceived) {
        this.dualReceived = dualReceived;
    }

    /**
     * @return the pilotInCommand
     */
    public double getPilotInCommand() {
        return pilotInCommand;
    }

    /**
     * @param pilotInCommand the pilotInCommand to set
     */
    public void setPilotInCommand(double pilotInCommand) {
        this.pilotInCommand = pilotInCommand;
    }

    /**
     * @return the secondInCommand
     */
    public double getSecondInCommand() {
        return secondInCommand;
    }

    /**
     * @param secondInCommand the secondInCommand to set
     */
    public void setSecondInCommand(double secondInCommand) {
        this.secondInCommand = secondInCommand;
    }

    /**
     * @return the totalDurationOfFlight
     */
    public double getTotalDurationOfFlight() {
        return totalDurationOfFlight;
    }

    /**
     * @param totalDurationOfFlight the totalDurationOfFlight to set
     */
    public void setTotalDurationOfFlight(double totalDurationOfFlight) {
        this.totalDurationOfFlight = totalDurationOfFlight;
    }

    /**
     * @return the solo
     */
    public BigDecimal getSolo() {
        return solo;
    }

    /**
     * @param solo the solo to set
     */
    public void setSolo(BigDecimal solo) {
        this.solo = solo;
    }

    /**
     * @return the crossCountryInstReceived
     */
    public BigDecimal getCrossCountryInstReceived() {
        return crossCountryInstReceived;
    }

    /**
     * @param crossCountryInstReceived the crossCountryInstReceived to set
     */
    public void setCrossCountryInstReceived(BigDecimal crossCountryInstReceived) {
        this.crossCountryInstReceived = crossCountryInstReceived;
    }

    /**
     * @return the crossCountrySolo
     */
    public BigDecimal getCrossCountrySolo() {
        return crossCountrySolo;
    }

    /**
     * @param crossCountrySolo the crossCountrySolo to set
     */
    public void setCrossCountrySolo(BigDecimal crossCountrySolo) {
        this.crossCountrySolo = crossCountrySolo;
    }

    /**
     * @return the crossCountryPic
     */
    public BigDecimal getCrossCountryPic() {
        return crossCountryPic;
    }

    /**
     * @param crossCountryPic the crossCountryPic to set
     */
    public void setCrossCountryPic(BigDecimal crossCountryPic) {
        this.crossCountryPic = crossCountryPic;
    }

    /**
     * @return the instrument
     */
    public BigDecimal getInstrument() {
        return instrument;
    }

    /**
     * @param instrument the instrument to set
     */
    public void setInstrument(BigDecimal instrument) {
        this.instrument = instrument;
    }

    /**
     * @return the nightInstructionReceived
     */
    public BigDecimal getNightInstructionReceived() {
        return nightInstructionReceived;
    }

    /**
     * @param nightInstructionReceived the nightInstructionReceived to set
     */
    public void setNightInstructionReceived(BigDecimal nightInstructionReceived) {
        this.nightInstructionReceived = nightInstructionReceived;
    }

    /**
     * @return the nightTakeOffAndLandings
     */
    public int getNightTakeOffAndLandings() {
        return nightTakeOffAndLandings;
    }

    /**
     * @param nightTakeOffAndLandings the nightTakeOffAndLandings to set
     */
    public void setNightTakeOffAndLandings(int nightTakeOffAndLandings) {
        this.nightTakeOffAndLandings = nightTakeOffAndLandings;
    }

    /**
     * @return the nightPic
     */
    public BigDecimal getNightPic() {
        return nightPic;
    }

    /**
     * @param nightPic the nightPic to set
     */
    public void setNightPic(BigDecimal nightPic) {
        this.nightPic = nightPic;
    }

    /**
     * @return the nightPicSolo
     */
    public BigDecimal getNightPicSolo() {
        return nightPicSolo;
    }

    /**
     * @param nightPicSolo the nightPicSolo to set
     */
    public void setNightPicSolo(BigDecimal nightPicSolo) {
        this.nightPicSolo = nightPicSolo;
    }

    /**
     * @return the nightTakeOffAndLandingSolo
     */
    public int getNightTakeOffAndLandingSolo() {
        return nightTakeOffAndLandingSolo;
    }

    /**
     * @param nightTakeOffAndLandingSolo the nightTakeOffAndLandingSolo to set
     */
    public void setNightTakeOffAndLandingSolo(int nightTakeOffAndLandingSolo) {
        this.nightTakeOffAndLandingSolo = nightTakeOffAndLandingSolo;
    }

    /**
     * @return the totalTimePerAircraftType
     */
    public HashMap getTotalTimePerAircraftType() {
        return totalTimePerAircraftType;
    }

    /**
     * @param totalTimePerAircraftType the totalTimePerAircraftType to set
     */
    public void setTotalTimePerAircraftType(HashMap totalTimePerAircraftType) {
        this.totalTimePerAircraftType = totalTimePerAircraftType;
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
