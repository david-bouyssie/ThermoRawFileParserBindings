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

public class ProcessingMethodType extends thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType {
    public ProcessingMethodType(com.sun.jna.Pointer object) { super(object); }

    public ProcessingMethodType() {
        super((com.sun.jna.Pointer)null);
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProcessingMethodType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getorder() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProcessingMethodType_get_order(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setorder(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProcessingMethodType_set_order(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getsoftwareRef() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProcessingMethodType_get_softwareRef(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setsoftwareRef(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProcessingMethodType_set_softwareRef(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}