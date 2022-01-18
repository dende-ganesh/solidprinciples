package com.solidprinciples;

public class VideoPost extends Posts implements  Video{
    float duaration;
    VideoPost(float duaration){
        this.duaration=duaration;
    }

    @Override
    public float getDuration() {
        return duaration;
    }
}
