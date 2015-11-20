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
public class CrewMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crewmember_id")
    @SequenceGenerator( name = "crewmember_id", sequenceName = "crewmember_id", allocationSize = 1 )
    long id;
    
    private long version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    @OneToOne(cascade= CascadeType.ALL)    
    private Pilot pilot;
    
    @OneToOne(cascade= CascadeType.ALL)    
    private CrewMemberRole crewMemberRole;
   // private Flight flight;
    

    /**
     * @return the pilot
     */
    public Pilot getPilot() {
        return pilot;
    }

    /**
     * @param pilot the pilot to set
     */
    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    /**
     * @return the crewMemberRole
     */
    public CrewMemberRole getCrewMemberRole() {
        return crewMemberRole;
    }

    /**
     * @param crewMemberRole the crewMemberRole to set
     */
    public void setCrewMemberRole(CrewMemberRole crewMemberRole) {
        this.crewMemberRole = crewMemberRole;
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
        return this.crewMemberRole.getDescription() + ": " + this.pilot.getFirstName() + " " + pilot.getLastName();
    }
    
    
}
 