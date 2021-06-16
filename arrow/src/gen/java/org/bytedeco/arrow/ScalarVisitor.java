// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ScalarVisitor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ScalarVisitor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScalarVisitor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScalarVisitor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ScalarVisitor position(long position) {
        return (ScalarVisitor)super.position(position);
    }
    @Override public ScalarVisitor getPointer(long i) {
        return new ScalarVisitor((Pointer)this).offsetAddress(i);
    }


  public native @ByVal Status Visit(@Const @ByRef NullScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef BooleanScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Int8Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Int16Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Int32Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Int64Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef UInt8Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef UInt16Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef UInt32Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef UInt64Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef HalfFloatScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef FloatScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef DoubleScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef StringScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef BinaryScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef LargeStringScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef LargeBinaryScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef FixedSizeBinaryScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Date64Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Date32Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Time32Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Time64Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef TimestampScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef DayTimeIntervalScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef MonthIntervalScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef DurationScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Decimal128Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef Decimal256Scalar scalar);
  public native @ByVal Status Visit(@Const @ByRef ListScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef LargeListScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef MapScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef FixedSizeListScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef StructScalar scalar);
  public native @ByVal Status Visit(@Const @ByRef DictionaryScalar scalar);
}
