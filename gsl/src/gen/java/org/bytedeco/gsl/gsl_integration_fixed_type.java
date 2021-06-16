// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_fixed_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_fixed_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_fixed_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_fixed_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_fixed_type position(long position) {
        return (gsl_integration_fixed_type)super.position(position);
    }
    @Override public gsl_integration_fixed_type getPointer(long i) {
        return new gsl_integration_fixed_type((Pointer)this).offsetAddress(i);
    }

  public static class Check_long_gsl_integration_fixed_params extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Check_long_gsl_integration_fixed_params(Pointer p) { super(p); }
      protected Check_long_gsl_integration_fixed_params() { allocate(); }
      private native void allocate();
      public native int call(@Cast("const size_t") long n, @Const gsl_integration_fixed_params params);
  }
  public native Check_long_gsl_integration_fixed_params check(); public native gsl_integration_fixed_type check(Check_long_gsl_integration_fixed_params setter);
  public static class Init_long_DoublePointer_DoublePointer_gsl_integration_fixed_params extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_long_DoublePointer_DoublePointer_gsl_integration_fixed_params(Pointer p) { super(p); }
      protected Init_long_DoublePointer_DoublePointer_gsl_integration_fixed_params() { allocate(); }
      private native void allocate();
      public native int call(@Cast("const size_t") long n, DoublePointer diag, DoublePointer subdiag, gsl_integration_fixed_params params);
  }
  public native Init_long_DoublePointer_DoublePointer_gsl_integration_fixed_params init(); public native gsl_integration_fixed_type init(Init_long_DoublePointer_DoublePointer_gsl_integration_fixed_params setter);
}
