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

public class BinaryDataArrayType extends thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType {
    public BinaryDataArrayType(com.sun.jna.Pointer object) { super(object); }

    public BinaryDataArrayType() {
        super((com.sun.jna.Pointer)null);
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getarrayLength() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_get_arrayLength(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setarrayLength(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_set_arrayLength(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getdataProcessingRef() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_get_dataProcessingRef(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setdataProcessingRef(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_set_dataProcessingRef(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getencodedLength() {
        java.lang.String __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_get_encodedLength(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setencodedLength(java.lang.String value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_BinaryDataArrayType_set_encodedLength(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
