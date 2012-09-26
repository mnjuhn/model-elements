/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements;  
@SuppressWarnings("all")
/** Demands on each link as time series */
public class DemandProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DemandProfile\",\"namespace\":\"edu.berkeley.path.model_elements\",\"doc\":\"Demands on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"origin\",\"type\":{\"type\":\"record\",\"name\":\"LinkRef\",\"fields\":[{\"name\":\"linkId\",\"type\":\"string\"}]},\"doc\":\"may not be null\"},{\"name\":\"destination\",\"type\":\"LinkRef\",\"doc\":\"may be null\"},{\"name\":\"demand\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]}");
  @Deprecated public double dt;
  @Deprecated public double startTime;
  /** may not be null */
  @Deprecated public edu.berkeley.path.model_elements.LinkRef origin;
  /** may be null */
  @Deprecated public edu.berkeley.path.model_elements.LinkRef destination;
  /** map key is linkId, array is time series, as per dt and startTime. */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> demand;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dt;
    case 1: return startTime;
    case 2: return origin;
    case 3: return destination;
    case 4: return demand;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dt = (java.lang.Double)value$; break;
    case 1: startTime = (java.lang.Double)value$; break;
    case 2: origin = (edu.berkeley.path.model_elements.LinkRef)value$; break;
    case 3: destination = (edu.berkeley.path.model_elements.LinkRef)value$; break;
    case 4: demand = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dt' field.
   */
  public java.lang.Double getDt() {
    return dt;
  }

  /**
   * Sets the value of the 'dt' field.
   * @param value the value to set.
   */
  public void setDt(java.lang.Double value) {
    this.dt = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   */
  public java.lang.Double getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Double value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'origin' field.
   * may not be null   */
  public edu.berkeley.path.model_elements.LinkRef getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the 'origin' field.
   * may not be null   * @param value the value to set.
   */
  public void setOrigin(edu.berkeley.path.model_elements.LinkRef value) {
    this.origin = value;
  }

  /**
   * Gets the value of the 'destination' field.
   * may be null   */
  public edu.berkeley.path.model_elements.LinkRef getDestination() {
    return destination;
  }

  /**
   * Sets the value of the 'destination' field.
   * may be null   * @param value the value to set.
   */
  public void setDestination(edu.berkeley.path.model_elements.LinkRef value) {
    this.destination = value;
  }

  /**
   * Gets the value of the 'demand' field.
   * map key is linkId, array is time series, as per dt and startTime.   */
  public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getDemand() {
    return demand;
  }

  /**
   * Sets the value of the 'demand' field.
   * map key is linkId, array is time series, as per dt and startTime.   * @param value the value to set.
   */
  public void setDemand(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
    this.demand = value;
  }

  /** Creates a new DemandProfile RecordBuilder */
  public static edu.berkeley.path.model_elements.DemandProfile.Builder newBuilder() {
    return new edu.berkeley.path.model_elements.DemandProfile.Builder();
  }
  
  /** Creates a new DemandProfile RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements.DemandProfile.Builder newBuilder(edu.berkeley.path.model_elements.DemandProfile.Builder other) {
    return new edu.berkeley.path.model_elements.DemandProfile.Builder(other);
  }
  
  /** Creates a new DemandProfile RecordBuilder by copying an existing DemandProfile instance */
  public static edu.berkeley.path.model_elements.DemandProfile.Builder newBuilder(edu.berkeley.path.model_elements.DemandProfile other) {
    return new edu.berkeley.path.model_elements.DemandProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for DemandProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DemandProfile>
    implements org.apache.avro.data.RecordBuilder<DemandProfile> {

    private double dt;
    private double startTime;
    private edu.berkeley.path.model_elements.LinkRef origin;
    private edu.berkeley.path.model_elements.LinkRef destination;
    private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> demand;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements.DemandProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements.DemandProfile.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DemandProfile instance */
    private Builder(edu.berkeley.path.model_elements.DemandProfile other) {
            super(edu.berkeley.path.model_elements.DemandProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.dt)) {
        this.dt = (java.lang.Double) data().deepCopy(fields()[0].schema(), other.dt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startTime)) {
        this.startTime = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.startTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.origin)) {
        this.origin = (edu.berkeley.path.model_elements.LinkRef) data().deepCopy(fields()[2].schema(), other.origin);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.destination)) {
        this.destination = (edu.berkeley.path.model_elements.LinkRef) data().deepCopy(fields()[3].schema(), other.destination);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.demand)) {
        this.demand = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>) data().deepCopy(fields()[4].schema(), other.demand);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'dt' field */
    public java.lang.Double getDt() {
      return dt;
    }
    
    /** Sets the value of the 'dt' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder setDt(double value) {
      validate(fields()[0], value);
      this.dt = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dt' field has been set */
    public boolean hasDt() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dt' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder clearDt() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Double getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder setStartTime(double value) {
      validate(fields()[1], value);
      this.startTime = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'startTime' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder clearStartTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'origin' field */
    public edu.berkeley.path.model_elements.LinkRef getOrigin() {
      return origin;
    }
    
    /** Sets the value of the 'origin' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder setOrigin(edu.berkeley.path.model_elements.LinkRef value) {
      validate(fields()[2], value);
      this.origin = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'origin' field has been set */
    public boolean hasOrigin() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'origin' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder clearOrigin() {
      origin = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'destination' field */
    public edu.berkeley.path.model_elements.LinkRef getDestination() {
      return destination;
    }
    
    /** Sets the value of the 'destination' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder setDestination(edu.berkeley.path.model_elements.LinkRef value) {
      validate(fields()[3], value);
      this.destination = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'destination' field has been set */
    public boolean hasDestination() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'destination' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder clearDestination() {
      destination = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'demand' field */
    public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getDemand() {
      return demand;
    }
    
    /** Sets the value of the 'demand' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder setDemand(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
      validate(fields()[4], value);
      this.demand = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'demand' field has been set */
    public boolean hasDemand() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'demand' field */
    public edu.berkeley.path.model_elements.DemandProfile.Builder clearDemand() {
      demand = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public DemandProfile build() {
      try {
        DemandProfile record = new DemandProfile();
        record.dt = fieldSetFlags()[0] ? this.dt : (java.lang.Double) defaultValue(fields()[0]);
        record.startTime = fieldSetFlags()[1] ? this.startTime : (java.lang.Double) defaultValue(fields()[1]);
        record.origin = fieldSetFlags()[2] ? this.origin : (edu.berkeley.path.model_elements.LinkRef) defaultValue(fields()[2]);
        record.destination = fieldSetFlags()[3] ? this.destination : (edu.berkeley.path.model_elements.LinkRef) defaultValue(fields()[3]);
        record.demand = fieldSetFlags()[4] ? this.demand : (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
