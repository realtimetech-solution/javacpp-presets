// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;

@NoOffset @Name("tl::optional<dai::EepromData>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EepromDataOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EepromDataOptional(Pointer p) { super(p); }
    public EepromDataOptional(EepromData value) { this(); put(value); }
    public EepromDataOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef EepromDataOptional put(@ByRef EepromDataOptional x);


    @Name("value") public native @ByRef EepromData get();
    @ValueSetter public native EepromDataOptional put(@ByRef EepromData value);
}

