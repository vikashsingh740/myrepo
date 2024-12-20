package org.example.design.designpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Video youtubeVideoHd = new YoutubeVideo(new HDVideoProcessor());
        youtubeVideoHd.play("song");
        Video netflixVideoUhd = new NetflixVideo(new UHD4KVideoProcessor());
        netflixVideoUhd.play("song");
        Video netflixVideoHd = new NetflixVideo(new HDVideoProcessor());
        netflixVideoHd.play("song");
        Video youtubeVideoUhd = new YoutubeVideo(new UHD4KVideoProcessor());
        youtubeVideoUhd.play("song");
    }
}
