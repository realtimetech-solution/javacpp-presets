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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MaxPool3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies maxpool over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MaxPool3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MaxPool3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MaxPool3d model(MaxPool3dOptions(3).stride(2));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MaxPool3dImpl extends MaxPool3dImplBase {
    static { Loader.load(); }

  
    public MaxPool3dImpl(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
    public MaxPool3dImpl(@Const @ByRef MaxPool3dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef MaxPool3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPool3dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the outputs and the indices of the max values.
   *  Useful for {@code torch::nn::MaxUnpool3d} later. */
  public native @ByVal TensorTensorTuple forward_with_indices(@Const @ByRef Tensor input);
}
