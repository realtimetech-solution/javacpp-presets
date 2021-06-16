// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \defgroup concat-tables ConcatenateTables function.
 * 
 *  ConcatenateTables function.
 *  \{
 <p>
 *  \brief Controls the behavior of ConcatenateTables(). */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ConcatenateTablesOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConcatenateTablesOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConcatenateTablesOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConcatenateTablesOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConcatenateTablesOptions position(long position) {
        return (ConcatenateTablesOptions)super.position(position);
    }
    @Override public ConcatenateTablesOptions getPointer(long i) {
        return new ConcatenateTablesOptions((Pointer)this).offsetAddress(i);
    }

  /** If true, the schemas of the tables will be first unified with fields of
   *  the same name being merged, according to {@code field_merge_options}, then each
   *  table will be promoted to the unified schema before being concatenated.
   *  Otherwise, all tables should have the same schema. Each column in the output table
   *  is the result of concatenating the corresponding columns in all input tables. */
  public native @Cast("bool") boolean unify_schemas(); public native ConcatenateTablesOptions unify_schemas(boolean setter);

  public native @ByRef Field.MergeOptions field_merge_options(); public native ConcatenateTablesOptions field_merge_options(Field.MergeOptions setter);

  public static native @ByVal ConcatenateTablesOptions Defaults();
}
