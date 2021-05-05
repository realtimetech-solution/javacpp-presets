// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::vector<float>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FloatVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatVector(Pointer p) { super(p); }
    public FloatVector(float value) { this(1); put(0, value); }
    public FloatVector(float ... array) { this(array.length); put(array); }
    public FloatVector()       { allocate();  }
    public FloatVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FloatVector put(@ByRef FloatVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native float get(@Cast("size_t") long i);
    public native FloatVector put(@Cast("size_t") long i, float value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, float value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") float get();
    }

    public float[] get() {
        float[] array = new float[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public float pop_back() {
        long size = size();
        float value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public FloatVector push_back(float value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public FloatVector put(float value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public FloatVector put(float ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

