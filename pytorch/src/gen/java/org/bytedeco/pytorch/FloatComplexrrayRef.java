// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<c10::complex<float> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FloatComplexrrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatComplexrrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FloatComplexrrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FloatComplexrrayRef position(long position) {
        return (FloatComplexrrayRef)super.position(position);
    }
    @Override public FloatComplexrrayRef getPointer(long i) {
        return new FloatComplexrrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public FloatComplexrrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit

  /** Construct an ArrayRef from a pointer and length. */

  /** Construct an ArrayRef from a range. */

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for std::vector<bool>,
  // because ArrayRef can't work on a std::vector<bool> bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::ArrayRef<c10::complex<float> >::iterator*") FloatPointer begin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::complex<float> >::iterator*") FloatPointer end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::ArrayRef<c10::complex<float> >::const_iterator*") FloatPointer cbegin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::complex<float> >::const_iterator*") FloatPointer cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */

  /** back - Get the last element. */

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal FloatComplexrrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal FloatComplexrrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal FloatComplexrrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */

  /** Vector compatibility */

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */

  /** \} */
}
