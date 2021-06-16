// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;

import static org.bytedeco.opencv.global.opencv_calib3d.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class CirclesGridFinderParameters extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CirclesGridFinderParameters(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CirclesGridFinderParameters(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CirclesGridFinderParameters position(long position) {
        return (CirclesGridFinderParameters)super.position(position);
    }
    @Override public CirclesGridFinderParameters getPointer(long i) {
        return new CirclesGridFinderParameters((Pointer)this).offsetAddress(i);
    }

    public CirclesGridFinderParameters() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @ByRef Size2f densityNeighborhoodSize(); public native CirclesGridFinderParameters densityNeighborhoodSize(Size2f setter);
    public native float minDensity(); public native CirclesGridFinderParameters minDensity(float setter);
    public native int kmeansAttempts(); public native CirclesGridFinderParameters kmeansAttempts(int setter);
    public native int minDistanceToAddKeypoint(); public native CirclesGridFinderParameters minDistanceToAddKeypoint(int setter);
    public native int keypointScale(); public native CirclesGridFinderParameters keypointScale(int setter);
    public native float minGraphConfidence(); public native CirclesGridFinderParameters minGraphConfidence(float setter);
    public native float vertexGain(); public native CirclesGridFinderParameters vertexGain(float setter);
    public native float vertexPenalty(); public native CirclesGridFinderParameters vertexPenalty(float setter);
    public native float existingVertexGain(); public native CirclesGridFinderParameters existingVertexGain(float setter);
    public native float edgeGain(); public native CirclesGridFinderParameters edgeGain(float setter);
    public native float edgePenalty(); public native CirclesGridFinderParameters edgePenalty(float setter);
    public native float convexHullFactor(); public native CirclesGridFinderParameters convexHullFactor(float setter);
    public native float minRNGEdgeSwitchDist(); public native CirclesGridFinderParameters minRNGEdgeSwitchDist(float setter);

    /** enum cv::CirclesGridFinderParameters::GridType */
    public static final int
      SYMMETRIC_GRID = 0, ASYMMETRIC_GRID = 1;
    public native @Cast("cv::CirclesGridFinderParameters::GridType") int gridType(); public native CirclesGridFinderParameters gridType(int setter);

    /** Distance between two adjacent points. Used by CALIB_CB_CLUSTERING. */
    public native float squareSize(); public native CirclesGridFinderParameters squareSize(float setter);
    /** Max deviation from prediction. Used by CALIB_CB_CLUSTERING. */
    public native float maxRectifiedDistance(); public native CirclesGridFinderParameters maxRectifiedDistance(float setter);
}
