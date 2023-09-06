package com.example.myapplication.ui;

public interface KFAudioCaptureListener {
    void onError(int error,String errorMsg);
    void onFrameAvailable(KFFrame frame);
}