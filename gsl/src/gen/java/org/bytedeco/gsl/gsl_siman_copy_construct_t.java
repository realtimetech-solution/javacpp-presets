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
public class gsl_siman_copy_construct_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    gsl_siman_copy_construct_t(Pointer p) { super(p); }
    protected gsl_siman_copy_construct_t() { allocate(); }
    private native void allocate();
    public native Pointer call(Pointer xp);
}
