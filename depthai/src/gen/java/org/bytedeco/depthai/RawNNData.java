// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/** RawNNData structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawNNData extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawNNData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawNNData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawNNData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawNNData position(long position) {
        return (RawNNData)super.position(position);
    }
    @Override public RawNNData getPointer(long i) {
        return new RawNNData((Pointer)this).offsetAddress(i);
    }

    // NNData data is in PoBuf
    public native @StdVector TensorInfo tensors(); public native RawNNData tensors(TensorInfo setter);
    public native @Cast("unsigned int") int batchSize(); public native RawNNData batchSize(int setter);

    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
