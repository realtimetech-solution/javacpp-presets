// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * GPU Direct v3 tokens
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1 position(long position) {
        return (CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1)super.position(position);
    }
    @Override public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1 getPointer(long i) {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned long long") long p2pToken(); public native CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1 p2pToken(long setter);
    public native @Cast("unsigned int") int vaSpaceToken(); public native CUDA_POINTER_ATTRIBUTE_P2P_TOKENS_v1 vaSpaceToken(int setter);
}
