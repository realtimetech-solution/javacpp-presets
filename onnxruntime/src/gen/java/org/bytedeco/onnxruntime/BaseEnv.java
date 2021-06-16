// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtEnv>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseEnv extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseEnv(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseEnv(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseEnv position(long position) {
        return (BaseEnv)super.position(position);
    }
    @Override public BaseEnv getPointer(long i) {
        return new BaseEnv((Pointer)this).offsetAddress(i);
    }


  public BaseEnv() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseEnv(OrtEnv p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtEnv p);

  public native @Name("operator OrtEnv*") OrtEnv asOrtEnv();

  public native OrtEnv release();
}
