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

public class SampleType extends thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType {
    public SampleType(com.sun.jna.Pointer object) { super(object); }

    public SampleType() {
        super((com.sun.jna.Pointer)null);
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SampleType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getid() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SampleType_get_id(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setid(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SampleType_set_id(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getname() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SampleType_get_name(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setname(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_SampleType_set_name(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}