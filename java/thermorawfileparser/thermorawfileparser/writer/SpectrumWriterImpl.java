/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package thermorawfileparser.thermorawfileparser.writer;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class SpectrumWriterImpl extends thermorawfileparser.thermorawfileparser.writer.SpectrumWriter {
    public SpectrumWriterImpl(com.sun.jna.Pointer object) { super(object); }

    @Override
    public void write(int firstScanNumber, int lastScanNumber) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_SpectrumWriter_Write(__object, firstScanNumber, lastScanNumber);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
