// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avdevice;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;
import org.bytedeco.ffmpeg.avfilter.*;
import static org.bytedeco.ffmpeg.global.avfilter.*;

import static org.bytedeco.ffmpeg.global.avdevice.*;


// #if FF_API_DEVICE_CAPABILITIES
/**
 * Following API allows user to probe device capabilities (supported codecs,
 * pixel formats, sample formats, resolutions, channel counts, etc).
 * It is build on top op AVOption API.
 * Queried capabilities make it possible to set up converters of video or audio
 * parameters that fit to the device.
 *
 * List of capabilities that can be queried:
 *  - Capabilities valid for both audio and video devices:
 *    - codec:          supported audio/video codecs.
 *                      type: AV_OPT_TYPE_INT (AVCodecID value)
 *  - Capabilities valid for audio devices:
 *    - sample_format:  supported sample formats.
 *                      type: AV_OPT_TYPE_INT (AVSampleFormat value)
 *    - sample_rate:    supported sample rates.
 *                      type: AV_OPT_TYPE_INT
 *    - channels:       supported number of channels.
 *                      type: AV_OPT_TYPE_INT
 *    - channel_layout: supported channel layouts.
 *                      type: AV_OPT_TYPE_INT64
 *  - Capabilities valid for video devices:
 *    - pixel_format:   supported pixel formats.
 *                      type: AV_OPT_TYPE_INT (AVPixelFormat value)
 *    - window_size:    supported window sizes (describes size of the window size presented to the user).
 *                      type: AV_OPT_TYPE_IMAGE_SIZE
 *    - frame_size:     supported frame sizes (describes size of provided video frames).
 *                      type: AV_OPT_TYPE_IMAGE_SIZE
 *    - fps:            supported fps values
 *                      type: AV_OPT_TYPE_RATIONAL
 *
 * Value of the capability may be set by user using av_opt_set() function
 * and AVDeviceCapabilitiesQuery object. Following queries will
 * limit results to the values matching already set capabilities.
 * For example, setting a codec may impact number of formats or fps values
 * returned during next query. Setting invalid value may limit results to zero.
 *
 * Example of the usage basing on opengl output device:
 *
 * <pre>{@code
 *  AVFormatContext *oc = NULL;
 *  AVDeviceCapabilitiesQuery *caps = NULL;
 *  AVOptionRanges *ranges;
 *  int ret;
 *
 *  if ((ret = avformat_alloc_output_context2(&oc, NULL, "opengl", NULL)) < 0)
 *      goto fail;
 *  if (avdevice_capabilities_create(&caps, oc, NULL) < 0)
 *      goto fail;
 *
 *  //query codecs
 *  if (av_opt_query_ranges(&ranges, caps, "codec", AV_OPT_MULTI_COMPONENT_RANGE)) < 0)
 *      goto fail;
 *  //pick codec here and set it
 *  av_opt_set(caps, "codec", AV_CODEC_ID_RAWVIDEO, 0);
 *
 *  //query format
 *  if (av_opt_query_ranges(&ranges, caps, "pixel_format", AV_OPT_MULTI_COMPONENT_RANGE)) < 0)
 *      goto fail;
 *  //pick format here and set it
 *  av_opt_set(caps, "pixel_format", AV_PIX_FMT_YUV420P, 0);
 *
 *  //query and set more capabilities
 *
 * fail:
 *  //clean up code
 *  avdevice_capabilities_free(&query, oc);
 *  avformat_free_context(oc);
 * }</pre>
 */

/**
 * Structure describes device capabilities.
 *
 * It is used by devices in conjunction with av_device_capabilities AVOption table
 * to implement capabilities probing API based on AVOption API. Should not be used directly.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avdevice.class)
public class AVDeviceCapabilitiesQuery extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDeviceCapabilitiesQuery() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDeviceCapabilitiesQuery(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDeviceCapabilitiesQuery position(long position) {
        return (AVDeviceCapabilitiesQuery)super.position(position);
    }
    @Override public AVDeviceCapabilitiesQuery getPointer(long i) {
        return new AVDeviceCapabilitiesQuery((Pointer)this).position(position + i);
    }

    public native @Const AVClass av_class(); public native AVDeviceCapabilitiesQuery av_class(AVClass setter);
    public native AVFormatContext device_context(); public native AVDeviceCapabilitiesQuery device_context(AVFormatContext setter);
    public native @Cast("AVCodecID") int codec(); public native AVDeviceCapabilitiesQuery codec(int setter);
    public native @Cast("AVSampleFormat") int sample_format(); public native AVDeviceCapabilitiesQuery sample_format(int setter);
    public native @Cast("AVPixelFormat") int pixel_format(); public native AVDeviceCapabilitiesQuery pixel_format(int setter);
    public native int sample_rate(); public native AVDeviceCapabilitiesQuery sample_rate(int setter);
    public native int channels(); public native AVDeviceCapabilitiesQuery channels(int setter);
    public native @Cast("int64_t") long channel_layout(); public native AVDeviceCapabilitiesQuery channel_layout(long setter);
    public native int window_width(); public native AVDeviceCapabilitiesQuery window_width(int setter);
    public native int window_height(); public native AVDeviceCapabilitiesQuery window_height(int setter);
    public native int frame_width(); public native AVDeviceCapabilitiesQuery frame_width(int setter);
    public native int frame_height(); public native AVDeviceCapabilitiesQuery frame_height(int setter);
    public native @ByRef AVRational fps(); public native AVDeviceCapabilitiesQuery fps(AVRational setter);
}
