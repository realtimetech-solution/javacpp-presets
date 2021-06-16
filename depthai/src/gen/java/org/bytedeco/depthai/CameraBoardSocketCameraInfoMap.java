// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;

@Name("std::unordered_map<dai::CameraBoardSocket,dai::CameraInfo>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraBoardSocketCameraInfoMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraBoardSocketCameraInfoMap(Pointer p) { super(p); }
    public CameraBoardSocketCameraInfoMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef CameraBoardSocketCameraInfoMap put(@ByRef CameraBoardSocketCameraInfoMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef CameraInfo get(@ByRef CameraBoardSocket i);
    public native CameraBoardSocketCameraInfoMap put(@ByRef CameraBoardSocket i, CameraInfo value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @ByRef @Const CameraBoardSocket first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const CameraInfo second();
    }
}

