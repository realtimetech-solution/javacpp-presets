// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of compressed pix */
@Name("PixaComp") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXAC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXAC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXAC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXAC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXAC position(long position) {
        return (PIXAC)super.position(position);
    }
    @Override public PIXAC getPointer(long i) {
        return new PIXAC((Pointer)this).offsetAddress(i);
    }

    /** number of PixComp in ptr array    */
    public native @Cast("l_int32") int n(); public native PIXAC n(int setter);
    /** number of PixComp ptrs allocated  */
    public native @Cast("l_int32") int nalloc(); public native PIXAC nalloc(int setter);
    /** indexing offset into ptr array    */
    public native @Cast("l_int32") int offset(); public native PIXAC offset(int setter);
    /** the array of ptrs to PixComp      */
    public native PIXC pixc(int i); public native PIXAC pixc(int i, PIXC setter);
    public native @Cast("PixComp**") PointerPointer pixc(); public native PIXAC pixc(PointerPointer setter);
    /** array of boxes                    */
    public native BOXA boxa(); public native PIXAC boxa(BOXA setter);
}
