// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// NB: I decided not to call the above StreamIndex to avoid confusion with
// DeviceIndex.  This way, you access device index with index(), and stream id
// with id()

/**
 * A stream is a software mechanism used to synchronize launched kernels
 * without requiring explicit synchronizations between kernels.  The basic
 * model is that every kernel launch is associated with a stream: every
 * kernel on the same stream is implicitly synchronized so that if I launch
 * kernels A and B on the same stream, A is guaranteed to finish before B
 * launches.  If I want B to run concurrently with A, I must schedule
 * it on a different stream.
 *
 * The Stream class is a backend agnostic value class representing a stream
 * which I may schedule a kernel on.  Every stream is associated with a device,
 * which is recorded in stream, which is used to avoid confusion about which
 * device a stream refers to.
 *
 * Streams are explicitly thread-safe, in the sense that it is OK to pass
 * a Stream from one thread to another, and kernels queued from two different
 * threads will still get serialized appropriately.  (Of course, the
 * time when the kernels get queued is undetermined unless you synchronize
 * host side ;)
 *
 * Stream does NOT have a default constructor.  Streams are for expert
 * users; if you want to use Streams, we're going to assume you know
 * how to deal with C++ template error messages if you try to
 * resize() a vector of Streams.
 *
 * Known instances of streams in backends:
 *
 *  - cudaStream_t (CUDA)
 *  - hipStream_t (HIP)
 *  - cl_command_queue (OpenCL)  (NB: Caffe2's existing OpenCL integration
 *    does NOT support command queues.)
 *
 * Because this class is device agnostic, it cannot provide backend-specific
 * functionality (e.g., get the cudaStream_t of a CUDA stream.)  There are
 * wrapper classes which provide this functionality, e.g., CUDAStream.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Stream extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stream(Pointer p) { super(p); }

  public enum Unsafe { UNSAFE(0);

      public final int value;
      private Unsafe(int v) { this.value = v; }
      private Unsafe(Unsafe e) { this.value = e.value; }
      public Unsafe intern() { for (Unsafe e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public enum Default { DEFAULT(0);

      public final int value;
      private Default(int v) { this.value = v; }
      private Default(Default e) { this.value = e.value; }
      public Default intern() { for (Default e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** Unsafely construct a stream from a Device and a StreamId.  In
   *  general, only specific implementations of streams for a
   *  backend should manufacture Stream directly in this way; other users
   *  should use the provided APIs to get a stream.  In particular,
   *  we don't require backends to give any guarantees about non-zero
   *  StreamIds; they are welcome to allocate in whatever way they like. */
  public Stream(Unsafe arg0, @ByVal Device device, @Cast("c10::StreamId") int id) { super((Pointer)null); allocate(arg0, device, id); }
  private native void allocate(Unsafe arg0, @ByVal Device device, @Cast("c10::StreamId") int id);
  public Stream(@Cast("c10::Stream::Unsafe") int arg0, @ByVal Device device, @Cast("c10::StreamId") int id) { super((Pointer)null); allocate(arg0, device, id); }
  private native void allocate(@Cast("c10::Stream::Unsafe") int arg0, @ByVal Device device, @Cast("c10::StreamId") int id);

  /** Construct the default stream of a Device.  The default stream is
   *  NOT the same as the current stream; default stream is a fixed stream
   *  that never changes, whereas the current stream may be changed by
   *  StreamGuard. */
  public Stream(Default arg0, @ByVal Device device) { super((Pointer)null); allocate(arg0, device); }
  private native void allocate(Default arg0, @ByVal Device device);
  public Stream(@Cast("c10::Stream::Default") int arg0, @ByVal Device device) { super((Pointer)null); allocate(arg0, device); }
  private native void allocate(@Cast("c10::Stream::Default") int arg0, @ByVal Device device);

  
  

  public native @ByVal @NoException Device device();
  public native @NoException DeviceType device_type();
  public native @Cast("c10::DeviceIndex") @NoException byte device_index();
  public native @Cast("c10::StreamId") @NoException int id();

  // Enqueues a wait instruction in the stream's work queue.
  // This instruction is a no-op unless the event is marked
  // for recording. In that case the stream stops processing
  // until the event is recorded.

  // The purpose of this function is to more conveniently permit binding
  // of Stream to and from Python.  Without packing, I have to setup a whole
  // class with two fields (device and stream id); with packing I can just
  // store a single uint64_t.
  //
  // The particular way we pack streams into a uint64_t is considered an
  // implementation detail and should not be relied upon.
  public native @Cast("uint64_t") @NoException long pack();

  public static native @ByVal Stream unpack(@Cast("uint64_t") long bits);

  // I decided NOT to provide setters on this class, because really,
  // why would you change the device of a stream?  Just construct
  // it correctly from the beginning dude.
}
