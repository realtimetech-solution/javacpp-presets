// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief State object used for writing Arrow data directly to a Parquet
 *  column chunk. API possibly not stable */
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ArrowWriteContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrowWriteContext(Pointer p) { super(p); }

  public ArrowWriteContext(MemoryPool memory_pool, ArrowWriterProperties properties) { super((Pointer)null); allocate(memory_pool, properties); }
  private native void allocate(MemoryPool memory_pool, ArrowWriterProperties properties);

  public native MemoryPool memory_pool(); public native ArrowWriteContext memory_pool(MemoryPool setter);
  public native @Const ArrowWriterProperties properties(); public native ArrowWriteContext properties(ArrowWriterProperties setter);

  // Buffer used for storing the data of an array converted to the physical type
  // as expected by parquet-cpp.
  public native @SharedPtr ResizableBuffer data_buffer(); public native ArrowWriteContext data_buffer(ResizableBuffer setter);

  // We use the shared ownership of this buffer
  public native @SharedPtr ResizableBuffer def_levels_buffer(); public native ArrowWriteContext def_levels_buffer(ResizableBuffer setter);
}
