// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief MobileNetDetectionNetwork node. Parses MobileNet results
 */
@Namespace("dai::node") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MobileNetDetectionNetwork extends DetectionNetwork {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MobileNetDetectionNetwork(Pointer p) { super(p); }

    public MobileNetDetectionNetwork(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
}
