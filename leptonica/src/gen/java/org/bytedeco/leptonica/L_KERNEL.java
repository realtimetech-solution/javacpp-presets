// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Kernel */
@Name("L_Kernel") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_KERNEL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_KERNEL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_KERNEL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_KERNEL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_KERNEL position(long position) {
        return (L_KERNEL)super.position(position);
    }
    @Override public L_KERNEL getPointer(long i) {
        return new L_KERNEL((Pointer)this).offsetAddress(i);
    }

    /** kernel height                            */
    public native @Cast("l_int32") int sy(); public native L_KERNEL sy(int setter);
    /** kernel width                             */
    public native @Cast("l_int32") int sx(); public native L_KERNEL sx(int setter);
    /** y location of kernel origin              */
    public native @Cast("l_int32") int cy(); public native L_KERNEL cy(int setter);
    /** x location of kernel origin              */
    public native @Cast("l_int32") int cx(); public native L_KERNEL cx(int setter);
    /** data[i][j] in [row][col] order           */
    public native @Cast("l_float32*") FloatPointer data(int i); public native L_KERNEL data(int i, FloatPointer setter);
    public native @Cast("l_float32**") PointerPointer data(); public native L_KERNEL data(PointerPointer setter);
}
