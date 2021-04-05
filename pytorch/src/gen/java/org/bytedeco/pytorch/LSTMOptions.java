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


/** Options for the {@code LSTM} module.
 * 
 *  Example:
 *  <pre>{@code
 *  LSTM model(LSTMOptions(2, 4).num_layers(3).batch_first(false).bidirectional(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LSTMOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LSTMOptions(Pointer p) { super(p); }

  public LSTMOptions(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public native @Cast("int64_t*") @ByRef @NoException LongPointer input_size();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer hidden_size();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer num_layers();
  public native @Cast("bool*") @ByRef @NoException BoolPointer bias();
  public native @Cast("bool*") @ByRef @NoException BoolPointer batch_first();
  public native @ByRef @NoException DoublePointer dropout();
  public native @Cast("bool*") @ByRef @NoException BoolPointer bidirectional();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer proj_size();
}
