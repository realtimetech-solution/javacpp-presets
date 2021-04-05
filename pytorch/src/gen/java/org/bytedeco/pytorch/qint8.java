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
 * This is the data type for quantized Tensors. Right now we only have
 * qint8 which is for 8 bit Tensors, and qint32 for 32 bit int Tensors,
 * we might have 4 bit, 2 bit or 1 bit data types in the future.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class qint8 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public qint8(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public qint8(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public qint8 position(long position) {
        return (qint8)super.position(position);
    }
    @Override public qint8 getPointer(long i) {
        return new qint8((Pointer)this).position(position + i);
    }

  public native byte val_(); public native qint8 val_(byte setter);
  public qint8() { super((Pointer)null); allocate(); }
  private native void allocate();
  public qint8(byte val) { super((Pointer)null); allocate(val); }
  private native void allocate(byte val);
}
