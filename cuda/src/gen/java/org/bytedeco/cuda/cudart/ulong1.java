// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulong1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulong1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulong1 position(long position) {
        return (ulong1)super.position(position);
    }
    @Override public ulong1 getPointer(long i) {
        return new ulong1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned long") long x(); public native ulong1 x(long setter);
}
