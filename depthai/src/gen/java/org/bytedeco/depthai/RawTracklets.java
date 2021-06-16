// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/** RawTracklets structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawTracklets extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawTracklets() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawTracklets(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawTracklets(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawTracklets position(long position) {
        return (RawTracklets)super.position(position);
    }
    @Override public RawTracklets getPointer(long i) {
        return new RawTracklets((Pointer)this).offsetAddress(i);
    }

    public native @StdVector Tracklet tracklets(); public native RawTracklets tracklets(Tracklet setter);

    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
