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


/** Options for {@code torch::nn::functional::instance_norm}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::instance_norm(input, F::InstanceNormFuncOptions().running_mean(mean).running_var(variance).weight(weight).bias(bias).momentum(0.1).eps(1e-5));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InstanceNormFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public InstanceNormFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InstanceNormFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstanceNormFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InstanceNormFuncOptions position(long position) {
        return (InstanceNormFuncOptions)super.position(position);
    }
    @Override public InstanceNormFuncOptions getPointer(long i) {
        return new InstanceNormFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException Tensor running_mean();
  public native @ByRef @NoException Tensor running_var();
  public native @ByRef @NoException Tensor weight();
  public native @ByRef @NoException Tensor bias();
  public native @Cast("bool*") @ByRef @NoException BoolPointer use_input_stats();
  public native @ByRef @NoException DoublePointer momentum();
  public native @ByRef @NoException DoublePointer eps();
}
