// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SplitOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SplitOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SplitOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SplitOptions position(long position) {
        return (SplitOptions)super.position(position);
    }
    @Override public SplitOptions getPointer(long i) {
        return new SplitOptions((Pointer)this).offsetAddress(i);
    }

  public SplitOptions(@Cast("int64_t") long max_splits/*=-1*/, @Cast("bool") boolean reverse/*=false*/) { super((Pointer)null); allocate(max_splits, reverse); }
  private native void allocate(@Cast("int64_t") long max_splits/*=-1*/, @Cast("bool") boolean reverse/*=false*/);
  public SplitOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Maximum number of splits allowed, or unlimited when -1 */
  public native @Cast("int64_t") long max_splits(); public native SplitOptions max_splits(long setter);
  /** Start splitting from the end of the string (only relevant when max_splits != -1) */
  public native @Cast("bool") boolean reverse(); public native SplitOptions reverse(boolean setter);
}
