// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/** NodeIo informations such as name, type, ... */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NodeIoInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NodeIoInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeIoInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeIoInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NodeIoInfo position(long position) {
        return (NodeIoInfo)super.position(position);
    }
    @Override public NodeIoInfo getPointer(long i) {
        return new NodeIoInfo((Pointer)this).offsetAddress(i);
    }

    public enum Type { MSender(0), SSender(1), MReceiver(2), SReceiver(3);

        public final int value;
        private Type(int v) { this.value = v; }
        private Type(Type e) { this.value = e.value; }
        public Type intern() { for (Type e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    public native @StdString BytePointer name(); public native NodeIoInfo name(BytePointer setter);
    public native Type type(); public native NodeIoInfo type(Type setter);
    public native @Cast("bool") boolean blocking(); public native NodeIoInfo blocking(boolean setter);
    public native int queueSize(); public native NodeIoInfo queueSize(int setter);
}
