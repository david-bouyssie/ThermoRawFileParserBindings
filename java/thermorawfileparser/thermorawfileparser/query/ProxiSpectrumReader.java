/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package thermorawfileparser.thermorawfileparser.query;

import mono.embeddinator.*;
import com.sun.jna.*;

public class ProxiSpectrumReader {
    public com.sun.jna.Pointer __object;

    public ProxiSpectrumReader(com.sun.jna.Pointer object) { this.__object = object; }

    public ProxiSpectrumReader(thermorawfileparser.thermorawfileparser.query.QueryParameters _queryParameters) {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Query_ProxiSpectrumReader_new(_queryParameters == null ? null : _queryParameters.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
