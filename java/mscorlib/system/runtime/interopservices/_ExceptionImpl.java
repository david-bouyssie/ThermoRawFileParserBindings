/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package mscorlib.system.runtime.interopservices;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class _ExceptionImpl implements mscorlib.system.runtime.interopservices._Exception {
    public com.sun.jna.Pointer __object;

    public _ExceptionImpl(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    @Override
    public java.lang.String toString() {
        java.lang.String __ret = mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_ToString(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    @Override
    public java.lang.String getMessage() {
        java.lang.String __ret = mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_get_Message(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    @Override
    public java.lang.String getStackTrace() {
        java.lang.String __ret = mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_get_StackTrace(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    @Override
    public java.lang.String getHelpLink() {
        java.lang.String __ret = mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_get_HelpLink(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    @Override
    public void setHelpLink(java.lang.String value) {
        mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_set_HelpLink(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    @Override
    public java.lang.String getSource() {
        java.lang.String __ret = mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_get_Source(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    @Override
    public void setSource(java.lang.String value) {
        mscorlib.Native_mscorlib.INSTANCE.System_Runtime_InteropServices__Exception_set_Source(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
