// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/** NodeObj information structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NodeObjInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NodeObjInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeObjInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeObjInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NodeObjInfo position(long position) {
        return (NodeObjInfo)super.position(position);
    }
    @Override public NodeObjInfo getPointer(long i) {
        return new NodeObjInfo((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long id(); public native NodeObjInfo id(long setter);
    public native @StdString BytePointer name(); public native NodeObjInfo name(BytePointer setter);
    public native @ByRef @Cast("nlohmann::json*") Pointer properties(); public native NodeObjInfo properties(Pointer setter);
    public native @ByRef StringNodeIoInfoMap ioInfo(); public native NodeObjInfo ioInfo(StringNodeIoInfoMap setter);
}
