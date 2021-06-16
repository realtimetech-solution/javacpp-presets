// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Experimental */
@Namespace("arrow::csv") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class WriteOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WriteOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WriteOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WriteOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WriteOptions position(long position) {
        return (WriteOptions)super.position(position);
    }
    @Override public WriteOptions getPointer(long i) {
        return new WriteOptions((Pointer)this).offsetAddress(i);
    }

  /** Whether to write an initial header line with column names */
  
  ///
  public native @Cast("bool") boolean include_header(); public native WriteOptions include_header(boolean setter);

  /** \brief Maximum number of rows processed at a time
   * 
   *  The CSV writer converts and writes data in batches of N rows.
   *  This number can impact performance. */
  public native int batch_size(); public native WriteOptions batch_size(int setter);

  /** Create write options with default values */
  public static native @ByVal WriteOptions Defaults();
}
