// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TypeIdTraits<arrow::Type::NA>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TypeIdTraits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TypeIdTraits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeIdTraits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeIdTraits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TypeIdTraits position(long position) {
        return (TypeIdTraits)super.position(position);
    }
    @Override public TypeIdTraits getPointer(long i) {
        return new TypeIdTraits((Pointer)this).offsetAddress(i);
    }

  }
