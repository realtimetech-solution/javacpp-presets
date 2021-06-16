// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// A simple utility for enabling profiled event tracing in TensorFlow Lite.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Profiler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Profiler(Pointer p) { super(p); }

  // As certain Profiler instance might be only interested in certain event
  // types, we define each event type value to allow a Profiler to use
  // bitmasking bitwise operations to determine whether an event should be
  // recorded or not.
  /** enum class tflite::Profiler::EventType */
  public static final int
    // Default event type, the metadata field has no special significance.
    DEFAULT = 1,

    // The event is an operator invocation and the event_metadata field is the
    // index of operator node.
    OPERATOR_INVOKE_EVENT = 2,

    // The event is an invocation for an internal operator of a TFLite delegate.
    // The event_metadata field is the index of operator node that's specific to
    // the delegate.
    DELEGATE_OPERATOR_INVOKE_EVENT = 4,

    // The event is a recording of runtime instrumentation such as the overall
    // TFLite runtime status, the TFLite delegate status (if a delegate
    // is applied), and the overall model inference latency etc.
    // Note, the delegate status and overall status are stored as separate
    // event_metadata fields. In particular, the delegate status is encoded
    // as DelegateStatus::full_status().
    GENERAL_RUNTIME_INSTRUMENTATION_EVENT = 8;

  // Signals the beginning of an event and returns a handle to the profile
  // event. The `event_metadata1` and `event_metadata2` have different
  // interpretations based on the actual Profiler instance and the `event_type`.
  // For example, as for the 'SubgraphAwareProfiler' defined in
  // lite/core/subgraph.h, when the event_type is OPERATOR_INVOKE_EVENT,
  // `event_metadata1` represents the index of a TFLite node, and
  // `event_metadata2` represents the index of the subgraph that this event
  // comes from.
  public native @Cast("uint32_t") int BeginEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type,
                                @Cast("int64_t") long event_metadata1,
                                @Cast("int64_t") long event_metadata2);
  public native @Cast("uint32_t") int BeginEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type,
                                @Cast("int64_t") long event_metadata1,
                                @Cast("int64_t") long event_metadata2);
  // Similar w/ the above, but `event_metadata2` defaults to 0.
  public native @Cast("uint32_t") int BeginEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata);
  public native @Cast("uint32_t") int BeginEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata);

  // Signals an end to the specified profile event with 'event_metadata's, This
  // is useful when 'event_metadata's are not available when the event begins
  // or when one wants to overwrite the 'event_metadata's set at the beginning.
  public native void EndEvent(@Cast("uint32_t") int event_handle, @Cast("int64_t") long event_metadata1,
                          @Cast("int64_t") long event_metadata2);
  // Signals an end to the specified profile event.
  public native void EndEvent(@Cast("uint32_t") int event_handle);

  // Appends an event of type 'event_type' with 'tag' and 'event_metadata'
  // which started at 'start' and ended at 'end'
  // Note:
  // In cases were ProfileSimmarizer and tensorflow::StatsCalculator are used
  // they assume the value is in "usec", if in any case subclasses
  // didn't put usec, then the values are not meaningful.
  // TODO karimnosseir: Revisit and make the function more clear.
  public native void AddEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long start,
                  @Cast("uint64_t") long end, @Cast("int64_t") long event_metadata);
  public native void AddEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long start,
                  @Cast("uint64_t") long end, @Cast("int64_t") long event_metadata);

  public native void AddEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long start,
                          @Cast("uint64_t") long end, @Cast("int64_t") long event_metadata1,
                          @Cast("int64_t") long event_metadata2);
  public native void AddEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long start,
                          @Cast("uint64_t") long end, @Cast("int64_t") long event_metadata1,
                          @Cast("int64_t") long event_metadata2);
}
