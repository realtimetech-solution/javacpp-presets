// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class NON_PAGED_DEBUG_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NON_PAGED_DEBUG_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NON_PAGED_DEBUG_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NON_PAGED_DEBUG_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NON_PAGED_DEBUG_INFO position(long position) {
        return (NON_PAGED_DEBUG_INFO)super.position(position);
    }

    public native @Cast("WORD") short Signature(); public native NON_PAGED_DEBUG_INFO Signature(short setter);
    public native @Cast("WORD") short Flags(); public native NON_PAGED_DEBUG_INFO Flags(short setter);
    public native @Cast("DWORD") int Size(); public native NON_PAGED_DEBUG_INFO Size(int setter);
    public native @Cast("WORD") short Machine(); public native NON_PAGED_DEBUG_INFO Machine(short setter);
    public native @Cast("WORD") short Characteristics(); public native NON_PAGED_DEBUG_INFO Characteristics(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native NON_PAGED_DEBUG_INFO TimeDateStamp(int setter);
    public native @Cast("DWORD") int CheckSum(); public native NON_PAGED_DEBUG_INFO CheckSum(int setter);
    public native @Cast("DWORD") int SizeOfImage(); public native NON_PAGED_DEBUG_INFO SizeOfImage(int setter);
    public native @Cast("ULONGLONG") long ImageBase(); public native NON_PAGED_DEBUG_INFO ImageBase(long setter);
    //DebugDirectorySize
    //IMAGE_DEBUG_DIRECTORY
}