// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Options for writing Arrow IPC messages */
@Namespace("arrow::ipc") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IpcWriteOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IpcWriteOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IpcWriteOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IpcWriteOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IpcWriteOptions position(long position) {
        return (IpcWriteOptions)super.position(position);
    }
    @Override public IpcWriteOptions getPointer(long i) {
        return new IpcWriteOptions((Pointer)this).offsetAddress(i);
    }

  /** \brief If true, allow field lengths that don't fit in a signed 32-bit int.
   * 
   *  Some implementations may not be able to parse streams created with this option. */
  public native @Cast("bool") boolean allow_64bit(); public native IpcWriteOptions allow_64bit(boolean setter);

  /** \brief The maximum permitted schema nesting depth. */
  public native int max_recursion_depth(); public native IpcWriteOptions max_recursion_depth(int setter);

  /** \brief Write padding after memory buffers up to this multiple of bytes. */
  
  ///
  public native int alignment(); public native IpcWriteOptions alignment(int setter);

  /** \brief Write the pre-0.15.0 IPC message format
   * 
   *  This legacy format consists of a 4-byte prefix instead of 8-byte. */
  
  ///
  public native @Cast("bool") boolean write_legacy_ipc_format(); public native IpcWriteOptions write_legacy_ipc_format(boolean setter);

  /** \brief The memory pool to use for allocations made during IPC writing
   * 
   *  While Arrow IPC is predominantly zero-copy, it may have to allocate
   *  memory in some cases (for example if compression is enabled). */
  
  ///
  public native MemoryPool memory_pool(); public native IpcWriteOptions memory_pool(MemoryPool setter);

  /** \brief Compression codec to use for record batch body buffers
   * 
   *  May only be UNCOMPRESSED, LZ4_FRAME and ZSTD. */
  public native @SharedPtr Codec codec(); public native IpcWriteOptions codec(Codec setter);

  /** \brief Use global CPU thread pool to parallelize any computational tasks
   *  like compression */
  
  ///
  ///
  ///
  public native @Cast("bool") boolean use_threads(); public native IpcWriteOptions use_threads(boolean setter);

  /** \brief Whether to emit dictionary deltas
   * 
   *  If false, a changed dictionary for a given field will emit a full
   *  dictionary replacement.
   *  If true, a changed dictionary will be compared against the previous
   *  version. If possible, a dictionary delta will be omitted, otherwise
   *  a full dictionary replacement.
   * 
   *  Default is false to maximize stream compatibility.
   * 
   *  Also, note that if a changed dictionary is a nested dictionary,
   *  then a delta is never emitted, for compatibility with the read path. */
  
  ///
  ///
  ///
  ///
  public native @Cast("bool") boolean emit_dictionary_deltas(); public native IpcWriteOptions emit_dictionary_deltas(boolean setter);

  /** \brief Whether to unify dictionaries for the IPC file format
   * 
   *  The IPC file format doesn't support dictionary replacements or deltas.
   *  Therefore, chunks of a column with a dictionary type must have the same
   *  dictionary in each record batch.
   * 
   *  If this option is true, RecordBatchWriter::WriteTable will attempt
   *  to unify dictionaries across each table column.  If this option is
   *  false, unequal dictionaries across a table column will simply raise
   *  an error.
   * 
   *  Note that enabling this option has a runtime cost. Also, not all types
   *  currently support dictionary unification.
   * 
   *  This option is ignored for IPC streams, which support dictionary replacement
   *  and deltas. */
  
  ///
  public native @Cast("bool") boolean unify_dictionaries(); public native IpcWriteOptions unify_dictionaries(boolean setter);

  /** \brief Format version to use for IPC messages and their metadata.
   * 
   *  Presently using V5 version (readable by 1.0.0 and later).
   *  V4 is also available (readable by 0.8.0 and later). */
  public native MetadataVersion metadata_version(); public native IpcWriteOptions metadata_version(MetadataVersion setter);

  public static native @ByVal IpcWriteOptions Defaults();
}
