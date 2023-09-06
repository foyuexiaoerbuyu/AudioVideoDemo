package com.example.myapplication.ui;

import android.os.Build;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class KFFrame {
    public enum KFFrameType {
        KFFrameBuffer,
        KFFrameTexture;
    }

    public KFFrameType frameType = KFFrameType.KFFrameBuffer;
    public KFFrame(KFFrameType type) {
        frameType = type;
    }
}