package com.example.myapplication.ui;

import static com.example.myapplication.ui.KFFrame.KFFrameType.KFFrameBuffer;

import android.media.MediaCodec;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.nio.ByteBuffer;

public class KFBufferFrame extends KFFrame {
    public ByteBuffer buffer;
    public MediaCodec.BufferInfo bufferInfo;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public KFBufferFrame() {
        super(KFFrameBuffer);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public KFBufferFrame(ByteBuffer inputBuffer, MediaCodec.BufferInfo inputBufferInfo) {
        super(KFFrameBuffer);
        buffer = inputBuffer;
        bufferInfo = inputBufferInfo;
    }

    public KFFrameType frameType() {
        return KFFrameBuffer;
    }
}