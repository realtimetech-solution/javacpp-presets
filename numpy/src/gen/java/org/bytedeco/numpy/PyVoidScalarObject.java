// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyVoidScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyVoidScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyVoidScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyVoidScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyVoidScalarObject position(long position) {
        return (PyVoidScalarObject)super.position(position);
    }
    @Override public PyVoidScalarObject getPointer(long i) {
        return new PyVoidScalarObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyVarObject ob_base(); public native PyVoidScalarObject ob_base(PyVarObject setter);
        public native @Cast("char*") BytePointer obval(); public native PyVoidScalarObject obval(BytePointer setter);
        public native PyArray_Descr descr(); public native PyVoidScalarObject descr(PyArray_Descr setter);
        public native int flags(); public native PyVoidScalarObject flags(int setter);
        public native PyObject base(); public native PyVoidScalarObject base(PyObject setter);
        public native Pointer _buffer_info(); public native PyVoidScalarObject _buffer_info(Pointer setter);  /* private buffer info, tagged to allow warning */
}
