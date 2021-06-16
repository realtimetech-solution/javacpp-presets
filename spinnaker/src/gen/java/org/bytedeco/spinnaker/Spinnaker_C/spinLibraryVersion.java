// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Provides easier access to the current version of Spinnaker.
 */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinLibraryVersion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinLibraryVersion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinLibraryVersion(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinLibraryVersion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinLibraryVersion position(long position) {
        return (spinLibraryVersion)super.position(position);
    }
    @Override public spinLibraryVersion getPointer(long i) {
        return new spinLibraryVersion((Pointer)this).offsetAddress(i);
    }

    /** Major version of the library **/
    public native @Cast("unsigned int") int major(); public native spinLibraryVersion major(int setter);

    /** Minor version of the library **/
    public native @Cast("unsigned int") int minor(); public native spinLibraryVersion minor(int setter);

    /** Version type of the library **/
    public native @Cast("unsigned int") int type(); public native spinLibraryVersion type(int setter);

    /** Build number of the library **/
    public native @Cast("unsigned int") int build(); public native spinLibraryVersion build(int setter);
}
