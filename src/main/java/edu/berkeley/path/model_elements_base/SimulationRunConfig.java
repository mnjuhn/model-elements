/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class SimulationRunConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SimulationRunConfig\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;

  /**
   * Default constructor.
   */
  public SimulationRunConfig() {}

  /**
   * All-args constructor.
   */
  public SimulationRunConfig(java.lang.CharSequence id, java.lang.CharSequence name) {
    this.id = id;
    this.name = name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
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

  /** Creates a new SimulationRunConfig RecordBuilder */
  public static edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder();
  }
  
  /** Creates a new SimulationRunConfig RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder other) {
    return new edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder(other);
  }
  
  /** Creates a new SimulationRunConfig RecordBuilder by copying an existing SimulationRunConfig instance */
  public static edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.SimulationRunConfig other) {
    return new edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for SimulationRunConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SimulationRunConfig>
    implements org.apache.avro.data.RecordBuilder<SimulationRunConfig> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.SimulationRunConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing SimulationRunConfig instance */
    private Builder(edu.berkeley.path.model_elements_base.SimulationRunConfig other) {
            super(edu.berkeley.path.model_elements_base.SimulationRunConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder setName(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.SimulationRunConfig.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SimulationRunConfig build() {
      try {
        SimulationRunConfig record = new SimulationRunConfig();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
