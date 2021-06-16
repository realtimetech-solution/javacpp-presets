// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Reads the record batch file format */
@Namespace("arrow::ipc") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatchFileReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchFileReader(Pointer p) { super(p); }


  /** \brief Open a RecordBatchFileReader
   * 
   *  Open a file-like object that is assumed to be self-contained; i.e., the
   *  end of the file interface is the end of the Arrow file. Note that there
   *  can be any amount of data preceding the Arrow-formatted data, because we
   *  need only locate the end of the Arrow file stream to discover the metadata
   *  and then proceed to read the data into memory. */
  
  ///
  public static native @ByVal RecordBatchFileReaderResult Open(
        RandomAccessFile file,
        @Const @ByRef(nullValue = "arrow::ipc::IpcReadOptions::Defaults()") IpcReadOptions options);
  public static native @ByVal RecordBatchFileReaderResult Open(
        RandomAccessFile file);

  /** \brief Open a RecordBatchFileReader
   *  If the file is embedded within some larger file or memory region, you can
   *  pass the absolute memory offset to the end of the file (which contains the
   *  metadata footer). The metadata must have been written with memory offsets
   *  relative to the start of the containing file
   * 
   *  @param file [in] the data source
   *  @param footer_offset [in] the position of the end of the Arrow file
   *  @param options [in] options for IPC reading
   *  @return the returned reader */
  
  ///
  public static native @ByVal RecordBatchFileReaderResult Open(
        RandomAccessFile file, @Cast("int64_t") long footer_offset,
        @Const @ByRef(nullValue = "arrow::ipc::IpcReadOptions::Defaults()") IpcReadOptions options);
  public static native @ByVal RecordBatchFileReaderResult Open(
        RandomAccessFile file, @Cast("int64_t") long footer_offset);

  /** \brief Version of Open that retains ownership of file
   * 
   *  @param file [in] the data source
   *  @param options [in] options for IPC reading
   *  @return the returned reader */

  /** \brief Version of Open that retains ownership of file
   * 
   *  @param file [in] the data source
   *  @param footer_offset [in] the position of the end of the Arrow file
   *  @param options [in] options for IPC reading
   *  @return the returned reader */

  /** \brief The schema read from the file */
  public native @SharedPtr @ByVal Schema schema();

  /** \brief Returns the number of record batches in the file */
  public native int num_record_batches();

  /** \brief Return the metadata version from the file metadata */
  public native MetadataVersion version();

  /** \brief Return the contents of the custom_metadata field from the file's
   *  Footer */
  
  ///
  public native @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata();

  /** \brief Read a particular record batch from the file. Does not copy memory
   *  if the input source supports zero-copy.
   * 
   *  @param i [in] the index of the record batch to return
   *  @return the read batch */
  public native @ByVal RecordBatchResult ReadRecordBatch(int i);

  /** \brief Return current read statistics */
  public native @ByVal ReadStats stats();
}
