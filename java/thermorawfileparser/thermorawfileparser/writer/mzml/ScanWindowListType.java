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

public class ScanWindowListType {
    public com.sun.jna.Pointer __object;

    public ScanWindowListType(com.sun.jna.Pointer object) { this.__object = object; }

    public ScanWindowListType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ScanWindowListType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getcount() {
        int __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ScanWindowListType_get_count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setcount(int value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ScanWindowListType_set_count(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
