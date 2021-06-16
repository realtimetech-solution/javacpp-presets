// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libffi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libffi.global.ffi.*;


@Properties(inherit = org.bytedeco.libffi.presets.ffi.class)
public class Fun_ffi_cif_Pointer_ffi_raw_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Fun_ffi_cif_Pointer_ffi_raw_Pointer(Pointer p) { super(p); }
    protected Fun_ffi_cif_Pointer_ffi_raw_Pointer() { allocate(); }
    private native void allocate();
    public native void call(ffi_cif arg0,Pointer arg1,ffi_raw arg2,Pointer arg3);
}
