// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxObjCProtocolRefInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCProtocolRefInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCProtocolRefInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCProtocolRefInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCProtocolRefInfo position(long position) {
        return (CXIdxObjCProtocolRefInfo)super.position(position);
    }
    @Override public CXIdxObjCProtocolRefInfo getPointer(long i) {
        return new CXIdxObjCProtocolRefInfo((Pointer)this).position(position + i);
    }

  public native @Const CXIdxEntityInfo protocol(); public native CXIdxObjCProtocolRefInfo protocol(CXIdxEntityInfo setter);
  public native @ByRef CXCursor cursor(); public native CXIdxObjCProtocolRefInfo cursor(CXCursor setter);
  public native @ByRef CXIdxLoc loc(); public native CXIdxObjCProtocolRefInfo loc(CXIdxLoc setter);
}
