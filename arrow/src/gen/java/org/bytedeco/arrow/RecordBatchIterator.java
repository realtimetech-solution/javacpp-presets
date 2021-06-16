// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::Iterator<std::shared_ptr<arrow::RecordBatch> >") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatchIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordBatchIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecordBatchIterator position(long position) {
        return (RecordBatchIterator)super.position(position);
    }
    @Override public RecordBatchIterator getPointer(long i) {
        return new RecordBatchIterator((Pointer)this).offsetAddress(i);
    }

  /** \brief Iterator may be constructed from any type which has a member function
   *  with signature Result<T> Next();
   *  End of iterator is signalled by returning IteratorTraits<T>::End();
   * 
   *  The argument is moved or copied to the heap and kept in a unique_ptr<void>. Only
   *  its destructor and its Next method (which are stored in function pointers) are
   *  referenced after construction.
   * 
   *  This approach is used to dodge MSVC linkage hell (ARROW-6244, ARROW-6558) when using
   *  an abstract template base class: instead of being inlined as usual for a template
   *  function the base's virtual destructor will be exported, leading to multiple
   *  definition errors when linking to any other TU where the base is instantiated. */

  public RecordBatchIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief Return the next element of the sequence, IterationTraits<T>::End() when the
   *  iteration is completed. Calling this on a default constructed Iterator
   *  will result in undefined behavior. */
  public native @ByVal RecordBatchResult Next();

  /** Pass each element of the sequence to a visitor. Will return any error status
   *  returned by the visitor, terminating iteration. */

  /** Iterators will only compare equal if they are both null.
   *  Equality comparability is required to make an Iterator of Iterators
   *  (to check for the end condition). */
  public native @Cast("bool") boolean Equals(@Const @ByRef RecordBatchIterator other);

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  @NoOffset public static class RangeIterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public RangeIterator(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public RangeIterator(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public RangeIterator position(long position) {
          return (RangeIterator)super.position(position);
      }
      @Override public RangeIterator getPointer(long i) {
          return new RangeIterator((Pointer)this).offsetAddress(i);
      }
  
    public RangeIterator() { super((Pointer)null); allocate(); }
    private native void allocate();

    

    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef RangeIterator other);

    public native @ByRef @Name("operator ++") RangeIterator increment();

    public native @ByVal @Name("operator *") RecordBatchResult multiply();
  }

  public native @ByVal RangeIterator begin();

  public native @ByVal RangeIterator end();

  /** \brief Move every element of this iterator into a vector. */
  public native @ByVal RecordBatchVectorResult ToVector();
}
