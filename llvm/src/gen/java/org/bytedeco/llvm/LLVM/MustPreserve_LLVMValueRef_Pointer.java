// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Create and add the internalize pass to the given pass manager with the
 * provided preservation callback.
 *
 * The context parameter is forwarded to the callback on each invocation.
 * As such, it is the responsibility of the caller to extend its lifetime
 * until execution of this pass has finished.
 *
 * @see llvm::createInternalizePass function.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class MustPreserve_LLVMValueRef_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    MustPreserve_LLVMValueRef_Pointer(Pointer p) { super(p); }
    protected MustPreserve_LLVMValueRef_Pointer() { allocate(); }
    private native void allocate();
    public native @Cast("LLVMBool") int call(LLVMValueRef arg0, Pointer arg1);
}