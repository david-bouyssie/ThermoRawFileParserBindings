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

public class SoftwareRefType {
    public com.sun.jna.Pointer __object;

    public SoftwareRefType(com.sun.jna.Pointer object) { this.__object = object; }

    public SoftwareRefType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SoftwareRefType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getref() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SoftwareRefType_get_ref(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setref(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SoftwareRefType_set_ref(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
