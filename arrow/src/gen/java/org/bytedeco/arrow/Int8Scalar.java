// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int8Scalar extends BaseInt8Type {
    static { Loader.load(); }

  
  
    public Int8Scalar(@Cast("arrow::NumericScalar<arrow::Int8Type>::ValueType") byte value) { super((Pointer)null); allocate(value); }
    private native void allocate(@Cast("arrow::NumericScalar<arrow::Int8Type>::ValueType") byte value);
  
    public Int8Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int8Scalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Int8Scalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Int8Scalar position(long position) {
        return (Int8Scalar)super.position(position);
    }
    @Override public Int8Scalar getPointer(long i) {
        return new Int8Scalar((Pointer)this).offsetAddress(i);
    }

}
