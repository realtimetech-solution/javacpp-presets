// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.global;

import org.bytedeco.ffmpeg.postproc.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;

public class postproc extends org.bytedeco.ffmpeg.presets.postproc {
    static { Loader.load(); }

// Parsed from <libpostproc/postprocess.h>

/*
 * Copyright (C) 2001-2003 Michael Niedermayer (michaelni@gmx.at)
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef POSTPROC_POSTPROCESS_H
// #define POSTPROC_POSTPROCESS_H

/**
 * \file
 * \ingroup lpp
 * external API header
 */

/**
 * \defgroup lpp libpostproc
 * Video postprocessing library.
 *
 * \{
 */

// #include "libpostproc/version.h"

/**
 * Return the LIBPOSTPROC_VERSION_INT constant.
 */
@NoException public static native @Cast("unsigned") int postproc_version();

/**
 * Return the libpostproc build-time configuration.
 */
@NoException public static native @Cast("const char*") BytePointer postproc_configuration();

/**
 * Return the libpostproc license.
 */
@NoException public static native @Cast("const char*") BytePointer postproc_license();

public static final int PP_QUALITY_MAX = 6;

// #include <inttypes.h>
// Targeting ../postproc/pp_context.java


// Targeting ../postproc/pp_mode.java



// #if LIBPOSTPROC_VERSION_INT < (52<<16)
// #else
/** a simple help text */
@MemberGetter public static native @Cast("const char") byte pp_help(int i);
@MemberGetter public static native @Cast("const char*") BytePointer pp_help();
// #endif

@NoException public static native void pp_postprocess(@Cast("const uint8_t**") PointerPointer src, @Const IntPointer srcStride,
                     @Cast("uint8_t**") PointerPointer dst, @Const IntPointer dstStride,
                     int horizontalSize, int verticalSize,
                     @Const BytePointer QP_store,  int QP_stride,
                     pp_mode mode, pp_context ppContext, int pict_type);
@NoException public static native void pp_postprocess(@Cast("const uint8_t**") @ByPtrPtr BytePointer src, @Const IntPointer srcStride,
                     @Cast("uint8_t**") @ByPtrPtr BytePointer dst, @Const IntPointer dstStride,
                     int horizontalSize, int verticalSize,
                     @Const BytePointer QP_store,  int QP_stride,
                     pp_mode mode, pp_context ppContext, int pict_type);
@NoException public static native void pp_postprocess(@Cast("const uint8_t**") @ByPtrPtr ByteBuffer src, @Const IntBuffer srcStride,
                     @Cast("uint8_t**") @ByPtrPtr ByteBuffer dst, @Const IntBuffer dstStride,
                     int horizontalSize, int verticalSize,
                     @Const ByteBuffer QP_store,  int QP_stride,
                     pp_mode mode, pp_context ppContext, int pict_type);
@NoException public static native void pp_postprocess(@Cast("const uint8_t**") @ByPtrPtr byte[] src, @Const int[] srcStride,
                     @Cast("uint8_t**") @ByPtrPtr byte[] dst, @Const int[] dstStride,
                     int horizontalSize, int verticalSize,
                     @Const byte[] QP_store,  int QP_stride,
                     pp_mode mode, pp_context ppContext, int pict_type);


/**
 * Return a pp_mode or NULL if an error occurred.
 *
 * @param name    the string after "-pp" on the command line
 * @param quality a number from 0 to PP_QUALITY_MAX
 */
@NoException public static native pp_mode pp_get_mode_by_name_and_quality(@Cast("const char*") BytePointer name, int quality);
@NoException public static native pp_mode pp_get_mode_by_name_and_quality(String name, int quality);
@NoException public static native void pp_free_mode(pp_mode mode);

@NoException public static native pp_context pp_get_context(int width, int height, int flags);
@NoException public static native void pp_free_context(pp_context ppContext);

public static final int PP_CPU_CAPS_MMX =   0x80000000;
public static final int PP_CPU_CAPS_MMX2 =  0x20000000;
public static final int PP_CPU_CAPS_3DNOW = 0x40000000;
public static final int PP_CPU_CAPS_ALTIVEC = 0x10000000;
public static final int PP_CPU_CAPS_AUTO =  0x00080000;

public static final int PP_FORMAT =         0x00000008;
public static final int PP_FORMAT_420 =    (0x00000011|PP_FORMAT);
public static final int PP_FORMAT_422 =    (0x00000001|PP_FORMAT);
public static final int PP_FORMAT_411 =    (0x00000002|PP_FORMAT);
public static final int PP_FORMAT_444 =    (0x00000000|PP_FORMAT);
public static final int PP_FORMAT_440 =    (0x00000010|PP_FORMAT);

/** MPEG2 style QScale */
public static final int PP_PICT_TYPE_QP2 =  0x00000010;

/**
 * \}
 */

// #endif /* POSTPROC_POSTPROCESS_H */


}
