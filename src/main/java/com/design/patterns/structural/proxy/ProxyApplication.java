package com.design.patterns.structural.proxy;

import java.util.Map;

public class ProxyApplication {
    public static void main(String[] args) {
        YouTubeProxy youTubeProxy = new YouTubeProxy();

        Map<Long, Video> videos = youTubeProxy.listVideos();
        videos.forEach((id, video) -> System.out.println(video.toString()));

        Video video = youTubeProxy.getVideo(2L);
        System.out.println(video.toString());

        //  finding a video that doesn't exist
        try {
            video = youTubeProxy.getVideo(4L);
            System.out.println(video.toString());
        } catch (Exception e) {
            System.out.println("Error to get the video");
        }

        youTubeProxy.downloadVideo(1L);

        // Test reset cache
        youTubeProxy.add(new Video(4L, "Video 4", "Description 4"));

        youTubeProxy.setResetCache(true);

        //  After reset cache
        youTubeProxy.listVideos().forEach((id, video1) -> System.out.println(video1.toString()));

        //  finding new video
        video = youTubeProxy.getVideo(4L);
        System.out.println(video.toString());
    }
}
