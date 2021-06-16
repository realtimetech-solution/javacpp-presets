// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Aggregate functions

/** \addtogroup compute-concrete-options
 *  \{
 <p>
 *  \brief Control Count kernel behavior
 * 
 *  By default, all non-null values are counted. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CountOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CountOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CountOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CountOptions position(long position) {
        return (CountOptions)super.position(position);
    }
    @Override public CountOptions getPointer(long i) {
        return new CountOptions((Pointer)this).offsetAddress(i);
    }

  public enum Mode {
    /** Count all non-null values. */
    COUNT_NON_NULL(0),
    /** Count all null values. */
    COUNT_NULL(1);

      public final int value;
      private Mode(int v) { this.value = v; }
      private Mode(Mode e) { this.value = e.value; }
      public Mode intern() { for (Mode e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  public CountOptions(Mode count_mode/*=arrow::compute::CountOptions::COUNT_NON_NULL*/) { super((Pointer)null); allocate(count_mode); }
  private native void allocate(Mode count_mode/*=arrow::compute::CountOptions::COUNT_NON_NULL*/);
  public CountOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public CountOptions(@Cast("arrow::compute::CountOptions::Mode") int count_mode/*=arrow::compute::CountOptions::COUNT_NON_NULL*/) { super((Pointer)null); allocate(count_mode); }
  private native void allocate(@Cast("arrow::compute::CountOptions::Mode") int count_mode/*=arrow::compute::CountOptions::COUNT_NON_NULL*/);

  public static native @ByVal CountOptions Defaults();

  public native Mode count_mode(); public native CountOptions count_mode(Mode setter);
}
