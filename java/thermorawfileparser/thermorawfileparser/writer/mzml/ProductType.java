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

public class ProductType {
    public com.sun.jna.Pointer __object;

    public ProductType(com.sun.jna.Pointer object) { this.__object = object; }

    public ProductType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProductType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType getisolationWindow() {
        com.sun.jna.Pointer __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProductType_get_isolationWindow(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType(__ret));
    }

    public void setisolationWindow(thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_ProductType_set_isolationWindow(__object, value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
