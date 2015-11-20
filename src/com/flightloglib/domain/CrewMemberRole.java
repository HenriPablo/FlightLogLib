/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightloglib.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author tomekpilot
 */
@Entity
public class CrewMemberRole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crewmember_role_id")
    @SequenceGenerator( name = "crewmember_role_id", sequenceName = "crewmember_role_id", allocationSize = 1 )  
    long id;
    
    private long version;
    private String description;
    
    @OneToMany( cascade= CascadeType.ALL )
    private Set<CrewMember> crewMembers = new HashSet<CrewMember>(0);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    
    
    public Set getCrewMembers() {
        return this.crewMembers;
    }
    
    public void setCrewMembers(Set crewMembers) {
        this.crewMembers = crewMembers;
    }    
    
    
    @Override
    public String toString( ){
		return this.description;
}
    
}
