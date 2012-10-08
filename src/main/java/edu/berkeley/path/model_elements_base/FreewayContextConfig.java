/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Static configuration of a set of freeway runs.
   *
   * The parameters encapsulated here are separate from Scenario inputs
   * in that they express *how* the run is modeled and executed,
   * rather than *what* is modeled.
   *
   * These parameters are used by the Context subclasses.
   *
   * Note that a context does not include a scenario. Scenarios are read
   * dynamically using a ScenarioSource. */
public class FreewayContextConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreewayContextConfig\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Static configuration of a set of freeway runs.\\n   *\\n   * The parameters encapsulated here are separate from Scenario inputs\\n   * in that they express *how* the run is modeled and executed,\\n   * rather than *what* is modeled.\\n   *\\n   * These parameters are used by the Context subclasses.\\n   *\\n   * Note that a context does not include a scenario. Scenarios are read\\n   * dynamically using a ScenarioSource.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"runMode\",\"type\":{\"type\":\"enum\",\"name\":\"RunMode\",\"symbols\":[\"HISTORICAL\",\"LIVE\"]}},{\"name\":\"enkfParams\",\"type\":{\"type\":\"record\",\"name\":\"EnKFParams\",\"doc\":\"* Context and Run Config section\\n   *\\n   * Configuration that applies to one run or a group of runs.\\n   *\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"n_ensembles\",\"type\":\"int\"}]}},{\"name\":\"ctmType\",\"type\":{\"type\":\"enum\",\"name\":\"CTMType\",\"symbols\":[\"DENSITY\",\"VELOCITY\",\"FUSION\"]}},{\"name\":\"dtOutput\",\"type\":{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"dt\",\"type\":\"Duration\"},{\"name\":\"timeBegin\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public edu.berkeley.path.model_elements_base.RunMode runMode;
  @Deprecated public edu.berkeley.path.model_elements_base.EnKFParams enkfParams;
  @Deprecated public edu.berkeley.path.model_elements_base.CTMType ctmType;
  @Deprecated public edu.berkeley.path.model_elements_base.Duration dtOutput;
  @Deprecated public edu.berkeley.path.model_elements_base.Duration dt;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeBegin;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeEnd;

  /**
   * Default constructor.
   */
  public FreewayContextConfig() {}

  /**
   * All-args constructor.
   */
  public FreewayContextConfig(java.lang.CharSequence id, java.lang.CharSequence name, edu.berkeley.path.model_elements_base.RunMode runMode, edu.berkeley.path.model_elements_base.EnKFParams enkfParams, edu.berkeley.path.model_elements_base.CTMType ctmType, edu.berkeley.path.model_elements_base.Duration dtOutput, edu.berkeley.path.model_elements_base.Duration dt, edu.berkeley.path.model_elements_base.DateTime timeBegin, edu.berkeley.path.model_elements_base.DateTime timeEnd) {
    this.id = id;
    this.name = name;
    this.runMode = runMode;
    this.enkfParams = enkfParams;
    this.ctmType = ctmType;
    this.dtOutput = dtOutput;
    this.dt = dt;
    this.timeBegin = timeBegin;
    this.timeEnd = timeEnd;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return runMode;
    case 3: return enkfParams;
    case 4: return ctmType;
    case 5: return dtOutput;
    case 6: return dt;
    case 7: return timeBegin;
    case 8: return timeEnd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: runMode = (edu.berkeley.path.model_elements_base.RunMode)value$; break;
    case 3: enkfParams = (edu.berkeley.path.model_elements_base.EnKFParams)value$; break;
    case 4: ctmType = (edu.berkeley.path.model_elements_base.CTMType)value$; break;
    case 5: dtOutput = (edu.berkeley.path.model_elements_base.Duration)value$; break;
    case 6: dt = (edu.berkeley.path.model_elements_base.Duration)value$; break;
    case 7: timeBegin = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 8: timeEnd = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
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
   * Gets the value of the 'runMode' field.
   */
  public edu.berkeley.path.model_elements_base.RunMode getRunMode() {
    return runMode;
  }

  /**
   * Sets the value of the 'runMode' field.
   * @param value the value to set.
   */
  public void setRunMode(edu.berkeley.path.model_elements_base.RunMode value) {
    this.runMode = value;
  }

  /**
   * Gets the value of the 'enkfParams' field.
   */
  public edu.berkeley.path.model_elements_base.EnKFParams getEnkfParams() {
    return enkfParams;
  }

  /**
   * Sets the value of the 'enkfParams' field.
   * @param value the value to set.
   */
  public void setEnkfParams(edu.berkeley.path.model_elements_base.EnKFParams value) {
    this.enkfParams = value;
  }

  /**
   * Gets the value of the 'ctmType' field.
   */
  public edu.berkeley.path.model_elements_base.CTMType getCtmType() {
    return ctmType;
  }

  /**
   * Sets the value of the 'ctmType' field.
   * @param value the value to set.
   */
  public void setCtmType(edu.berkeley.path.model_elements_base.CTMType value) {
    this.ctmType = value;
  }

  /**
   * Gets the value of the 'dtOutput' field.
   */
  public edu.berkeley.path.model_elements_base.Duration getDtOutput() {
    return dtOutput;
  }

  /**
   * Sets the value of the 'dtOutput' field.
   * @param value the value to set.
   */
  public void setDtOutput(edu.berkeley.path.model_elements_base.Duration value) {
    this.dtOutput = value;
  }

  /**
   * Gets the value of the 'dt' field.
   */
  public edu.berkeley.path.model_elements_base.Duration getDt() {
    return dt;
  }

  /**
   * Sets the value of the 'dt' field.
   * @param value the value to set.
   */
  public void setDt(edu.berkeley.path.model_elements_base.Duration value) {
    this.dt = value;
  }

  /**
   * Gets the value of the 'timeBegin' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
    return timeBegin;
  }

  /**
   * Sets the value of the 'timeBegin' field.
   * @param value the value to set.
   */
  public void setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeBegin = value;
  }

  /**
   * Gets the value of the 'timeEnd' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
    return timeEnd;
  }

  /**
   * Sets the value of the 'timeEnd' field.
   * @param value the value to set.
   */
  public void setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeEnd = value;
  }

  /** Creates a new FreewayContextConfig RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder();
  }
  
  /** Creates a new FreewayContextConfig RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder other) {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder(other);
  }
  
  /** Creates a new FreewayContextConfig RecordBuilder by copying an existing FreewayContextConfig instance */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayContextConfig other) {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for FreewayContextConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreewayContextConfig>
    implements org.apache.avro.data.RecordBuilder<FreewayContextConfig> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private edu.berkeley.path.model_elements_base.RunMode runMode;
    private edu.berkeley.path.model_elements_base.EnKFParams enkfParams;
    private edu.berkeley.path.model_elements_base.CTMType ctmType;
    private edu.berkeley.path.model_elements_base.Duration dtOutput;
    private edu.berkeley.path.model_elements_base.Duration dt;
    private edu.berkeley.path.model_elements_base.DateTime timeBegin;
    private edu.berkeley.path.model_elements_base.DateTime timeEnd;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FreewayContextConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FreewayContextConfig instance */
    private Builder(edu.berkeley.path.model_elements_base.FreewayContextConfig other) {
            super(edu.berkeley.path.model_elements_base.FreewayContextConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.runMode)) {
        this.runMode = (edu.berkeley.path.model_elements_base.RunMode) data().deepCopy(fields()[2].schema(), other.runMode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.enkfParams)) {
        this.enkfParams = (edu.berkeley.path.model_elements_base.EnKFParams) data().deepCopy(fields()[3].schema(), other.enkfParams);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ctmType)) {
        this.ctmType = (edu.berkeley.path.model_elements_base.CTMType) data().deepCopy(fields()[4].schema(), other.ctmType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dtOutput)) {
        this.dtOutput = (edu.berkeley.path.model_elements_base.Duration) data().deepCopy(fields()[5].schema(), other.dtOutput);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dt)) {
        this.dt = (edu.berkeley.path.model_elements_base.Duration) data().deepCopy(fields()[6].schema(), other.dt);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.timeBegin)) {
        this.timeBegin = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[7].schema(), other.timeBegin);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timeEnd)) {
        this.timeEnd = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[8].schema(), other.timeEnd);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setName(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'runMode' field */
    public edu.berkeley.path.model_elements_base.RunMode getRunMode() {
      return runMode;
    }
    
    /** Sets the value of the 'runMode' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setRunMode(edu.berkeley.path.model_elements_base.RunMode value) {
      validate(fields()[2], value);
      this.runMode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'runMode' field has been set */
    public boolean hasRunMode() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'runMode' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearRunMode() {
      runMode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.EnKFParams getEnkfParams() {
      return enkfParams;
    }
    
    /** Sets the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setEnkfParams(edu.berkeley.path.model_elements_base.EnKFParams value) {
      validate(fields()[3], value);
      this.enkfParams = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'enkfParams' field has been set */
    public boolean hasEnkfParams() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearEnkfParams() {
      enkfParams = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ctmType' field */
    public edu.berkeley.path.model_elements_base.CTMType getCtmType() {
      return ctmType;
    }
    
    /** Sets the value of the 'ctmType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setCtmType(edu.berkeley.path.model_elements_base.CTMType value) {
      validate(fields()[4], value);
      this.ctmType = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ctmType' field has been set */
    public boolean hasCtmType() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ctmType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearCtmType() {
      ctmType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.Duration getDtOutput() {
      return dtOutput;
    }
    
    /** Sets the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setDtOutput(edu.berkeley.path.model_elements_base.Duration value) {
      validate(fields()[5], value);
      this.dtOutput = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'dtOutput' field has been set */
    public boolean hasDtOutput() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearDtOutput() {
      dtOutput = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.Duration getDt() {
      return dt;
    }
    
    /** Sets the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setDt(edu.berkeley.path.model_elements_base.Duration value) {
      validate(fields()[6], value);
      this.dt = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'dt' field has been set */
    public boolean hasDt() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearDt() {
      dt = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
      return timeBegin;
    }
    
    /** Sets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[7], value);
      this.timeBegin = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'timeBegin' field has been set */
    public boolean hasTimeBegin() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearTimeBegin() {
      timeBegin = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
      return timeEnd;
    }
    
    /** Sets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[8], value);
      this.timeEnd = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'timeEnd' field has been set */
    public boolean hasTimeEnd() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearTimeEnd() {
      timeEnd = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public FreewayContextConfig build() {
      try {
        FreewayContextConfig record = new FreewayContextConfig();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.runMode = fieldSetFlags()[2] ? this.runMode : (edu.berkeley.path.model_elements_base.RunMode) defaultValue(fields()[2]);
        record.enkfParams = fieldSetFlags()[3] ? this.enkfParams : (edu.berkeley.path.model_elements_base.EnKFParams) defaultValue(fields()[3]);
        record.ctmType = fieldSetFlags()[4] ? this.ctmType : (edu.berkeley.path.model_elements_base.CTMType) defaultValue(fields()[4]);
        record.dtOutput = fieldSetFlags()[5] ? this.dtOutput : (edu.berkeley.path.model_elements_base.Duration) defaultValue(fields()[5]);
        record.dt = fieldSetFlags()[6] ? this.dt : (edu.berkeley.path.model_elements_base.Duration) defaultValue(fields()[6]);
        record.timeBegin = fieldSetFlags()[7] ? this.timeBegin : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[7]);
        record.timeEnd = fieldSetFlags()[8] ? this.timeEnd : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
