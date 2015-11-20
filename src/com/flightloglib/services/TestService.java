/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.services;

import com.flightloglib.domain.Flight;
import com.flightloglib.domain.TimeSummary;

/**
 *
 * @author tomekpilot
 */
public class TestService {
    
    public String sayHi( TimeSummary timeSummary ){
    
	return "Hello World from test service";
    
    }// say hi
    

    
 /*-----------------------------------------------------------------------------
  * START TIME TOTALS CALCULATIONS 
  *---------------------------------------------------------------------------*/

     public long getNoInstrumentApproaches( String query ){
	 // "select sum( noInstAproaches ) from Flight"
	return 0;
    }
    

//    /* landings - DAY & NIGHT */
//
//    def noDayLandings = Flight.executeQuery( "select sum( noDayLandings) from Flight" );
//    def noNightLandings = Flight.executeQuery ( "select sum( noNightLandings ) from Flight" );
//    //def noLanding = Flight.executeQuery ( "select sum( noLandings ) from Flight" );
//    def noLanding = Flight.executeQuery ( "select sum( noDayLandings + noNightLandings) from Flight") //noDayLandings + noNightLandings;
//
//        println( "\n\nTOTAL LANDINGS: DAY AND NIGHT: " + noLanding + "\n\n")
//
//
//    /* aircraft category and classification */
//
//    def airplaneSingleEngineLand = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'single-engine land' and aircraft.aircraftCategory = 'airplane' ");
//
//    def airplaneMultiEngineLand  = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'multi-engine land' and aircraft.aircraftCategory = 'airplane' ");;
//
//    def rotorcraftHelicopter  = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where aircraft.aircraftClass = 'rotorcraft helicopter' and aircraft.aircraftCategory = 'airplane' ");;
//
//    def asFlightInstructor = Flight.executeQuery ( "select sum ( asFlightInstructor ) from Flight" );
//    def crossCountry = Flight.executeQuery ( "select sum( crossCountry ) from Flight" );
//
//    /* conditions of flight */
//    def day = Flight.executeQuery ( "select sum ( day ) from Flight");
//    def night = Flight.executeQuery ( "select sum ( night ) from Flight");
//    def actualInstrument = Flight.executeQuery ( "select sum ( actualInstrument ) from Flight");
//    def simulatedInstrument = Flight.executeQuery ( "select sum ( simulatedInstrument ) from Flight");
//
//    def groundTrainer = Flight.executeQuery ( "select sum ( groundTrainer ) from Flight");
//
//    /* type of piloting time */
//    def dualReceived = Flight.executeQuery ( "select sum ( dualReceived ) from Flight");
//    def pilotInCommand = Flight.executeQuery ( "select sum ( pilotInCommand ) from Flight");
//    def secondInCommand = Flight.executeQuery ( "select sum ( secondInCommand ) from Flight");
//
//
//    def totalDurationOfFlight = Flight.executeQuery ( "select sum( totalDurationOfFlight ) from Flight" );
//
//
//    /*
//     * FLIGHT TIME TOTALS FOR USE ON CHECKRIDE APPLICATIN FORM
//     *  - times not shown above only, ie. total is already accounted for;
//     *
//     */
//    def solo = Flight.executeQuery ( "select sum ( totalDurationOfFlight ) from Flight where dualReceived = 0.0");
//    def crossCountryInstReceived = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where dualReceived > 0.0");
//    def crossCountrySolo = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where dualReceived = 0.0");
//    def crossCountryPic = Flight.executeQuery ( "select sum ( crossCountry ) from Flight where pilotInCommand > 0.0");
//
//    /* include both CTUAL and SIMULATED */
//    double instrument = actualInstrument[0] + simulatedInstrument[0];
//
//    def nightInstructionReceived = Flight.executeQuery ( "select sum ( night ) from Flight where dualReceived > 0.0 ");
//    def nightTakeOffAndLandings = Flight.executeQuery ( "select sum ( noNightLandings ) from Flight");
//    def nightPic = Flight.executeQuery ( "select sum ( night ) from Flight where pilotInCommand > 0.0");
//
//    // TODO account for split flight as in instructor in for 30 min of the flight
//    def nightPicSolo = Flight.executeQuery ( "select sum ( night ) from Flight where dualReceived = 0.0");
//        
//    def nightTakeOffAndLandingSolo = Flight.executeQuery( "select sum( noNightLandings ) from Flight where night > 0 AND dualReceived = 0.0");
//
//    /*
//     * total times per aircraft type, ie C-172: 153.2 hrs.
//     *  - shoul be a has of TYPE - TIME
//     */
//    def totalTimePerAircraftType = [:];
//
//    // list of aircraft types flown
//    def types = Flight.executeQuery ( "select  aircraftType from Flight GROUP BY aircraftType");
//        println( "\n\nairplane types count: " + types + "\n\n");
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
