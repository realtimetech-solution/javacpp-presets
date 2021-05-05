// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.qt.global.Qt5Core.*;

@Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QtMessageHandler extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    QtMessageHandler(Pointer p) { super(p); }
    protected QtMessageHandler() { allocate(); }
    private native void allocate();
    public native void call(QtMsgType arg0, @Const @ByRef QMessageLogContext arg1, @Const @ByRef QString arg2);
}
