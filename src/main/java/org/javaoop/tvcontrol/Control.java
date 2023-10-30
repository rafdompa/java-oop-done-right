package org.javaoop.tvcontrol;

public interface Control { //violates ISP because not all of the methods will be used everywhere; should separate interface
    void on();
    void off();
    void channelUp();
    void channelDown();

    //smart tv
    void startRecording();
    void endRecording();
    void launchYoutube();
    void launchNetflix();
}

