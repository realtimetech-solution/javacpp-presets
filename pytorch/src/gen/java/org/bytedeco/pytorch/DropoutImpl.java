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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Dropout ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies dropout over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Dropout to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::DropoutOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Dropout model(DropoutOptions().p(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DropoutImpl extends DropoutImplBase {
    static { Loader.load(); }

  
    public DropoutImpl(double p) { super((Pointer)null); allocate(p); }
    @NoDeallocator private native void allocate(double p);
  
    public DropoutImpl(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_);
    public DropoutImpl() { super((Pointer)null); allocate(); }
    @NoDeallocator private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DropoutImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DropoutImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DropoutImpl position(long position) {
        return (DropoutImpl)super.position(position);
    }
    @Override public DropoutImpl getPointer(long i) {
        return new DropoutImpl((Pointer)this).position(position + i);
    }


  public native @ByVal Tensor forward(@ByVal Tensor input);

  /** Pretty prints the {@code Dropout} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
