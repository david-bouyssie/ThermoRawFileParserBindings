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

public class QueryExecutor {
    public com.sun.jna.Pointer __object;

    public QueryExecutor(com.sun.jna.Pointer object) { this.__object = object; }

    public QueryExecutor() {
        __object = thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Query_QueryExecutor_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static void run(thermorawfileparser.thermorawfileparser.query.QueryParameters parameters) {
        thermorawfileparser.Native_ThermoRawFileParser.INSTANCE.ThermoRawFileParser_Query_QueryExecutor_Run(parameters == null ? null : parameters.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
