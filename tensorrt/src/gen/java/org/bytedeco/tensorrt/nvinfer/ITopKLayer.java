// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ITopKLayer
 * 
 *  \brief Layer that represents a TopK reduction.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ITopKLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ITopKLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the operation for the layer.
     * 
     *  @see getOperation(), TopKOperation
     *  */
    
    
    //!
    //!
    //!
    public native void setOperation(TopKOperation op);
    public native void setOperation(@Cast("nvinfer1::TopKOperation") int op);

    /**
     *  \brief Get the operation for the layer.
     * 
     *  @see setOperation(), TopKOperation
     *  */
    
    
    //!
    //!
    //!
    //!
    public native TopKOperation getOperation();

    /**
     *  \brief Set the k value for the layer.
     * 
     *  Currently only values up to 3840 are supported.
     * 
     *  @see getK()
     *  */
    
    
    //!
    //!
    //!
    public native void setK(int k);

    /**
     *  \brief Get the k value for the layer.
     * 
     *  @see setK()
     *  */
    
    
    //!
    //!
    //!
    public native int getK();

    /**
     *  \brief Set which axes to reduce for the layer.
     * 
     *  @see getReduceAxes()
     *  */
    
    
    //!
    //!
    //!
    public native void setReduceAxes(@Cast("uint32_t") int reduceAxes);

    /**
     *  \brief Get the axes to reduce for the layer.
     * 
     *  @see setReduceAxes()
     *  */
    public native @Cast("uint32_t") int getReduceAxes();
}
