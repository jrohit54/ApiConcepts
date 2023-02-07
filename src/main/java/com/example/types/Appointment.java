
package com.example.types;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Appointment {

    @SerializedName("sessions")
    @Expose
    private List<Session> sessions = new ArrayList<Session>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Appointment() {
    }

    /**
     * 
     * @param sessions
     */
    public Appointment(List<Session> sessions) {
        super();
        this.sessions = sessions;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Appointment withSessions(List<Session> sessions) {
        this.sessions = sessions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Appointment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sessions");
        sb.append('=');
        sb.append(((this.sessions == null)?"<null>":this.sessions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sessions == null)? 0 :this.sessions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Appointment) == false) {
            return false;
        }
        Appointment rhs = ((Appointment) other);
        return ((this.sessions == rhs.sessions)||((this.sessions!= null)&&this.sessions.equals(rhs.sessions)));
    }

}
