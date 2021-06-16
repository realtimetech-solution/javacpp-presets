// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

/*
 * Hamming distance functor - counts the bit differences between two strings - useful for the Brief descriptor
 * bit count of A exclusive XOR'ed with B
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Hamming extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Hamming() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Hamming(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Hamming(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Hamming position(long position) {
        return (Hamming)super.position(position);
    }
    @Override public Hamming getPointer(long i) {
        return new Hamming((Pointer)this).offsetAddress(i);
    }

    @MemberGetter public static native @Cast("const cv::NormTypes") int normType();
    public static final int normType = normType();

    /** this will count the bits in a ^ b
     */
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") BytePointer a, @Cast("const unsigned char*") BytePointer b, int size );
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") ByteBuffer a, @Cast("const unsigned char*") ByteBuffer b, int size );
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") byte[] a, @Cast("const unsigned char*") byte[] b, int size );
}
