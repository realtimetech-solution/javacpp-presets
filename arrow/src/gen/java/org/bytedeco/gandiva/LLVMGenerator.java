// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


@Namespace("gandiva") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class LLVMGenerator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMGenerator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMGenerator(Pointer p) { super(p); }
}
