// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Description of tensor of packed weights for rnn. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_rnn_packed_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_rnn_packed_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_rnn_packed_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_rnn_packed_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_rnn_packed_desc_t position(long position) {
        return (dnnl_rnn_packed_desc_t)super.position(position);
    }
    @Override public dnnl_rnn_packed_desc_t getPointer(long i) {
        return new dnnl_rnn_packed_desc_t((Pointer)this).position(position + i);
    }

    public native @Cast("dnnl_rnn_packed_memory_format_t") int format(); public native dnnl_rnn_packed_desc_t format(int setter);
    public native int n_parts(); public native dnnl_rnn_packed_desc_t n_parts(int setter);
    public native int n(); public native dnnl_rnn_packed_desc_t n(int setter);
    public native int ldb(); public native dnnl_rnn_packed_desc_t ldb(int setter);
    public native int parts(int i); public native dnnl_rnn_packed_desc_t parts(int i, int setter);
    @MemberGetter public native IntPointer parts();
    public native @Cast("size_t") long part_pack_size(int i); public native dnnl_rnn_packed_desc_t part_pack_size(int i, long setter);
    @MemberGetter public native @Cast("size_t*") SizeTPointer part_pack_size();
    public native @Cast("unsigned") int pack_part(int i); public native dnnl_rnn_packed_desc_t pack_part(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer pack_part();
    public native @Cast("size_t") long offset_compensation(); public native dnnl_rnn_packed_desc_t offset_compensation(long setter);
    public native @Cast("size_t") long size(); public native dnnl_rnn_packed_desc_t size(long setter);
    public native @Cast("char") byte reserved(int i); public native dnnl_rnn_packed_desc_t reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
