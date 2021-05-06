// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA resource descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaResourceDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaResourceDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaResourceDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaResourceDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaResourceDesc position(long position) {
        return (cudaResourceDesc)super.position(position);
    }
    @Override public cudaResourceDesc getPointer(long i) {
        return new cudaResourceDesc((Pointer)this).offsetAddress(i);
    }

    /** Resource type */
    public native @Cast("cudaResourceType") int resType(); public native cudaResourceDesc resType(int setter);
    
            /** CUDA array */
            @Name("res.array.array") public native cudaArray res_array_array(); public native cudaResourceDesc res_array_array(cudaArray setter);
            /** CUDA mipmapped array */
            @Name("res.mipmap.mipmap") public native cudaMipmappedArray res_mipmap_mipmap(); public native cudaResourceDesc res_mipmap_mipmap(cudaMipmappedArray setter);
            /** Device pointer */
            @Name("res.linear.devPtr") public native Pointer res_linear_devPtr(); public native cudaResourceDesc res_linear_devPtr(Pointer setter);
            /** Channel descriptor */
            @Name("res.linear.desc") public native @ByRef cudaChannelFormatDesc res_linear_desc(); public native cudaResourceDesc res_linear_desc(cudaChannelFormatDesc setter);
            /** Size in bytes */
            @Name("res.linear.sizeInBytes") public native @Cast("size_t") long res_linear_sizeInBytes(); public native cudaResourceDesc res_linear_sizeInBytes(long setter);
            /** Device pointer */
            @Name("res.pitch2D.devPtr") public native Pointer res_pitch2D_devPtr(); public native cudaResourceDesc res_pitch2D_devPtr(Pointer setter);
            /** Channel descriptor */
            @Name("res.pitch2D.desc") public native @ByRef cudaChannelFormatDesc res_pitch2D_desc(); public native cudaResourceDesc res_pitch2D_desc(cudaChannelFormatDesc setter);
            /** Width of the array in elements */
            @Name("res.pitch2D.width") public native @Cast("size_t") long res_pitch2D_width(); public native cudaResourceDesc res_pitch2D_width(long setter);
            /** Height of the array in elements */
            @Name("res.pitch2D.height") public native @Cast("size_t") long res_pitch2D_height(); public native cudaResourceDesc res_pitch2D_height(long setter);
            /** Pitch between two rows in bytes */
            @Name("res.pitch2D.pitchInBytes") public native @Cast("size_t") long res_pitch2D_pitchInBytes(); public native cudaResourceDesc res_pitch2D_pitchInBytes(long setter);
}
