// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  Entropy calibrator 2. This is the preferred calibrator. This is the required calibrator for DLA, as it supports per
 *  activation tensor scaling.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IInt8EntropyCalibrator2 extends IInt8Calibrator {
    static { Loader.load(); }
    /** Default native constructor. */
    public IInt8EntropyCalibrator2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IInt8EntropyCalibrator2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IInt8EntropyCalibrator2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IInt8EntropyCalibrator2 position(long position) {
        return (IInt8EntropyCalibrator2)super.position(position);
    }
    @Override public IInt8EntropyCalibrator2 getPointer(long i) {
        return new IInt8EntropyCalibrator2((Pointer)this).offsetAddress(i);
    }

    /**
     *  Signal that this is the entropy calibrator 2.
     *  */
    @Virtual public native CalibrationAlgoType getAlgorithm();
}
