// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for list data
 * 
 *  List data is nested data where each value is a variable number of
 *  child items.  Lists can be recursively nested, for example
 *  list(list(int32)). */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ListType extends BaseListType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ListType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  // List can contain any other logical value type
  public ListType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type) { super((Pointer)null); allocate(value_type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type);

  public ListType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field) { super((Pointer)null); allocate(value_field); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field);

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();

  public native @StdString String name();
}
