// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMappingMethods extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMappingMethods() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMappingMethods(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMappingMethods(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMappingMethods position(long position) {
        return (PyMappingMethods)super.position(position);
    }
    @Override public PyMappingMethods getPointer(long i) {
        return new PyMappingMethods((Pointer)this).offsetAddress(i);
    }

    public native lenfunc mp_length(); public native PyMappingMethods mp_length(lenfunc setter);
    public native binaryfunc mp_subscript(); public native PyMappingMethods mp_subscript(binaryfunc setter);
    public native objobjargproc mp_ass_subscript(); public native PyMappingMethods mp_ass_subscript(objobjargproc setter);
}
