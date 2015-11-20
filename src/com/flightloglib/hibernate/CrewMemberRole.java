package com.flightloglib.hibernate;
// Generated Aug 19, 2012 9:23:15 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * CrewMemberRole generated by hbm2java
 */
public class CrewMemberRole  implements java.io.Serializable {


     private long id;
     private long version;
     private String description;
     private Set crewMembers = new HashSet(0);

    public CrewMemberRole() {
    }

	
    public CrewMemberRole(long id) {
        this.id = id;
    }
    public CrewMemberRole(long id, String description, Set crewMembers) {
       this.id = id;
       this.description = description;
       this.crewMembers = crewMembers;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getCrewMembers() {
        return this.crewMembers;
    }
    
    public void setCrewMembers(Set crewMembers) {
        this.crewMembers = crewMembers;
    }




}


