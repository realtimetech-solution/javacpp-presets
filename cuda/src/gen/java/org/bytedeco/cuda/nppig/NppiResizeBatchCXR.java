// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppig;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppig.*;


/** \} */

/** \} image_resize */

/** \defgroup image_resize_batch ResizeBatch
 *
 * ResizeBatch functions use scale factor automatically determined by the width and height ratios for each pair of input / output images in provided batches.
 *
 * In this function as in nppiResize the resize scale factor is automatically determined by the width and height ratios of oSrcRectROI and oDstRectROI.  If either of those 
 * parameters intersect their respective image sizes then pixels outside the image size width and height will not be processed.
 * Details of the resize operation are described above in the Resize section. ResizeBatch generally takes the same parameter list as 
 * Resize except that there is a list of N instances of those parameters (N > 1) and that list is passed in device memory. A convenient
 * data structure is provided that allows for easy initialization of the parameter lists.  The only restriction on these functions is
 * that there is one single source ROI rectangle and one single destination ROI rectangle which are applied respectively to each image 
 * in the batch.  The primary purpose of this function is to provide improved performance for batches of smaller images as long as GPU 
 * resources are available.  Therefore it is recommended that the function not be used for very large images as there may not be resources 
 * available for processing several large images simultaneously.  
 * A single set of oSrcRectROI and oDstRectROI values are applied to each source image and destination image in the batch in the nppiResizeBatch 
 * version of the function while per image specific oSrcRectROI and oDstRectROI values can be used in the nppiResizeBatch_Advanced version of the function.
 * Source and destination image sizes may vary but oSmallestSrcSize and oSmallestDstSize must be set to the smallest
 * source and destination image sizes in the batch. The parameters in the NppiResizeBatchCXR structure represent the corresponding
 * per-image nppiResize parameters for each image in the nppiResizeBatch functions and the NppiImageDescriptor and NppiResizeBatchROI_Advanced structures represent 
 * the corresponding per-image nppiResize parameters for the nppiResizeBatch_Advanced functions.  The NppiResizeBatchCXR or 
 * NppiImageDescriptor and NppiResizeBatchROI_Advanced arrays must be in device memory.
 *
 * ResizeBatch supports the following interpolation modes:
 *
 * <pre>{@code
 *   NPPI_INTER_NN
 *   NPPI_INTER_LINEAR
 *   NPPI_INTER_CUBIC
 *   NPPI_INTER_SUPER
 * }</pre>
 *
 * Below is the diagram of batch resize functions for variable ROIs. Figure shows the flexibility that the API can handle.
 * The ROIs for source and destination images can be any rectangular width and height that reflects the needed resize factors, inside or beyond the image boundary.
 *
 * \image html resize.png
 *
 * \section resize_error_codes Error Codes
 * The resize primitives return the following error codes:
 *
 *         - ::NPP_RESIZE_NO_OPERATION_ERROR if either destination ROI width or
 *           height is less than 1 pixel.
 *         - ::NPP_INTERPOLATION_ERROR if eInterpolation has an illegal value.
 *         - ::NPP_SIZE_ERROR if source size width or height is less than 2 pixels.
 *
 * <h3><a name="CommonResizeBatchParameters">Common parameters for nppiResizeBatch functions include:</a></h3>
 *
 * @param oSmallestSrcSize Size in pixels of the entire smallest source image width and height, may be from different images.
 * @param oSrcRectROI Region of interest in the source images (may overlap source image size width and height).
 * @param oSmallestDstSize Size in pixels of the entire smallest destination image width and height, may be from different images.
 * @param oDstRectROI Region of interest in the destination images (may overlap destination image size width and height).
 * @param eInterpolation The type of eInterpolation to perform resampling. Currently limited to NPPI_INTER_NN, NPPI_INTER_LINEAR, NPPI_INTER_CUBIC, or NPPI_INTER_SUPER. 
 * @param pBatchList Device memory pointer to nBatchSize list of NppiResizeBatchCXR structures.
 * @param pBatchSrc Device pointer to NppiImageDescriptor list of source image descriptors. User needs to intialize this structure and copy it to device.
 * @param pBatchDst Device pointer to NppiImageDescriptor list of destination image descriptors. User needs to intialize this structure and copy it to device. 
 * @param pBatchROI Device pointer to NppiResizeBatchROI_Advanced list of per-image variable ROIs. User needs to initialize this structure and copy it to device. 
 * @param nBatchSize Number of NppiResizeBatchCXR structures in this call (must be > 1).
 * @param nppStreamCtx \ref application_managed_stream_context. 
 * @return \ref image_data_error_codes, \ref roi_error_codes, \ref resize_error_codes
 *
 * <h3><a name="CommonResizeBatchAdvancedParameters">Common parameters for nppiResizeBatchAdvanced functions include:</a></h3>
 *
 * @param nMaxWidth The maximum width of all destination ROIs
 * @param nMaxHeight The maximum height of all destination ROIs
 * @param pBatchSrc Device pointer to NppiImageDescriptor list of source image descriptors. User needs to intialize this structure and copy it to device.
 * @param pBatchDst Device pointer to NppiImageDescriptor list of destination image descriptors. User needs to intialize this structure and copy it to device. 
 * @param pBatchROI Device pointer to NppiResizeBatchROI_Advanced list of per-image variable ROIs. User needs to initialize this structure and copy it to device. 
 * @param nBatchSize Number of images in a batch.
 * @param eInterpolation The type of eInterpolation to perform resampling.
 * @param nppStreamCtx \ref application_managed_stream_context. 
 * @return \ref image_data_error_codes, \ref roi_error_codes, \ref resize_error_codes
 *
 * \{
 *
 */

@Properties(inherit = org.bytedeco.cuda.presets.nppig.class)
public class NppiResizeBatchCXR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiResizeBatchCXR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiResizeBatchCXR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiResizeBatchCXR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiResizeBatchCXR position(long position) {
        return (NppiResizeBatchCXR)super.position(position);
    }
    @Override public NppiResizeBatchCXR getPointer(long i) {
        return new NppiResizeBatchCXR((Pointer)this).offsetAddress(i);
    }

    public native @Const Pointer pSrc(); public native NppiResizeBatchCXR pSrc(Pointer setter);  /* device memory pointer */
    public native int nSrcStep(); public native NppiResizeBatchCXR nSrcStep(int setter);
    public native Pointer pDst(); public native NppiResizeBatchCXR pDst(Pointer setter);        /* device memory pointer */
    public native int nDstStep(); public native NppiResizeBatchCXR nDstStep(int setter);
}
