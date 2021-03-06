/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class EnKFConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnKFConfig\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"enkfType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dtEnKF\",\"type\":{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"includePeMS\",\"type\":\"boolean\"},{\"name\":\"pemsNoiseMean\",\"type\":\"double\"},{\"name\":\"pemsNoiseStdev\",\"type\":\"double\"},{\"name\":\"PemsBlackList\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"probeProbabilityThreshold\",\"type\":\"double\"},{\"name\":\"probeSpeedThreshold\",\"type\":\"double\"},{\"name\":\"pifRunId\",\"type\":\"int\"},{\"name\":\"includeNavteq\",\"type\":\"boolean\"},{\"name\":\"navteqNoiseMean\",\"type\":\"double\"},{\"name\":\"navteqNoiseStdev\",\"type\":\"double\"},{\"name\":\"navteqPercentage\",\"type\":\"double\"},{\"name\":\"includeTelenav\",\"type\":\"boolean\"},{\"name\":\"telenavNoiseMean\",\"type\":\"double\"},{\"name\":\"telenavNoiseStdev\",\"type\":\"double\"},{\"name\":\"telenavPercentage\",\"type\":\"double\"},{\"name\":\"useLocalization\",\"type\":\"boolean\"},{\"name\":\"localizationDistance\",\"type\":\"double\"}]}");
  @Deprecated public java.lang.String enkfType;
  @Deprecated public edu.berkeley.path.model_elements_base.Duration dtEnKF;
  @Deprecated public boolean includePeMS;
  @Deprecated public double pemsNoiseMean;
  @Deprecated public double pemsNoiseStdev;
  @Deprecated public java.util.List<java.lang.Integer> PemsBlackList;
  @Deprecated public double probeProbabilityThreshold;
  @Deprecated public double probeSpeedThreshold;
  @Deprecated public int pifRunId;
  @Deprecated public boolean includeNavteq;
  @Deprecated public double navteqNoiseMean;
  @Deprecated public double navteqNoiseStdev;
  @Deprecated public double navteqPercentage;
  @Deprecated public boolean includeTelenav;
  @Deprecated public double telenavNoiseMean;
  @Deprecated public double telenavNoiseStdev;
  @Deprecated public double telenavPercentage;
  @Deprecated public boolean useLocalization;
  @Deprecated public double localizationDistance;

  /**
   * Default constructor.
   */
  public EnKFConfig() {}

  /**
   * All-args constructor.
   */
  public EnKFConfig(java.lang.String enkfType, edu.berkeley.path.model_elements_base.Duration dtEnKF, java.lang.Boolean includePeMS, java.lang.Double pemsNoiseMean, java.lang.Double pemsNoiseStdev, java.util.List<java.lang.Integer> PemsBlackList, java.lang.Double probeProbabilityThreshold, java.lang.Double probeSpeedThreshold, java.lang.Integer pifRunId, java.lang.Boolean includeNavteq, java.lang.Double navteqNoiseMean, java.lang.Double navteqNoiseStdev, java.lang.Double navteqPercentage, java.lang.Boolean includeTelenav, java.lang.Double telenavNoiseMean, java.lang.Double telenavNoiseStdev, java.lang.Double telenavPercentage, java.lang.Boolean useLocalization, java.lang.Double localizationDistance) {
    this.enkfType = enkfType;
    this.dtEnKF = dtEnKF;
    this.includePeMS = includePeMS;
    this.pemsNoiseMean = pemsNoiseMean;
    this.pemsNoiseStdev = pemsNoiseStdev;
    this.PemsBlackList = PemsBlackList;
    this.probeProbabilityThreshold = probeProbabilityThreshold;
    this.probeSpeedThreshold = probeSpeedThreshold;
    this.pifRunId = pifRunId;
    this.includeNavteq = includeNavteq;
    this.navteqNoiseMean = navteqNoiseMean;
    this.navteqNoiseStdev = navteqNoiseStdev;
    this.navteqPercentage = navteqPercentage;
    this.includeTelenav = includeTelenav;
    this.telenavNoiseMean = telenavNoiseMean;
    this.telenavNoiseStdev = telenavNoiseStdev;
    this.telenavPercentage = telenavPercentage;
    this.useLocalization = useLocalization;
    this.localizationDistance = localizationDistance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return enkfType;
    case 1: return dtEnKF;
    case 2: return includePeMS;
    case 3: return pemsNoiseMean;
    case 4: return pemsNoiseStdev;
    case 5: return PemsBlackList;
    case 6: return probeProbabilityThreshold;
    case 7: return probeSpeedThreshold;
    case 8: return pifRunId;
    case 9: return includeNavteq;
    case 10: return navteqNoiseMean;
    case 11: return navteqNoiseStdev;
    case 12: return navteqPercentage;
    case 13: return includeTelenav;
    case 14: return telenavNoiseMean;
    case 15: return telenavNoiseStdev;
    case 16: return telenavPercentage;
    case 17: return useLocalization;
    case 18: return localizationDistance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: enkfType = (java.lang.String)value$; break;
    case 1: dtEnKF = (edu.berkeley.path.model_elements_base.Duration)value$; break;
    case 2: includePeMS = (java.lang.Boolean)value$; break;
    case 3: pemsNoiseMean = (java.lang.Double)value$; break;
    case 4: pemsNoiseStdev = (java.lang.Double)value$; break;
    case 5: PemsBlackList = (java.util.List<java.lang.Integer>)value$; break;
    case 6: probeProbabilityThreshold = (java.lang.Double)value$; break;
    case 7: probeSpeedThreshold = (java.lang.Double)value$; break;
    case 8: pifRunId = (java.lang.Integer)value$; break;
    case 9: includeNavteq = (java.lang.Boolean)value$; break;
    case 10: navteqNoiseMean = (java.lang.Double)value$; break;
    case 11: navteqNoiseStdev = (java.lang.Double)value$; break;
    case 12: navteqPercentage = (java.lang.Double)value$; break;
    case 13: includeTelenav = (java.lang.Boolean)value$; break;
    case 14: telenavNoiseMean = (java.lang.Double)value$; break;
    case 15: telenavNoiseStdev = (java.lang.Double)value$; break;
    case 16: telenavPercentage = (java.lang.Double)value$; break;
    case 17: useLocalization = (java.lang.Boolean)value$; break;
    case 18: localizationDistance = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'enkfType' field.
   */
  public java.lang.String getEnkfType() {
    return enkfType;
  }

  /**
   * Sets the value of the 'enkfType' field.
   * @param value the value to set.
   */
  public void setEnkfType(java.lang.String value) {
    this.enkfType = value;
  }

  /**
   * Gets the value of the 'dtEnKF' field.
   */
  public edu.berkeley.path.model_elements_base.Duration getDtEnKF() {
    return dtEnKF;
  }

  /**
   * Sets the value of the 'dtEnKF' field.
   * @param value the value to set.
   */
  public void setDtEnKF(edu.berkeley.path.model_elements_base.Duration value) {
    this.dtEnKF = value;
  }

  /**
   * Gets the value of the 'includePeMS' field.
   */
  public java.lang.Boolean getIncludePeMS() {
    return includePeMS;
  }

  /**
   * Sets the value of the 'includePeMS' field.
   * @param value the value to set.
   */
  public void setIncludePeMS(java.lang.Boolean value) {
    this.includePeMS = value;
  }

  /**
   * Gets the value of the 'pemsNoiseMean' field.
   */
  public java.lang.Double getPemsNoiseMean() {
    return pemsNoiseMean;
  }

  /**
   * Sets the value of the 'pemsNoiseMean' field.
   * @param value the value to set.
   */
  public void setPemsNoiseMean(java.lang.Double value) {
    this.pemsNoiseMean = value;
  }

  /**
   * Gets the value of the 'pemsNoiseStdev' field.
   */
  public java.lang.Double getPemsNoiseStdev() {
    return pemsNoiseStdev;
  }

  /**
   * Sets the value of the 'pemsNoiseStdev' field.
   * @param value the value to set.
   */
  public void setPemsNoiseStdev(java.lang.Double value) {
    this.pemsNoiseStdev = value;
  }

  /**
   * Gets the value of the 'PemsBlackList' field.
   */
  public java.util.List<java.lang.Integer> getPemsBlackList() {
    return PemsBlackList;
  }

  /**
   * Sets the value of the 'PemsBlackList' field.
   * @param value the value to set.
   */
  public void setPemsBlackList(java.util.List<java.lang.Integer> value) {
    this.PemsBlackList = value;
  }

  /**
   * Gets the value of the 'probeProbabilityThreshold' field.
   */
  public java.lang.Double getProbeProbabilityThreshold() {
    return probeProbabilityThreshold;
  }

  /**
   * Sets the value of the 'probeProbabilityThreshold' field.
   * @param value the value to set.
   */
  public void setProbeProbabilityThreshold(java.lang.Double value) {
    this.probeProbabilityThreshold = value;
  }

  /**
   * Gets the value of the 'probeSpeedThreshold' field.
   */
  public java.lang.Double getProbeSpeedThreshold() {
    return probeSpeedThreshold;
  }

  /**
   * Sets the value of the 'probeSpeedThreshold' field.
   * @param value the value to set.
   */
  public void setProbeSpeedThreshold(java.lang.Double value) {
    this.probeSpeedThreshold = value;
  }

  /**
   * Gets the value of the 'pifRunId' field.
   */
  public java.lang.Integer getPifRunId() {
    return pifRunId;
  }

  /**
   * Sets the value of the 'pifRunId' field.
   * @param value the value to set.
   */
  public void setPifRunId(java.lang.Integer value) {
    this.pifRunId = value;
  }

  /**
   * Gets the value of the 'includeNavteq' field.
   */
  public java.lang.Boolean getIncludeNavteq() {
    return includeNavteq;
  }

  /**
   * Sets the value of the 'includeNavteq' field.
   * @param value the value to set.
   */
  public void setIncludeNavteq(java.lang.Boolean value) {
    this.includeNavteq = value;
  }

  /**
   * Gets the value of the 'navteqNoiseMean' field.
   */
  public java.lang.Double getNavteqNoiseMean() {
    return navteqNoiseMean;
  }

  /**
   * Sets the value of the 'navteqNoiseMean' field.
   * @param value the value to set.
   */
  public void setNavteqNoiseMean(java.lang.Double value) {
    this.navteqNoiseMean = value;
  }

  /**
   * Gets the value of the 'navteqNoiseStdev' field.
   */
  public java.lang.Double getNavteqNoiseStdev() {
    return navteqNoiseStdev;
  }

  /**
   * Sets the value of the 'navteqNoiseStdev' field.
   * @param value the value to set.
   */
  public void setNavteqNoiseStdev(java.lang.Double value) {
    this.navteqNoiseStdev = value;
  }

  /**
   * Gets the value of the 'navteqPercentage' field.
   */
  public java.lang.Double getNavteqPercentage() {
    return navteqPercentage;
  }

  /**
   * Sets the value of the 'navteqPercentage' field.
   * @param value the value to set.
   */
  public void setNavteqPercentage(java.lang.Double value) {
    this.navteqPercentage = value;
  }

  /**
   * Gets the value of the 'includeTelenav' field.
   */
  public java.lang.Boolean getIncludeTelenav() {
    return includeTelenav;
  }

  /**
   * Sets the value of the 'includeTelenav' field.
   * @param value the value to set.
   */
  public void setIncludeTelenav(java.lang.Boolean value) {
    this.includeTelenav = value;
  }

  /**
   * Gets the value of the 'telenavNoiseMean' field.
   */
  public java.lang.Double getTelenavNoiseMean() {
    return telenavNoiseMean;
  }

  /**
   * Sets the value of the 'telenavNoiseMean' field.
   * @param value the value to set.
   */
  public void setTelenavNoiseMean(java.lang.Double value) {
    this.telenavNoiseMean = value;
  }

  /**
   * Gets the value of the 'telenavNoiseStdev' field.
   */
  public java.lang.Double getTelenavNoiseStdev() {
    return telenavNoiseStdev;
  }

  /**
   * Sets the value of the 'telenavNoiseStdev' field.
   * @param value the value to set.
   */
  public void setTelenavNoiseStdev(java.lang.Double value) {
    this.telenavNoiseStdev = value;
  }

  /**
   * Gets the value of the 'telenavPercentage' field.
   */
  public java.lang.Double getTelenavPercentage() {
    return telenavPercentage;
  }

  /**
   * Sets the value of the 'telenavPercentage' field.
   * @param value the value to set.
   */
  public void setTelenavPercentage(java.lang.Double value) {
    this.telenavPercentage = value;
  }

  /**
   * Gets the value of the 'useLocalization' field.
   */
  public java.lang.Boolean getUseLocalization() {
    return useLocalization;
  }

  /**
   * Sets the value of the 'useLocalization' field.
   * @param value the value to set.
   */
  public void setUseLocalization(java.lang.Boolean value) {
    this.useLocalization = value;
  }

  /**
   * Gets the value of the 'localizationDistance' field.
   */
  public java.lang.Double getLocalizationDistance() {
    return localizationDistance;
  }

  /**
   * Sets the value of the 'localizationDistance' field.
   * @param value the value to set.
   */
  public void setLocalizationDistance(java.lang.Double value) {
    this.localizationDistance = value;
  }

  /** Creates a new EnKFConfig RecordBuilder */
  public static edu.berkeley.path.model_elements_base.EnKFConfig.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.EnKFConfig.Builder();
  }
  
  /** Creates a new EnKFConfig RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.EnKFConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.EnKFConfig.Builder other) {
    return new edu.berkeley.path.model_elements_base.EnKFConfig.Builder(other);
  }
  
  /** Creates a new EnKFConfig RecordBuilder by copying an existing EnKFConfig instance */
  public static edu.berkeley.path.model_elements_base.EnKFConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.EnKFConfig other) {
    return new edu.berkeley.path.model_elements_base.EnKFConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for EnKFConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnKFConfig>
    implements org.apache.avro.data.RecordBuilder<EnKFConfig> {

    private java.lang.String enkfType;
    private edu.berkeley.path.model_elements_base.Duration dtEnKF;
    private boolean includePeMS;
    private double pemsNoiseMean;
    private double pemsNoiseStdev;
    private java.util.List<java.lang.Integer> PemsBlackList;
    private double probeProbabilityThreshold;
    private double probeSpeedThreshold;
    private int pifRunId;
    private boolean includeNavteq;
    private double navteqNoiseMean;
    private double navteqNoiseStdev;
    private double navteqPercentage;
    private boolean includeTelenav;
    private double telenavNoiseMean;
    private double telenavNoiseStdev;
    private double telenavPercentage;
    private boolean useLocalization;
    private double localizationDistance;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.EnKFConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.EnKFConfig.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing EnKFConfig instance */
    private Builder(edu.berkeley.path.model_elements_base.EnKFConfig other) {
            super(edu.berkeley.path.model_elements_base.EnKFConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.enkfType)) {
        this.enkfType = (java.lang.String) data().deepCopy(fields()[0].schema(), other.enkfType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dtEnKF)) {
        this.dtEnKF = (edu.berkeley.path.model_elements_base.Duration) data().deepCopy(fields()[1].schema(), other.dtEnKF);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.includePeMS)) {
        this.includePeMS = (java.lang.Boolean) data().deepCopy(fields()[2].schema(), other.includePeMS);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.pemsNoiseMean)) {
        this.pemsNoiseMean = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.pemsNoiseMean);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pemsNoiseStdev)) {
        this.pemsNoiseStdev = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.pemsNoiseStdev);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.PemsBlackList)) {
        this.PemsBlackList = (java.util.List<java.lang.Integer>) data().deepCopy(fields()[5].schema(), other.PemsBlackList);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.probeProbabilityThreshold)) {
        this.probeProbabilityThreshold = (java.lang.Double) data().deepCopy(fields()[6].schema(), other.probeProbabilityThreshold);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.probeSpeedThreshold)) {
        this.probeSpeedThreshold = (java.lang.Double) data().deepCopy(fields()[7].schema(), other.probeSpeedThreshold);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.pifRunId)) {
        this.pifRunId = (java.lang.Integer) data().deepCopy(fields()[8].schema(), other.pifRunId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.includeNavteq)) {
        this.includeNavteq = (java.lang.Boolean) data().deepCopy(fields()[9].schema(), other.includeNavteq);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.navteqNoiseMean)) {
        this.navteqNoiseMean = (java.lang.Double) data().deepCopy(fields()[10].schema(), other.navteqNoiseMean);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.navteqNoiseStdev)) {
        this.navteqNoiseStdev = (java.lang.Double) data().deepCopy(fields()[11].schema(), other.navteqNoiseStdev);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.navteqPercentage)) {
        this.navteqPercentage = (java.lang.Double) data().deepCopy(fields()[12].schema(), other.navteqPercentage);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.includeTelenav)) {
        this.includeTelenav = (java.lang.Boolean) data().deepCopy(fields()[13].schema(), other.includeTelenav);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.telenavNoiseMean)) {
        this.telenavNoiseMean = (java.lang.Double) data().deepCopy(fields()[14].schema(), other.telenavNoiseMean);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.telenavNoiseStdev)) {
        this.telenavNoiseStdev = (java.lang.Double) data().deepCopy(fields()[15].schema(), other.telenavNoiseStdev);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.telenavPercentage)) {
        this.telenavPercentage = (java.lang.Double) data().deepCopy(fields()[16].schema(), other.telenavPercentage);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.useLocalization)) {
        this.useLocalization = (java.lang.Boolean) data().deepCopy(fields()[17].schema(), other.useLocalization);
        fieldSetFlags()[17] = true;
      }
      if (isValidValue(fields()[18], other.localizationDistance)) {
        this.localizationDistance = (java.lang.Double) data().deepCopy(fields()[18].schema(), other.localizationDistance);
        fieldSetFlags()[18] = true;
      }
    }

    /** Gets the value of the 'enkfType' field */
    public java.lang.String getEnkfType() {
      return enkfType;
    }
    
    /** Sets the value of the 'enkfType' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setEnkfType(java.lang.String value) {
      validate(fields()[0], value);
      this.enkfType = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'enkfType' field has been set */
    public boolean hasEnkfType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'enkfType' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearEnkfType() {
      enkfType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'dtEnKF' field */
    public edu.berkeley.path.model_elements_base.Duration getDtEnKF() {
      return dtEnKF;
    }
    
    /** Sets the value of the 'dtEnKF' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setDtEnKF(edu.berkeley.path.model_elements_base.Duration value) {
      validate(fields()[1], value);
      this.dtEnKF = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'dtEnKF' field has been set */
    public boolean hasDtEnKF() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'dtEnKF' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearDtEnKF() {
      dtEnKF = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'includePeMS' field */
    public java.lang.Boolean getIncludePeMS() {
      return includePeMS;
    }
    
    /** Sets the value of the 'includePeMS' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setIncludePeMS(boolean value) {
      validate(fields()[2], value);
      this.includePeMS = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'includePeMS' field has been set */
    public boolean hasIncludePeMS() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'includePeMS' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearIncludePeMS() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'pemsNoiseMean' field */
    public java.lang.Double getPemsNoiseMean() {
      return pemsNoiseMean;
    }
    
    /** Sets the value of the 'pemsNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setPemsNoiseMean(double value) {
      validate(fields()[3], value);
      this.pemsNoiseMean = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'pemsNoiseMean' field has been set */
    public boolean hasPemsNoiseMean() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'pemsNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearPemsNoiseMean() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'pemsNoiseStdev' field */
    public java.lang.Double getPemsNoiseStdev() {
      return pemsNoiseStdev;
    }
    
    /** Sets the value of the 'pemsNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setPemsNoiseStdev(double value) {
      validate(fields()[4], value);
      this.pemsNoiseStdev = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'pemsNoiseStdev' field has been set */
    public boolean hasPemsNoiseStdev() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'pemsNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearPemsNoiseStdev() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'PemsBlackList' field */
    public java.util.List<java.lang.Integer> getPemsBlackList() {
      return PemsBlackList;
    }
    
    /** Sets the value of the 'PemsBlackList' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setPemsBlackList(java.util.List<java.lang.Integer> value) {
      validate(fields()[5], value);
      this.PemsBlackList = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'PemsBlackList' field has been set */
    public boolean hasPemsBlackList() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'PemsBlackList' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearPemsBlackList() {
      PemsBlackList = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'probeProbabilityThreshold' field */
    public java.lang.Double getProbeProbabilityThreshold() {
      return probeProbabilityThreshold;
    }
    
    /** Sets the value of the 'probeProbabilityThreshold' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setProbeProbabilityThreshold(double value) {
      validate(fields()[6], value);
      this.probeProbabilityThreshold = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'probeProbabilityThreshold' field has been set */
    public boolean hasProbeProbabilityThreshold() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'probeProbabilityThreshold' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearProbeProbabilityThreshold() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'probeSpeedThreshold' field */
    public java.lang.Double getProbeSpeedThreshold() {
      return probeSpeedThreshold;
    }
    
    /** Sets the value of the 'probeSpeedThreshold' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setProbeSpeedThreshold(double value) {
      validate(fields()[7], value);
      this.probeSpeedThreshold = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'probeSpeedThreshold' field has been set */
    public boolean hasProbeSpeedThreshold() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'probeSpeedThreshold' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearProbeSpeedThreshold() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'pifRunId' field */
    public java.lang.Integer getPifRunId() {
      return pifRunId;
    }
    
    /** Sets the value of the 'pifRunId' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setPifRunId(int value) {
      validate(fields()[8], value);
      this.pifRunId = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'pifRunId' field has been set */
    public boolean hasPifRunId() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'pifRunId' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearPifRunId() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'includeNavteq' field */
    public java.lang.Boolean getIncludeNavteq() {
      return includeNavteq;
    }
    
    /** Sets the value of the 'includeNavteq' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setIncludeNavteq(boolean value) {
      validate(fields()[9], value);
      this.includeNavteq = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'includeNavteq' field has been set */
    public boolean hasIncludeNavteq() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'includeNavteq' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearIncludeNavteq() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'navteqNoiseMean' field */
    public java.lang.Double getNavteqNoiseMean() {
      return navteqNoiseMean;
    }
    
    /** Sets the value of the 'navteqNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setNavteqNoiseMean(double value) {
      validate(fields()[10], value);
      this.navteqNoiseMean = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'navteqNoiseMean' field has been set */
    public boolean hasNavteqNoiseMean() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'navteqNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearNavteqNoiseMean() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'navteqNoiseStdev' field */
    public java.lang.Double getNavteqNoiseStdev() {
      return navteqNoiseStdev;
    }
    
    /** Sets the value of the 'navteqNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setNavteqNoiseStdev(double value) {
      validate(fields()[11], value);
      this.navteqNoiseStdev = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'navteqNoiseStdev' field has been set */
    public boolean hasNavteqNoiseStdev() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'navteqNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearNavteqNoiseStdev() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'navteqPercentage' field */
    public java.lang.Double getNavteqPercentage() {
      return navteqPercentage;
    }
    
    /** Sets the value of the 'navteqPercentage' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setNavteqPercentage(double value) {
      validate(fields()[12], value);
      this.navteqPercentage = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'navteqPercentage' field has been set */
    public boolean hasNavteqPercentage() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'navteqPercentage' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearNavteqPercentage() {
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'includeTelenav' field */
    public java.lang.Boolean getIncludeTelenav() {
      return includeTelenav;
    }
    
    /** Sets the value of the 'includeTelenav' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setIncludeTelenav(boolean value) {
      validate(fields()[13], value);
      this.includeTelenav = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'includeTelenav' field has been set */
    public boolean hasIncludeTelenav() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'includeTelenav' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearIncludeTelenav() {
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'telenavNoiseMean' field */
    public java.lang.Double getTelenavNoiseMean() {
      return telenavNoiseMean;
    }
    
    /** Sets the value of the 'telenavNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setTelenavNoiseMean(double value) {
      validate(fields()[14], value);
      this.telenavNoiseMean = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'telenavNoiseMean' field has been set */
    public boolean hasTelenavNoiseMean() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'telenavNoiseMean' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearTelenavNoiseMean() {
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'telenavNoiseStdev' field */
    public java.lang.Double getTelenavNoiseStdev() {
      return telenavNoiseStdev;
    }
    
    /** Sets the value of the 'telenavNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setTelenavNoiseStdev(double value) {
      validate(fields()[15], value);
      this.telenavNoiseStdev = value;
      fieldSetFlags()[15] = true;
      return this; 
    }
    
    /** Checks whether the 'telenavNoiseStdev' field has been set */
    public boolean hasTelenavNoiseStdev() {
      return fieldSetFlags()[15];
    }
    
    /** Clears the value of the 'telenavNoiseStdev' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearTelenavNoiseStdev() {
      fieldSetFlags()[15] = false;
      return this;
    }

    /** Gets the value of the 'telenavPercentage' field */
    public java.lang.Double getTelenavPercentage() {
      return telenavPercentage;
    }
    
    /** Sets the value of the 'telenavPercentage' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setTelenavPercentage(double value) {
      validate(fields()[16], value);
      this.telenavPercentage = value;
      fieldSetFlags()[16] = true;
      return this; 
    }
    
    /** Checks whether the 'telenavPercentage' field has been set */
    public boolean hasTelenavPercentage() {
      return fieldSetFlags()[16];
    }
    
    /** Clears the value of the 'telenavPercentage' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearTelenavPercentage() {
      fieldSetFlags()[16] = false;
      return this;
    }

    /** Gets the value of the 'useLocalization' field */
    public java.lang.Boolean getUseLocalization() {
      return useLocalization;
    }
    
    /** Sets the value of the 'useLocalization' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setUseLocalization(boolean value) {
      validate(fields()[17], value);
      this.useLocalization = value;
      fieldSetFlags()[17] = true;
      return this; 
    }
    
    /** Checks whether the 'useLocalization' field has been set */
    public boolean hasUseLocalization() {
      return fieldSetFlags()[17];
    }
    
    /** Clears the value of the 'useLocalization' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearUseLocalization() {
      fieldSetFlags()[17] = false;
      return this;
    }

    /** Gets the value of the 'localizationDistance' field */
    public java.lang.Double getLocalizationDistance() {
      return localizationDistance;
    }
    
    /** Sets the value of the 'localizationDistance' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder setLocalizationDistance(double value) {
      validate(fields()[18], value);
      this.localizationDistance = value;
      fieldSetFlags()[18] = true;
      return this; 
    }
    
    /** Checks whether the 'localizationDistance' field has been set */
    public boolean hasLocalizationDistance() {
      return fieldSetFlags()[18];
    }
    
    /** Clears the value of the 'localizationDistance' field */
    public edu.berkeley.path.model_elements_base.EnKFConfig.Builder clearLocalizationDistance() {
      fieldSetFlags()[18] = false;
      return this;
    }

    @Override
    public EnKFConfig build() {
      try {
        EnKFConfig record = new EnKFConfig();
        record.enkfType = fieldSetFlags()[0] ? this.enkfType : (java.lang.String) defaultValue(fields()[0]);
        record.dtEnKF = fieldSetFlags()[1] ? this.dtEnKF : (edu.berkeley.path.model_elements_base.Duration) defaultValue(fields()[1]);
        record.includePeMS = fieldSetFlags()[2] ? this.includePeMS : (java.lang.Boolean) defaultValue(fields()[2]);
        record.pemsNoiseMean = fieldSetFlags()[3] ? this.pemsNoiseMean : (java.lang.Double) defaultValue(fields()[3]);
        record.pemsNoiseStdev = fieldSetFlags()[4] ? this.pemsNoiseStdev : (java.lang.Double) defaultValue(fields()[4]);
        record.PemsBlackList = fieldSetFlags()[5] ? this.PemsBlackList : (java.util.List<java.lang.Integer>) defaultValue(fields()[5]);
        record.probeProbabilityThreshold = fieldSetFlags()[6] ? this.probeProbabilityThreshold : (java.lang.Double) defaultValue(fields()[6]);
        record.probeSpeedThreshold = fieldSetFlags()[7] ? this.probeSpeedThreshold : (java.lang.Double) defaultValue(fields()[7]);
        record.pifRunId = fieldSetFlags()[8] ? this.pifRunId : (java.lang.Integer) defaultValue(fields()[8]);
        record.includeNavteq = fieldSetFlags()[9] ? this.includeNavteq : (java.lang.Boolean) defaultValue(fields()[9]);
        record.navteqNoiseMean = fieldSetFlags()[10] ? this.navteqNoiseMean : (java.lang.Double) defaultValue(fields()[10]);
        record.navteqNoiseStdev = fieldSetFlags()[11] ? this.navteqNoiseStdev : (java.lang.Double) defaultValue(fields()[11]);
        record.navteqPercentage = fieldSetFlags()[12] ? this.navteqPercentage : (java.lang.Double) defaultValue(fields()[12]);
        record.includeTelenav = fieldSetFlags()[13] ? this.includeTelenav : (java.lang.Boolean) defaultValue(fields()[13]);
        record.telenavNoiseMean = fieldSetFlags()[14] ? this.telenavNoiseMean : (java.lang.Double) defaultValue(fields()[14]);
        record.telenavNoiseStdev = fieldSetFlags()[15] ? this.telenavNoiseStdev : (java.lang.Double) defaultValue(fields()[15]);
        record.telenavPercentage = fieldSetFlags()[16] ? this.telenavPercentage : (java.lang.Double) defaultValue(fields()[16]);
        record.useLocalization = fieldSetFlags()[17] ? this.useLocalization : (java.lang.Boolean) defaultValue(fields()[17]);
        record.localizationDistance = fieldSetFlags()[18] ? this.localizationDistance : (java.lang.Double) defaultValue(fields()[18]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
