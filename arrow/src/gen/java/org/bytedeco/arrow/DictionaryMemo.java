// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Memoization data structure for reading dictionaries from IPC streams
 * 
 *  This structure tracks the following associations:
 *  - field position (structural) -> dictionary id
 *  - dictionary id -> value type
 *  - dictionary id -> dictionary (value) data
 * 
 *  Together, they allow resolving dictionary data when reading an IPC stream,
 *  using metadata recorded in the schema message and data recorded in the
 *  dictionary batch messages (see ResolveDictionaries).
 * 
 *  This structure isn't useful for writing an IPC stream, where only
 *  DictionaryFieldMapper is necessary. */
@Namespace("arrow::ipc") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DictionaryMemo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryMemo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DictionaryMemo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DictionaryMemo position(long position) {
        return (DictionaryMemo)super.position(position);
    }
    @Override public DictionaryMemo getPointer(long i) {
        return new DictionaryMemo((Pointer)this).offsetAddress(i);
    }

  public DictionaryMemo() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByRef DictionaryFieldMapper fields();

  /** \brief Return current dictionary corresponding to a particular
   *  id. Returns KeyError if id not found */
  public native @ByVal ArrayDataResult GetDictionary(@Cast("int64_t") long id, MemoryPool pool);

  /** \brief Return dictionary value type corresponding to a
   *  particular dictionary id. */
  public native @ByVal DataTypeResult GetDictionaryType(@Cast("int64_t") long id);

  /** \brief Return true if we have a dictionary for the input id */
  public native @Cast("bool") boolean HasDictionary(@Cast("int64_t") long id);

  /** \brief Add a dictionary value type to the memo with a particular id.
   *  Returns KeyError if a different type is already registered with the same id. */
  public native @ByVal Status AddDictionaryType(@Cast("int64_t") long id, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** \brief Add a dictionary to the memo with a particular id. Returns
   *  KeyError if that dictionary already exists */
  public native @ByVal Status AddDictionary(@Cast("int64_t") long id, @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary);

  /** \brief Append a dictionary delta to the memo with a particular id. Returns
   *  KeyError if that dictionary does not exists */
  
  ///
  public native @ByVal Status AddDictionaryDelta(@Cast("int64_t") long id, @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary);

  /** \brief Add a dictionary to the memo if it does not have one with the id,
   *  otherwise, replace the dictionary with the new one.
   * 
   *  Return true if the dictionary was added, false if replaced. */
  public native @ByVal BoolResult AddOrReplaceDictionary(@Cast("int64_t") long id,
                                        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary);
}
