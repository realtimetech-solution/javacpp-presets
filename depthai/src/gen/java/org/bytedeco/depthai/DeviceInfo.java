// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Describes a connected device
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DeviceInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DeviceInfo position(long position) {
        return (DeviceInfo)super.position(position);
    }
    @Override public DeviceInfo getPointer(long i) {
        return new DeviceInfo((Pointer)this).offsetAddress(i);
    }

    public DeviceInfo() { super((Pointer)null); allocate(); }
    private native void allocate();
    public DeviceInfo(@Cast("const char*") BytePointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Cast("const char*") BytePointer arg0);
    public DeviceInfo(String arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(String arg0);
    public native @ByRef deviceDesc_t desc(); public native DeviceInfo desc(deviceDesc_t setter);
    public native @Cast("XLinkDeviceState_t") int state(); public native DeviceInfo state(int setter);
    public native @StdString BytePointer getMxId();
}
