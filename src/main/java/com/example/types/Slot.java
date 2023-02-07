
package com.example.types;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Slot {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("seats")
    @Expose
    private Integer seats;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Slot() {
    }

    /**
     * 
     * @param time
     * @param seats
     */
    public Slot(String time, Integer seats) {
        super();
        this.time = time;
        this.seats = seats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Slot withTime(String time) {
        this.time = time;
        return this;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Slot withSeats(Integer seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Slot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("seats");
        sb.append('=');
        sb.append(((this.seats == null)?"<null>":this.seats));
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
        result = ((result* 31)+((this.seats == null)? 0 :this.seats.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Slot) == false) {
            return false;
        }
        Slot rhs = ((Slot) other);
        return (((this.seats == rhs.seats)||((this.seats!= null)&&this.seats.equals(rhs.seats)))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))));
    }

}
