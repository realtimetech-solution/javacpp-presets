// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of pix */
@Name("Pixa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXA position(long position) {
        return (PIXA)super.position(position);
    }
    @Override public PIXA getPointer(long i) {
        return new PIXA((Pointer)this).offsetAddress(i);
    }

    /** number of Pix in ptr array        */
    public native @Cast("l_int32") int n(); public native PIXA n(int setter);
    /** number of Pix ptrs allocated      */
    public native @Cast("l_int32") int nalloc(); public native PIXA nalloc(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native PIXA refcount(int setter);
    /** the array of ptrs to pix          */
    public native PIX pix(int i); public native PIXA pix(int i, PIX setter);
    public native @Cast("Pix**") PointerPointer pix(); public native PIXA pix(PointerPointer setter);
    /** array of boxes                    */
    public native BOXA boxa(); public native PIXA boxa(BOXA setter);
}
