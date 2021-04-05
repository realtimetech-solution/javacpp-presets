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


// ============================================================================

/** Returns the batchwise pairwise distance between vectors :math:{@code v_1},
 *  :math:{@code v_2} using the p-norm.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.PairwiseDistance to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::PairwiseDistanceOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  PairwiseDistance model(PairwiseDistanceOptions().p(3).eps(0.5).keepdim(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PairwiseDistanceImpl extends PairwiseDistanceImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PairwiseDistanceImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PairwiseDistanceImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PairwiseDistanceImpl position(long position) {
        return (PairwiseDistanceImpl)super.position(position);
    }
    @Override public PairwiseDistanceImpl getPointer(long i) {
        return new PairwiseDistanceImpl((Pointer)this).position(position + i);
    }

  public PairwiseDistanceImpl(@Const @ByRef(nullValue = "torch::nn::PairwiseDistanceOptions{}") PairwiseDistanceOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::PairwiseDistanceOptions{}") PairwiseDistanceOptions options_);
  public PairwiseDistanceImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code PairwiseDistance} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input1, @Const @ByRef Tensor input2);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef PairwiseDistanceOptions options(); public native PairwiseDistanceImpl options(PairwiseDistanceOptions setter);
}
