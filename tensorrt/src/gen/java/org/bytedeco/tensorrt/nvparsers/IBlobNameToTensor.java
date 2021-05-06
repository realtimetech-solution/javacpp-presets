// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

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
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class IBlobNameToTensor
 * 
 *  \brief Object used to store and query Tensors after they have been extracted from a Caffe model using the ICaffeParser.
 * 
 *  \note The lifetime of IBlobNameToTensor is the same as the lifetime of its parent ICaffeParser.
 * 
 *  @see nvcaffeparser1::ICaffeParser
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvcaffeparser1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class IBlobNameToTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IBlobNameToTensor(Pointer p) { super(p); }

    /** \brief Given a blob name, returns a pointer to a ITensor object.
     * 
     *  @param name Caffe blob name for which the user wants the corresponding ITensor.
     * 
     *  @return ITensor* corresponding to the queried name. If no such ITensor exists, then nullptr is returned.
     *  */
    public native ITensor find(String name);
    public native ITensor find(@Cast("const char*") BytePointer name);
}
