/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package thermorawfileparser.thermorawfileparser.writer.mzml;

import mono.embeddinator.*;
import com.sun.jna.*;

public class CVParamType {
    public com.sun.jna.Pointer __object;

    public CVParamType(com.sun.jna.Pointer object) { this.__object = object; }

    public CVParamType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getcvRef() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_cvRef(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setcvRef(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_cvRef(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getaccession() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_accession(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setaccession(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_accession(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getvalue() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_value(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setvalue(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_value(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getname() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_name(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setname(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_name(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitAccession() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_unitAccession(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitAccession(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_unitAccession(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitName() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_unitName(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitName(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_unitName(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitCvRef() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_get_unitCvRef(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitCvRef(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_CVParamType_set_unitCvRef(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
