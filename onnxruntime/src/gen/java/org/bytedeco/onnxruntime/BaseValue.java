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

@Name("Ort::Base<OrtValue>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseValue position(long position) {
        return (BaseValue)super.position(position);
    }
    @Override public BaseValue getPointer(long i) {
        return new BaseValue((Pointer)this).offsetAddress(i);
    }


  public BaseValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseValue(OrtValue p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtValue p);

  public native @Name("operator OrtValue*") OrtValue asOrtValue();

  public native OrtValue release();
}
