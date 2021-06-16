// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief An InputStream wrapper that makes reads slower.
 * 
 *  Read() calls are made slower by an average latency (in seconds).
 *  Actual latencies form a normal distribution closely centered
 *  on the average latency.
 *  Other calls are forwarded directly. */
@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SlowInputStream extends InputStreamSlowInputStreamBase {
    static { Loader.load(); }


  
    public SlowInputStream(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream,
                          @SharedPtr LatencyGenerator latencies) { super((Pointer)null); allocate(stream, latencies); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream,
                          @SharedPtr LatencyGenerator latencies);
  
    public SlowInputStream(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream, double average_latency) { super((Pointer)null); allocate(stream, average_latency); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream, double average_latency);
  
    public SlowInputStream(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream, double average_latency,
                          int seed) { super((Pointer)null); allocate(stream, average_latency, seed); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream stream, double average_latency,
                          int seed);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SlowInputStream(Pointer p) { super(p); }


  public native @ByVal Status Close();
  public native @ByVal Status Abort();
  public native @Cast("bool") boolean closed();

  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);
  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);
  public native @ByVal StringViewResult Peek(@Cast("int64_t") long nbytes);

  public native @ByVal LongResult Tell();
}
