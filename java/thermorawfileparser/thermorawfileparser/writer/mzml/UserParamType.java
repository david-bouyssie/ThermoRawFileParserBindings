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

public class UserParamType {
    public com.sun.jna.Pointer __object;

    public UserParamType(com.sun.jna.Pointer object) { this.__object = object; }

    public UserParamType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getname() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_name(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setname(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_name(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String gettype() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_type(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void settype(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_type(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getvalue() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_value(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setvalue(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_value(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitAccession() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_unitAccession(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitAccession(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_unitAccession(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitName() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_unitName(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitName(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_unitName(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getunitCvRef() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_get_unitCvRef(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setunitCvRef(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_UserParamType_set_unitCvRef(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
