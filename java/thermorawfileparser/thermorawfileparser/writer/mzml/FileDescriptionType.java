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

public class FileDescriptionType {
    public com.sun.jna.Pointer __object;

    public FileDescriptionType(com.sun.jna.Pointer object) { this.__object = object; }

    public FileDescriptionType() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_FileDescriptionType_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType getfileContent() {
        com.sun.jna.Pointer __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_FileDescriptionType_get_fileContent(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType(__ret));
    }

    public void setfileContent(thermorawfileparser.thermorawfileparser.writer.mzml.ParamGroupType value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_FileDescriptionType_set_fileContent(__object, value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public thermorawfileparser.thermorawfileparser.writer.mzml.SourceFileListType getsourceFileList() {
        com.sun.jna.Pointer __ret = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_FileDescriptionType_get_sourceFileList(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new thermorawfileparser.thermorawfileparser.writer.mzml.SourceFileListType(__ret));
    }

    public void setsourceFileList(thermorawfileparser.thermorawfileparser.writer.mzml.SourceFileListType value) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_MzML_FileDescriptionType_set_sourceFileList(__object, value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
