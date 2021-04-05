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
 // namespace detail

/** This is all the non-templated stuff common to all SmallVectors. */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SmallVectorBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SmallVectorBase(Pointer p) { super(p); }

  /** This returns size()*sizeof(T). */
  public native @Cast("size_t") long size_in_bytes();

  /** capacity_in_bytes - This returns capacity()*sizeof(T). */
  public native @Cast("size_t") long capacity_in_bytes();

  public native @Cast("bool") boolean empty();
}
