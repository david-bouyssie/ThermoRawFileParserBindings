/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package thermorawfileparser.thermorawfileparser;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class LogFormat {
    public static final LogFormat SILENT = new LogFormat((int)0);
    public static final LogFormat VERBOSE = new LogFormat((int)1);
    public static final LogFormat DEFAULT = new LogFormat((int)2);
    public static final LogFormat NONE = new LogFormat((int)3);

    private final int id;
    LogFormat(int id) { this.id = id; }
    public int getValue() { return id; }

    public static LogFormat fromOrdinal(int n) {
        return valuesMap.containsKey(n) ? valuesMap.get(n) : new LogFormat(n);
    }

    private static final java.util.Map<Integer, LogFormat> valuesMap = 
        new java.util.HashMap<Integer, LogFormat>();

    static {
        try {
            java.lang.reflect.Field[] constants = LogFormat.class.getFields();
            for (final java.lang.reflect.Field field : constants) {
                LogFormat item = (LogFormat) field.get(null);
                valuesMap.put(item.getValue(), item);
            }
        } catch(java.lang.IllegalAccessException ex) {
        }
    }
}
