/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class Node extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Node\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"]}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.Double latitude;
  @Deprecated public java.lang.Double longitude;

  /**
   * Default constructor.
   */
  public Node() {}

  /**
   * All-args constructor.
   */
  public Node(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence type, java.lang.Double latitude, java.lang.Double longitude) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    case 3: return latitude;
    case 4: return longitude;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.CharSequence)value$; break;
    case 3: latitude = (java.lang.Double)value$; break;
    case 4: longitude = (java.lang.Double)value$; break;
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
   * Gets the value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'latitude' field.
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(java.lang.Double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(java.lang.Double value) {
    this.longitude = value;
  }

  /** Creates a new Node RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Node.Builder();
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder(edu.berkeley.path.model_elements_base.Node.Builder other) {
    return new edu.berkeley.path.model_elements_base.Node.Builder(other);
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Node instance */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder(edu.berkeley.path.model_elements_base.Node other) {
    return new edu.berkeley.path.model_elements_base.Node.Builder(other);
  }
  
  /**
   * RecordBuilder for Node instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Node>
    implements org.apache.avro.data.RecordBuilder<Node> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence type;
    private java.lang.Double latitude;
    private java.lang.Double longitude;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Node.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Node.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Node instance */
    private Builder(edu.berkeley.path.model_elements_base.Node other) {
            super(edu.berkeley.path.model_elements_base.Node.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.latitude)) {
        this.latitude = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.latitude);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.longitude)) {
        this.longitude = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.longitude);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.Node.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setName(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.Node.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Node.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'latitude' field */
    public java.lang.Double getLatitude() {
      return latitude;
    }
    
    /** Sets the value of the 'latitude' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setLatitude(java.lang.Double value) {
      validate(fields()[3], value);
      this.latitude = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'latitude' field has been set */
    public boolean hasLatitude() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'latitude' field */
    public edu.berkeley.path.model_elements_base.Node.Builder clearLatitude() {
      latitude = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'longitude' field */
    public java.lang.Double getLongitude() {
      return longitude;
    }
    
    /** Sets the value of the 'longitude' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setLongitude(java.lang.Double value) {
      validate(fields()[4], value);
      this.longitude = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'longitude' field has been set */
    public boolean hasLongitude() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'longitude' field */
    public edu.berkeley.path.model_elements_base.Node.Builder clearLongitude() {
      longitude = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Node build() {
      try {
        Node record = new Node();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.latitude = fieldSetFlags()[3] ? this.latitude : (java.lang.Double) defaultValue(fields()[3]);
        record.longitude = fieldSetFlags()[4] ? this.longitude : (java.lang.Double) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
