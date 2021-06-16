// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A FileSystem implementation that delegates to another
 *  implementation after prepending a fixed base path.
 * 
 *  This is useful to expose a logical view of a subtree of a filesystem,
 *  for example a directory in a LocalFileSystem.
 *  This works on abstract paths, i.e. paths using forward slashes and
 *  and a single root "/".  Windows paths are not guaranteed to work.
 *  This makes no security guarantee.  For example, symlinks may allow to
 *  "escape" the subtree and access other parts of the underlying filesystem. */
@Namespace("arrow::fs") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SubTreeFileSystem extends FileSystem {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SubTreeFileSystem(Pointer p) { super(p); }

  // This constructor may abort if base_path is invalid.
  public SubTreeFileSystem(@StdString String base_path,
                               @SharedPtr FileSystem base_fs) { super((Pointer)null); allocate(base_path, base_fs); }
  private native void allocate(@StdString String base_path,
                               @SharedPtr FileSystem base_fs);
  public SubTreeFileSystem(@StdString BytePointer base_path,
                               @SharedPtr FileSystem base_fs) { super((Pointer)null); allocate(base_path, base_fs); }
  private native void allocate(@StdString BytePointer base_path,
                               @SharedPtr FileSystem base_fs);

  public native @StdString String type_name();
  public native @StdString String base_path();
  public native @SharedPtr FileSystem base_fs();

  public native @ByVal StringResult NormalizePath(@StdString String path);
  public native @ByVal StringResult NormalizePath(@StdString BytePointer path);

  public native @Cast("bool") boolean Equals(@Const @ByRef FileSystem other);

  /** \cond FALSE */
  /** \endcond */
  public native @ByVal FileInfoResult GetFileInfo(@StdString String path);
  public native @ByVal FileInfoResult GetFileInfo(@StdString BytePointer path);
  public native @ByVal FileInfoVectorResult GetFileInfo(@Const @ByRef FileSelector select);

  public native @ByVal @Cast("arrow::fs::FileInfoGenerator*") Pointer GetFileInfoGenerator(@Const @ByRef FileSelector select);

  public native @ByVal Status CreateDir(@StdString String path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString String path);
  public native @ByVal Status CreateDir(@StdString BytePointer path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString BytePointer path);

  public native @ByVal Status DeleteDir(@StdString String path);
  public native @ByVal Status DeleteDir(@StdString BytePointer path);
  public native @ByVal Status DeleteDirContents(@StdString String path);
  public native @ByVal Status DeleteDirContents(@StdString BytePointer path);
  public native @ByVal Status DeleteRootDirContents();

  public native @ByVal Status DeleteFile(@StdString String path);
  public native @ByVal Status DeleteFile(@StdString BytePointer path);

  public native @ByVal Status Move(@StdString String src, @StdString String dest);
  public native @ByVal Status Move(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal Status CopyFile(@StdString String src, @StdString String dest);
  public native @ByVal Status CopyFile(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal InputStreamResult OpenInputStream(
        @StdString String path);
  public native @ByVal InputStreamResult OpenInputStream(
        @StdString BytePointer path);
  public native @ByVal InputStreamResult OpenInputStream(@Const @ByRef FileInfo info);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString String path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString BytePointer path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @Const @ByRef FileInfo info);

  public native @ByVal InputStreamFuture OpenInputStreamAsync(
        @StdString String path);
  public native @ByVal InputStreamFuture OpenInputStreamAsync(
        @StdString BytePointer path);
  public native @ByVal InputStreamFuture OpenInputStreamAsync(
        @Const @ByRef FileInfo info);
  public native @ByVal RandomAccessFileFuture OpenInputFileAsync(
        @StdString String path);
  public native @ByVal RandomAccessFileFuture OpenInputFileAsync(
        @StdString BytePointer path);
  public native @ByVal RandomAccessFileFuture OpenInputFileAsync(
        @Const @ByRef FileInfo info);

  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString BytePointer path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString BytePointer path);
}
