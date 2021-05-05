// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_matmul
 <p>
 *  \addtogroup dnnl_api_resampling
 *  \{
 <p>
 *  A descriptor of resampling operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_resampling_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_resampling_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_resampling_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_resampling_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_resampling_desc_t position(long position) {
        return (dnnl_resampling_desc_t)super.position(position);
    }
    @Override public dnnl_resampling_desc_t getPointer(long i) {
        return new dnnl_resampling_desc_t((Pointer)this).position(position + i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_resampling. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_resampling_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward_data, */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_resampling_desc_t prop_kind(int setter);
    /** The kind of the resampling algorithm. Possible values:
     *  #dnnl_resampling_nearest, #dnnl_resampling_linear. */
    public native @Cast("dnnl_alg_kind_t") int alg_kind(); public native dnnl_resampling_desc_t alg_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef dnnl_memory_desc_t src_desc(); public native dnnl_resampling_desc_t src_desc(dnnl_memory_desc_t setter);
    /** Source gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_src_desc(); public native dnnl_resampling_desc_t diff_src_desc(dnnl_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t dst_desc(); public native dnnl_resampling_desc_t dst_desc(dnnl_memory_desc_t setter);
    /** Destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_dst_desc(); public native dnnl_resampling_desc_t diff_dst_desc(dnnl_memory_desc_t setter);
    /** Resampling factor in each spatial dimension. */
    public native float factors(int i); public native dnnl_resampling_desc_t factors(int i, float setter);
    @MemberGetter public native FloatPointer factors();
}
