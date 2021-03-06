// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::detail") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ContinueFuture extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ContinueFuture() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ContinueFuture(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ContinueFuture(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ContinueFuture position(long position) {
        return (ContinueFuture)super.position(position);
    }
    @Override public ContinueFuture getPointer(long i) {
        return new ContinueFuture((Pointer)this).offsetAddress(i);
    }

}
