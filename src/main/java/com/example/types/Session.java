
package com.example.types;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Session {

    @SerializedName("center_id")
    @Expose
    private Integer centerId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("district_name")
    @Expose
    private String districtName;
    @SerializedName("block_name")
    @Expose
    private String blockName;
    @SerializedName("pincode")
    @Expose
    private Integer pincode;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("lat")
    @Expose
    private Integer lat;
    @SerializedName("long")
    @Expose
    private Integer _long;
    @SerializedName("fee_type")
    @Expose
    private String feeType;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("available_capacity")
    @Expose
    private Integer availableCapacity;
    @SerializedName("available_capacity_dose1")
    @Expose
    private Integer availableCapacityDose1;
    @SerializedName("available_capacity_dose2")
    @Expose
    private Integer availableCapacityDose2;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("allow_all_age")
    @Expose
    private Boolean allowAllAge;
    @SerializedName("min_age_limit")
    @Expose
    private Integer minAgeLimit;
    @SerializedName("max_age_limit")
    @Expose
    private Integer maxAgeLimit;
    @SerializedName("vaccine")
    @Expose
    private String vaccine;
    @SerializedName("slots")
    @Expose
    private List<Slot> slots = new ArrayList<Slot>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Session() {
    }

    /**
     * 
     * @param date
     * @param centerId
     * @param pincode
     * @param availableCapacity
     * @param minAgeLimit
     * @param address
     * @param districtName
     * @param blockName
     * @param fee
     * @param sessionId
     * @param feeType
     * @param maxAgeLimit
     * @param availableCapacityDose1
     * @param availableCapacityDose2
     * @param vaccine
     * @param slots
     * @param stateName
     * @param _long
     * @param name
     * @param from
     * @param to
     * @param lat
     * @param allowAllAge
     */
    public Session(Integer centerId, String name, String address, String stateName, String districtName, String blockName, Integer pincode, String from, String to, Integer lat, Integer _long, String feeType, String sessionId, String date, Integer availableCapacity, Integer availableCapacityDose1, Integer availableCapacityDose2, String fee, Boolean allowAllAge, Integer minAgeLimit, Integer maxAgeLimit, String vaccine, List<Slot> slots) {
        super();
        this.centerId = centerId;
        this.name = name;
        this.address = address;
        this.stateName = stateName;
        this.districtName = districtName;
        this.blockName = blockName;
        this.pincode = pincode;
        this.from = from;
        this.to = to;
        this.lat = lat;
        this._long = _long;
        this.feeType = feeType;
        this.sessionId = sessionId;
        this.date = date;
        this.availableCapacity = availableCapacity;
        this.availableCapacityDose1 = availableCapacityDose1;
        this.availableCapacityDose2 = availableCapacityDose2;
        this.fee = fee;
        this.allowAllAge = allowAllAge;
        this.minAgeLimit = minAgeLimit;
        this.maxAgeLimit = maxAgeLimit;
        this.vaccine = vaccine;
        this.slots = slots;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Session withCenterId(Integer centerId) {
        this.centerId = centerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Session withName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Session withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Session withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Session withDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Session withBlockName(String blockName) {
        this.blockName = blockName;
        return this;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Session withPincode(Integer pincode) {
        this.pincode = pincode;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Session withFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Session withTo(String to) {
        this.to = to;
        return this;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Session withLat(Integer lat) {
        this.lat = lat;
        return this;
    }

    public Integer getLong() {
        return _long;
    }

    public void setLong(Integer _long) {
        this._long = _long;
    }

    public Session withLong(Integer _long) {
        this._long = _long;
        return this;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Session withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Session withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Session withDate(String date) {
        this.date = date;
        return this;
    }

    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public Session withAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    public Integer getAvailableCapacityDose1() {
        return availableCapacityDose1;
    }

    public void setAvailableCapacityDose1(Integer availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
    }

    public Session withAvailableCapacityDose1(Integer availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
        return this;
    }

    public Integer getAvailableCapacityDose2() {
        return availableCapacityDose2;
    }

    public void setAvailableCapacityDose2(Integer availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
    }

    public Session withAvailableCapacityDose2(Integer availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
        return this;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Session withFee(String fee) {
        this.fee = fee;
        return this;
    }

    public Boolean getAllowAllAge() {
        return allowAllAge;
    }

    public void setAllowAllAge(Boolean allowAllAge) {
        this.allowAllAge = allowAllAge;
    }

    public Session withAllowAllAge(Boolean allowAllAge) {
        this.allowAllAge = allowAllAge;
        return this;
    }

    public Integer getMinAgeLimit() {
        return minAgeLimit;
    }

    public void setMinAgeLimit(Integer minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    public Session withMinAgeLimit(Integer minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
        return this;
    }

    public Integer getMaxAgeLimit() {
        return maxAgeLimit;
    }

    public void setMaxAgeLimit(Integer maxAgeLimit) {
        this.maxAgeLimit = maxAgeLimit;
    }

    public Session withMaxAgeLimit(Integer maxAgeLimit) {
        this.maxAgeLimit = maxAgeLimit;
        return this;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public Session withVaccine(String vaccine) {
        this.vaccine = vaccine;
        return this;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public Session withSlots(List<Slot> slots) {
        this.slots = slots;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Session.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("centerId");
        sb.append('=');
        sb.append(((this.centerId == null)?"<null>":this.centerId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("stateName");
        sb.append('=');
        sb.append(((this.stateName == null)?"<null>":this.stateName));
        sb.append(',');
        sb.append("districtName");
        sb.append('=');
        sb.append(((this.districtName == null)?"<null>":this.districtName));
        sb.append(',');
        sb.append("blockName");
        sb.append('=');
        sb.append(((this.blockName == null)?"<null>":this.blockName));
        sb.append(',');
        sb.append("pincode");
        sb.append('=');
        sb.append(((this.pincode == null)?"<null>":this.pincode));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("_long");
        sb.append('=');
        sb.append(((this._long == null)?"<null>":this._long));
        sb.append(',');
        sb.append("feeType");
        sb.append('=');
        sb.append(((this.feeType == null)?"<null>":this.feeType));
        sb.append(',');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("availableCapacity");
        sb.append('=');
        sb.append(((this.availableCapacity == null)?"<null>":this.availableCapacity));
        sb.append(',');
        sb.append("availableCapacityDose1");
        sb.append('=');
        sb.append(((this.availableCapacityDose1 == null)?"<null>":this.availableCapacityDose1));
        sb.append(',');
        sb.append("availableCapacityDose2");
        sb.append('=');
        sb.append(((this.availableCapacityDose2 == null)?"<null>":this.availableCapacityDose2));
        sb.append(',');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("allowAllAge");
        sb.append('=');
        sb.append(((this.allowAllAge == null)?"<null>":this.allowAllAge));
        sb.append(',');
        sb.append("minAgeLimit");
        sb.append('=');
        sb.append(((this.minAgeLimit == null)?"<null>":this.minAgeLimit));
        sb.append(',');
        sb.append("maxAgeLimit");
        sb.append('=');
        sb.append(((this.maxAgeLimit == null)?"<null>":this.maxAgeLimit));
        sb.append(',');
        sb.append("vaccine");
        sb.append('=');
        sb.append(((this.vaccine == null)?"<null>":this.vaccine));
        sb.append(',');
        sb.append("slots");
        sb.append('=');
        sb.append(((this.slots == null)?"<null>":this.slots));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.centerId == null)? 0 :this.centerId.hashCode()));
        result = ((result* 31)+((this.pincode == null)? 0 :this.pincode.hashCode()));
        result = ((result* 31)+((this.availableCapacity == null)? 0 :this.availableCapacity.hashCode()));
        result = ((result* 31)+((this.minAgeLimit == null)? 0 :this.minAgeLimit.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.districtName == null)? 0 :this.districtName.hashCode()));
        result = ((result* 31)+((this.blockName == null)? 0 :this.blockName.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.sessionId == null)? 0 :this.sessionId.hashCode()));
        result = ((result* 31)+((this.feeType == null)? 0 :this.feeType.hashCode()));
        result = ((result* 31)+((this.maxAgeLimit == null)? 0 :this.maxAgeLimit.hashCode()));
        result = ((result* 31)+((this.availableCapacityDose1 == null)? 0 :this.availableCapacityDose1 .hashCode()));
        result = ((result* 31)+((this.availableCapacityDose2 == null)? 0 :this.availableCapacityDose2 .hashCode()));
        result = ((result* 31)+((this.vaccine == null)? 0 :this.vaccine.hashCode()));
        result = ((result* 31)+((this.slots == null)? 0 :this.slots.hashCode()));
        result = ((result* 31)+((this.stateName == null)? 0 :this.stateName.hashCode()));
        result = ((result* 31)+((this._long == null)? 0 :this._long.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        result = ((result* 31)+((this.allowAllAge == null)? 0 :this.allowAllAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Session) == false) {
            return false;
        }
        Session rhs = ((Session) other);
        return ((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.centerId == rhs.centerId)||((this.centerId!= null)&&this.centerId.equals(rhs.centerId))))&&((this.pincode == rhs.pincode)||((this.pincode!= null)&&this.pincode.equals(rhs.pincode))))&&((this.availableCapacity == rhs.availableCapacity)||((this.availableCapacity!= null)&&this.availableCapacity.equals(rhs.availableCapacity))))&&((this.minAgeLimit == rhs.minAgeLimit)||((this.minAgeLimit!= null)&&this.minAgeLimit.equals(rhs.minAgeLimit))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.districtName == rhs.districtName)||((this.districtName!= null)&&this.districtName.equals(rhs.districtName))))&&((this.blockName == rhs.blockName)||((this.blockName!= null)&&this.blockName.equals(rhs.blockName))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.sessionId == rhs.sessionId)||((this.sessionId!= null)&&this.sessionId.equals(rhs.sessionId))))&&((this.feeType == rhs.feeType)||((this.feeType!= null)&&this.feeType.equals(rhs.feeType))))&&((this.maxAgeLimit == rhs.maxAgeLimit)||((this.maxAgeLimit!= null)&&this.maxAgeLimit.equals(rhs.maxAgeLimit))))&&((this.availableCapacityDose1 == rhs.availableCapacityDose1)||((this.availableCapacityDose1 != null)&&this.availableCapacityDose1 .equals(rhs.availableCapacityDose1))))&&((this.availableCapacityDose2 == rhs.availableCapacityDose2)||((this.availableCapacityDose2 != null)&&this.availableCapacityDose2 .equals(rhs.availableCapacityDose2))))&&((this.vaccine == rhs.vaccine)||((this.vaccine!= null)&&this.vaccine.equals(rhs.vaccine))))&&((this.slots == rhs.slots)||((this.slots!= null)&&this.slots.equals(rhs.slots))))&&((this.stateName == rhs.stateName)||((this.stateName!= null)&&this.stateName.equals(rhs.stateName))))&&((this._long == rhs._long)||((this._long!= null)&&this._long.equals(rhs._long))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))))&&((this.allowAllAge == rhs.allowAllAge)||((this.allowAllAge!= null)&&this.allowAllAge.equals(rhs.allowAllAge))));
    }

}
