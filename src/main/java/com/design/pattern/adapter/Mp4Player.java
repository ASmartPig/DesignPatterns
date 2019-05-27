package com.design.pattern.adapter;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/27 下午7:11
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("我啥都不做");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 mp4");
    }
}
