// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;



/**
 * Provides details of uniquely labeled pixel regions of interest returned 
 * by CompressedLabelMarkersUF function. 
 */

@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiCompressedMarkerLabelsInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiCompressedMarkerLabelsInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiCompressedMarkerLabelsInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiCompressedMarkerLabelsInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiCompressedMarkerLabelsInfo position(long position) {
        return (NppiCompressedMarkerLabelsInfo)super.position(position);
    }
    @Override public NppiCompressedMarkerLabelsInfo getPointer(long i) {
        return new NppiCompressedMarkerLabelsInfo((Pointer)this).position(position + i);
    }

    /** total number of pixels in this connected pixel region */
    public native @Cast("unsigned int") int nMarkerLabelPixelCount(); public native NppiCompressedMarkerLabelsInfo nMarkerLabelPixelCount(int setter);
    /** total number of pixels in this connected pixel region contour */
    public native @Cast("unsigned int") int nContourPixelCount(); public native NppiCompressedMarkerLabelsInfo nContourPixelCount(int setter);
    /** current index of pixel being added to geometry info list */
    public native @Cast("unsigned int") int nCurContourPixelIndex(); public native NppiCompressedMarkerLabelsInfo nCurContourPixelIndex(int setter);
    /** image geometric x and y location of the first pixel in the contour */
    public native @ByRef NppiPoint oContourFirstPixelLocation(); public native NppiCompressedMarkerLabelsInfo oContourFirstPixelLocation(NppiPoint setter);
    /** bounding box of this connected pixel region */
    public native @ByRef NppiRect oMarkerLabelBoundingBox(); public native NppiCompressedMarkerLabelsInfo oMarkerLabelBoundingBox(NppiRect setter);
}
