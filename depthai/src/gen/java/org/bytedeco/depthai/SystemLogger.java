// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief SystemLogger node. Send system information periodically.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SystemLogger extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SystemLogger(Pointer p) { super(p); }

    public SystemLogger(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    /**
     * Outputs SystemInformation message that carries various system information
     * like memory and CPU usage, temperatures, ...
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Specify logging rate, at which messages will be sent to out output
     * @param hz Sending rate in hertz (messages per second)
     */
    public native void setRate(float hz);
}
