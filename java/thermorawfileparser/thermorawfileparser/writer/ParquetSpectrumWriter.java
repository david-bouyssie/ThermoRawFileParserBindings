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

public class ParquetSpectrumWriter extends thermorawfileparser.thermorawfileparser.writer.SpectrumWriter {
    public ParquetSpectrumWriter(com.sun.jna.Pointer object) { super(object); }

    public void write(int firstScanNumber, int lastScanNumber) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Writer_ParquetSpectrumWriter_Write(__object, firstScanNumber, lastScanNumber);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
