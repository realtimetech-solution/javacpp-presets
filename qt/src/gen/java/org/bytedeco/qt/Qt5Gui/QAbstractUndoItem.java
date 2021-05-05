// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Gui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;

import static org.bytedeco.qt.global.Qt5Gui.*;


@Properties(inherit = org.bytedeco.qt.presets.Qt5Gui.class)
public class QAbstractUndoItem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAbstractUndoItem(Pointer p) { super(p); }

    public native void undo();
    public native void redo();
}
