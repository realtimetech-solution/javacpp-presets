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

@Name("Ort::Base<OrtSession>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseSession extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseSession(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseSession(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseSession position(long position) {
        return (BaseSession)super.position(position);
    }
    @Override public BaseSession getPointer(long i) {
        return new BaseSession((Pointer)this).position(position + i);
    }


  public BaseSession() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseSession(OrtSession p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtSession p);

  public native @Name("operator OrtSession*") OrtSession asOrtSession();

  public native OrtSession release();
}
