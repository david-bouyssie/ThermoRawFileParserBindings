/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package thermorawfileparser.thermorawfileparser.xic;

import mono.embeddinator.*;
import com.sun.jna.*;

public class JSONInputUnit {
    public com.sun.jna.Pointer __object;

    public JSONInputUnit(com.sun.jna.Pointer object) { this.__object = object; }

    public JSONInputUnit() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public boolean hasMzRange() {
        byte __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_HasMzRange(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public boolean hasMz() {
        byte __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_HasMz(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public boolean hasSequence() {
        byte __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_HasSequence(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public java.lang.String getSequence() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_get_Sequence(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setSequence(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_set_Sequence(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getToleranceUnit() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_get_ToleranceUnit(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setToleranceUnit(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_set_ToleranceUnit(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCharge() {
        int __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_get_Charge(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setCharge(int value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_set_Charge(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getFilter() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_get_Filter(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setFilter(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_XIC_JSONInputUnit_set_Filter(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}