/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Specification of split ratio time series across one or more networks,
   * for use in a scenario. */
public class SplitRatioSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SplitRatioSet\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Specification of split ratio time series across one or more networks,\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\n   * in this record, but as the map key in the SplitRatioSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}},\"doc\":\"* time series of ratios;\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]}},\"doc\":\"* map key is nodeId\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence description;
  /** * map key is nodeId */
  @Deprecated public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> profile;

  /**
   * Default constructor.
   */
  public SplitRatioSet() {}

  /**
   * All-args constructor.
   */
  public SplitRatioSet(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence description, java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> profile) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.profile = profile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return profile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: profile = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'profile' field.
   * * map key is nodeId   */
  public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> getProfile() {
    return profile;
  }

  /**
   * Sets the value of the 'profile' field.
   * * map key is nodeId   * @param value the value to set.
   */
  public void setProfile(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> value) {
    this.profile = value;
  }

  /** Creates a new SplitRatioSet RecordBuilder */
  public static edu.berkeley.path.model_elements_base.SplitRatioSet.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.SplitRatioSet.Builder();
  }
  
  /** Creates a new SplitRatioSet RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.SplitRatioSet.Builder newBuilder(edu.berkeley.path.model_elements_base.SplitRatioSet.Builder other) {
    return new edu.berkeley.path.model_elements_base.SplitRatioSet.Builder(other);
  }
  
  /** Creates a new SplitRatioSet RecordBuilder by copying an existing SplitRatioSet instance */
  public static edu.berkeley.path.model_elements_base.SplitRatioSet.Builder newBuilder(edu.berkeley.path.model_elements_base.SplitRatioSet other) {
    return new edu.berkeley.path.model_elements_base.SplitRatioSet.Builder(other);
  }
  
  /**
   * RecordBuilder for SplitRatioSet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SplitRatioSet>
    implements org.apache.avro.data.RecordBuilder<SplitRatioSet> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> profile;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.SplitRatioSet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.SplitRatioSet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing SplitRatioSet instance */
    private Builder(edu.berkeley.path.model_elements_base.SplitRatioSet other) {
            super(edu.berkeley.path.model_elements_base.SplitRatioSet.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profile)) {
        this.profile = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>) data().deepCopy(fields()[3].schema(), other.profile);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'profile' field */
    public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> getProfile() {
      return profile;
    }
    
    /** Sets the value of the 'profile' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder setProfile(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile> value) {
      validate(fields()[3], value);
      this.profile = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'profile' field has been set */
    public boolean hasProfile() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'profile' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet.Builder clearProfile() {
      profile = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public SplitRatioSet build() {
      try {
        SplitRatioSet record = new SplitRatioSet();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.profile = fieldSetFlags()[3] ? this.profile : (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}