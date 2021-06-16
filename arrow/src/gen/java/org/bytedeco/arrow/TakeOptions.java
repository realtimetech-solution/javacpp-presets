// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TakeOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TakeOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TakeOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TakeOptions position(long position) {
        return (TakeOptions)super.position(position);
    }
    @Override public TakeOptions getPointer(long i) {
        return new TakeOptions((Pointer)this).offsetAddress(i);
    }

  public TakeOptions(@Cast("bool") boolean boundscheck/*=true*/) { super((Pointer)null); allocate(boundscheck); }
  private native void allocate(@Cast("bool") boolean boundscheck/*=true*/);
  public TakeOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") boolean boundscheck(); public native TakeOptions boundscheck(boolean setter);
  public static native @ByVal TakeOptions BoundsCheck();
  public static native @ByVal TakeOptions NoBoundsCheck();
  public static native @ByVal TakeOptions Defaults();
}
