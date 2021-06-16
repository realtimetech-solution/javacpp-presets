// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Defines a custom memory allocation not owned by the runtime.
// `data` should be aligned to kDefaultTensorAlignment defined in
// lite/util.h. (Currently 64 bytes)
// NOTE: See Interpreter.SetCustomAllocationForTensor for details on usage.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteCustomAllocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteCustomAllocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteCustomAllocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteCustomAllocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteCustomAllocation position(long position) {
        return (TfLiteCustomAllocation)super.position(position);
    }
    @Override public TfLiteCustomAllocation getPointer(long i) {
        return new TfLiteCustomAllocation((Pointer)this).offsetAddress(i);
    }

  public native Pointer data(); public native TfLiteCustomAllocation data(Pointer setter);
  public native @Cast("size_t") long bytes(); public native TfLiteCustomAllocation bytes(long setter);
}
