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
 *  \class IMatrixMultiplyLayer
 * 
 *  \brief Layer that represents a Matrix Multiplication.
 * 
 *  Let A be op(getInput(0)) and B be op(getInput(1)) where
 *  op(x) denotes the corresponding MatrixOperation.
 * 
 *  When A and B are matrices or vectors, computes the inner product A * B:
 * 
 *      matrix * matrix -> matrix
 *      matrix * vector -> vector
 *      vector * matrix -> vector
 *      vector * vector -> scalar
 * 
 *  Inputs of higher rank are treated as collections of matrices or vectors.
 *  The output will be a corresponding collection of matrices, vectors, or scalars.
 * 
 *  For a dimension that is not one of the matrix or vector dimensions:
 *  If the dimension is 1 for one of the tensors but not the other tensor,
 *  the former tensor is broadcast along that dimension to match the dimension of the latter tensor.
 *  The number of these extra dimensions for A and B must match.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IMatrixMultiplyLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMatrixMultiplyLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the operation for an input tensor.
     *  @param index Input tensor number (0 or 1).
     *  @param op New operation.
     *  @see getTranspose()
     *  */
    
    
    //!
    //!
    public native void setOperation(int index, MatrixOperation op);
    public native void setOperation(int index, @Cast("nvinfer1::MatrixOperation") int op);

    /**
     *  \brief Get the operation for an input tensor.
     *  @param index Input tensor number (0 or 1).
     *  @see setTranspose()
     *  */
    
    
    //!
    //!
    //!
    public native MatrixOperation getOperation(int index);

    /**
     *  \brief Set the transpose flag for an input tensor.
     *  @param index Input tensor number (0 or 1).
     *  @param val New transpose flag.
     *  @see getTranspose()
     * 
     *  @deprecated setTranspose is superseded by setOperation and will be removed in TensorRT 8.0.
     *  */
    
    
    //!
    //!
    //!
    public native @Deprecated void setTranspose(int index, @Cast("bool") boolean val);

    /**
     *  \brief Get the transpose flag for an input tensor.
     *  @param index Input tensor number (0 or 1).
     *  @see setTranspose()
     * 
     *  @deprecated getTranspose is superseded by getOperation and will be removed in TensorRT 8.0.
     *  */
    public native @Cast("bool") @Deprecated boolean getTranspose(int index);
}
