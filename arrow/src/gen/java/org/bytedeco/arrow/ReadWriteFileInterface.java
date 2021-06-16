// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadWriteFileInterface extends RandomAccessFile {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadWriteFileInterface(Pointer p) { super(p); }
    public WritableFile asWritableFile() { return asWritableFile(this); }
    @Namespace public static native @Name("static_cast<arrow::io::WritableFile*>") WritableFile asWritableFile(ReadWriteFileInterface pointer);

}
