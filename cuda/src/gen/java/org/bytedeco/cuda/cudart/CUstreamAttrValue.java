// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Stream attributes union, used with ::cuStreamSetAttribute/::cuStreamGetAttribute
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUstreamAttrValue extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUstreamAttrValue() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUstreamAttrValue(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUstreamAttrValue(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUstreamAttrValue position(long position) {
        return (CUstreamAttrValue)super.position(position);
    }
    @Override public CUstreamAttrValue getPointer(long i) {
        return new CUstreamAttrValue((Pointer)this).position(position + i);
    }

    /** Attribute ::CUaccessPolicyWindow. */
    public native @ByRef CUaccessPolicyWindow accessPolicyWindow(); public native CUstreamAttrValue accessPolicyWindow(CUaccessPolicyWindow setter);
    /** Value for ::CU_STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY. */
    public native @Cast("CUsynchronizationPolicy") int syncPolicy(); public native CUstreamAttrValue syncPolicy(int setter);
}
