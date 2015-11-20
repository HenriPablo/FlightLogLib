/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.services;

import com.flightloglib.domain.Flight;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tomekpilot
 */
public interface TimeSummaryServiceInterface {
   
  Flight flight = null; 
  public void setFlight();
  public Flight getFlight();
   
 /*-----------------------------------------------------------------------------
  * START TIME TOTALS CALCULATIONS 
  *---------------------------------------------------------------------------*/
    
    /* "select sum( noInstAproaches ) from Flight" */
     public int getNumInstrumentApproaches( String query );
	    

    /* landings - DAY & NIGHT */

    public int getNumDayLandings( String query );// = Flight.executeQuery( "select sum( noDayLandings) from Flight" );
    
    public int getNumNightLandings( String query );// = Flight.executeQuery ( "select sum( noNightLandings ) from Flight" );
    
    // = Flight.executeQuery ( "select sum( noLandings ) from Flight" );
    // = Flight.executeQuery ( "select sum( noDayLandings + noNightLandings) from Flight") //noDayLandings + noNightLandings;
    public int getNumLanding( String query ); 
     
    /* time by aircraft category and classification */
    
    // = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'single-engine land' and aircraft.aircraftCategory = 'airplane' ");
    //  = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'multi-engine land' and aircraft.aircraftCategory = 'airplane' ");;
    //    def rotorcraftHelicopter  =  "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'rotorcraft helicopter' and aircraft.aircraftCategory = 'airplane' ");;

    public HashMap getTimeByCategoryAndClass( String query );

    public BigDecimal getFlightInstructorTime( String query );// = Flight.executeQuery ( "select sum ( asFlightInstructor ) from Flight" );
    
    public BigDecimal getCrossCountryTime( String query ); // = Flight.executeQuery ( "select sum( crossCountry ) from Flight" );

    /* conditions of flight */
    
    public BigDecimal getDayTime( String query ); // = Flight.executeQuery ( "select sum ( day ) from Flight");
    
    public BigDecimal getNightTime( String query ); // = Flight.executeQuery ( "select sum ( night ) from Flight");
    
    public BigDecimal getActualInstrumentTime( String query );// = Flight.executeQuery ( "select sum ( actualInstrument ) from Flight");

    public BigDecimal getSimulatedInstrumentTime( String query ); // = Flight.executeQuery ( "select sum ( simulatedInstrument ) from Flight");

    public BigDecimal getGroundTrainerTime( String query ); // = Flight.executeQuery ( "select sum ( groundTrainer ) from Flight");

    /* type of piloting time */
    
    public BigDecimal getDualReceivedTime( String query ); // = Flight.executeQuery ( "select sum ( dualReceived ) from Flight");
    
    public BigDecimal  getPilotInCommandTime( String query ); // = Flight.executeQuery ( "select sum ( pilotInCommand ) from Flight");
    
    public BigDecimal getSecondInCommandTime( String query ); // = Flight.executeQuery ( "select sum ( secondInCommand ) from Flight");


    public BigDecimal getTotalDurationOfFlightTime( String query );// = Flight.executeQuery ( "select sum( totalDurationOfFlight ) from Flight" );


    /*
     * FLIGHT TIME TOTALS FOR USE ON CHECKRIDE APPLICATIN FORM
     *  - times not shown above only, ie. total is already accounted for;
     */
    
    public BigDecimal getSoloTime(); // = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where dualReceived = 0.0");
   
    public BigDecimal getCrossCountryInstReceivedTime();// = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where dualReceived > 0.0");
    
    public BigDecimal getCrossCountrySoloTime();// = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where dualReceived = 0.0");
    
    public BigDecimal getCrossCountryPicTime(); // = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where pilotInCommand > 0.0");

    /* include both CTUAL and SIMULATED */
    public BigDecimal getTotalinstrumentTime();// = actualInstrument[0] + simulatedInstrument[0];

    public BigDecimal getNightInstructionReceivedTime();// = Flight.executeQuery ( "select sum ( night ) from Flight where dualReceived > 0.0 ");
    
    public BigDecimal getNightTakeOffAndLandings();// = Flight.executeQuery ( "select sum ( noNightLandings ) from Flight");
    
    public BigDecimal getNightPicTime();// = Flight.executeQuery ( "select sum ( night ) from Flight where pilotInCommand > 0.0");

    // TODO account for split flight as in instructor in for 30 min of the flight
    public BigDecimal getNightNightPicSolo();// = Flight.executeQuery ( "select sum ( night ) from Flight where dualReceived = 0.0");
        
    public BigDecimal getNightTakeOffAndLandingSolo();// = Flight.executeQuery( "select sum( noNightLandings ) from Flight where night > 0 AND dualReceived = 0.0");

    /*
     * total times per aircraft type, ie C-172: 153.2 hrs.
     *  - shoul be a has of TYPE - TIME
     */
    public BigDecimal gettotalTimePerAircraftTypeTime();// = [:];

    // list of aircraft types flown
    public int getTypes();// = Flight.executeQuery ( "select  aircraftType from Flight GROUP BY aircraftType");

//
//        for( count in types ) {
//
//            totalTimePerAircraftType.put( count, Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraftType = '${count}'") )
//
//            //println ( count + ": " + flight.Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from flight.Flight where aircraftType = '${count}'") + "\n"  );
//        }


    
 /*-----------------------------------------------------------------------------
  * END TIME TOTALS CALCULATIONS 
  *---------------------------------------------------------------------------*/
   
        
    
    
}
