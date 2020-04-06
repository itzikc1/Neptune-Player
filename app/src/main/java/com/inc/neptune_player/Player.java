package com.inc.neptune_player;

import android.view.Surface;

/**
 *
 */
public class Player {

    static {
        System.loadLibrary("native-lib");
    }

    public native void playVideo(Surface surface);
}
