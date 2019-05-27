package com.design.pattern.adapter;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/27 下午7:12
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("播放vlc 文件");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放");
    }
}
