package com.example.myapplication.ui;

public interface KFMediaCodecListener {
    void dataOnAvailable(KFFrame bufferFrame);

    void onError(int error, String s);
}
