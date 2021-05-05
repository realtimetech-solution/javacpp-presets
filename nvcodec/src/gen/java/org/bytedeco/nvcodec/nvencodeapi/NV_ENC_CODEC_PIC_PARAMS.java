// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * Codec specific per-picture encoding parameters.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CODEC_PIC_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CODEC_PIC_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CODEC_PIC_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CODEC_PIC_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CODEC_PIC_PARAMS position(long position) {
        return (NV_ENC_CODEC_PIC_PARAMS)super.position(position);
    }
    @Override public NV_ENC_CODEC_PIC_PARAMS getPointer(long i) {
        return new NV_ENC_CODEC_PIC_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** [in]: H264 encode picture params. */
    public native @ByRef NV_ENC_PIC_PARAMS_H264 h264PicParams(); public native NV_ENC_CODEC_PIC_PARAMS h264PicParams(NV_ENC_PIC_PARAMS_H264 setter);
    /** [in]: HEVC encode picture params. */
    public native @ByRef NV_ENC_PIC_PARAMS_HEVC hevcPicParams(); public native NV_ENC_CODEC_PIC_PARAMS hevcPicParams(NV_ENC_PIC_PARAMS_HEVC setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved(int i); public native NV_ENC_CODEC_PIC_PARAMS reserved(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved();
}
