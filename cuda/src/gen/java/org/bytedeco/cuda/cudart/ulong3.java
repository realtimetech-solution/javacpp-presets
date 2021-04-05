// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulong3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulong3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulong3 position(long position) {
        return (ulong3)super.position(position);
    }
    @Override public ulong3 getPointer(long i) {
        return new ulong3((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned long int") long x(); public native ulong3 x(long setter);
    public native @Cast("unsigned long int") long y(); public native ulong3 y(long setter);
    public native @Cast("unsigned long int") long z(); public native ulong3 z(long setter);
}
