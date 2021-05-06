// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class long1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public long1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public long1 position(long position) {
        return (long1)super.position(position);
    }
    @Override public long1 getPointer(long i) {
        return new long1((Pointer)this).offsetAddress(i);
    }

    public native long x(); public native long1 x(long setter);
}
