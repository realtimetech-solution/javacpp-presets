// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Sparse CUDA array and CUDA mipmapped array properties
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaArraySparseProperties extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaArraySparseProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaArraySparseProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaArraySparseProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaArraySparseProperties position(long position) {
        return (cudaArraySparseProperties)super.position(position);
    }
    @Override public cudaArraySparseProperties getPointer(long i) {
        return new cudaArraySparseProperties((Pointer)this).offsetAddress(i);
    }

        /** Tile width in elements */
        @Name("tileExtent.width") public native @Cast("unsigned int") int tileExtent_width(); public native cudaArraySparseProperties tileExtent_width(int setter);
        /** Tile height in elements */
        @Name("tileExtent.height") public native @Cast("unsigned int") int tileExtent_height(); public native cudaArraySparseProperties tileExtent_height(int setter);
        /** Tile depth in elements */
        @Name("tileExtent.depth") public native @Cast("unsigned int") int tileExtent_depth(); public native cudaArraySparseProperties tileExtent_depth(int setter);
    /** First mip level at which the mip tail begins */
    public native @Cast("unsigned int") int miptailFirstLevel(); public native cudaArraySparseProperties miptailFirstLevel(int setter);   
    /** Total size of the mip tail. */
    public native @Cast("unsigned long long") long miptailSize(); public native cudaArraySparseProperties miptailSize(long setter);
    /** Flags will either be zero or ::cudaArraySparsePropertiesSingleMipTail */
    public native @Cast("unsigned int") int flags(); public native cudaArraySparseProperties flags(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native cudaArraySparseProperties reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
