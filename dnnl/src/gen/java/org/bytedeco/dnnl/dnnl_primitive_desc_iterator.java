// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;

// #if 0
// #endif

/** \} dnnl_api_engine
 <p>
 *  \addtogroup dnnl_api_primitives
 *  \{
 *  \addtogroup dnnl_api_primitives_common
 *  \{
 <p>
 *  \struct dnnl_primitive_desc_iterator
 *  \brief An opaque structure to describe a primitive descriptor iterator. */
@Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_primitive_desc_iterator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_primitive_desc_iterator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_primitive_desc_iterator(Pointer p) { super(p); }
}
