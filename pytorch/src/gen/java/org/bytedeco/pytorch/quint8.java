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


/**
 * quint8 is for unsigned 8 bit quantized Tensors
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class quint8 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public quint8(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public quint8(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public quint8 position(long position) {
        return (quint8)super.position(position);
    }
    @Override public quint8 getPointer(long i) {
        return new quint8((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint8_t") byte val_(); public native quint8 val_(byte setter);
  public quint8() { super((Pointer)null); allocate(); }
  private native void allocate();
  public quint8(@Cast("uint8_t") byte val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("uint8_t") byte val);
}
