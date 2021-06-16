// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* general interpolation object */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_interp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_interp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_interp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_interp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_interp position(long position) {
        return (gsl_interp)super.position(position);
    }
    @Override public gsl_interp getPointer(long i) {
        return new gsl_interp((Pointer)this).offsetAddress(i);
    }

  public native @Const gsl_interp_type type(); public native gsl_interp type(gsl_interp_type setter);
  public native double xmin(); public native gsl_interp xmin(double setter);
  public native double xmax(); public native gsl_interp xmax(double setter);
  public native @Cast("size_t") long size(); public native gsl_interp size(long setter);
  public native Pointer state(); public native gsl_interp state(Pointer setter);
}
