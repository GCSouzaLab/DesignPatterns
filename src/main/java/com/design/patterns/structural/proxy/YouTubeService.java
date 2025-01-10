package com.design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class YouTubeService implements YouTube {

    private final Map<Long, Video> videosMap = new HashMap<>();

    public YouTubeService() {
        videosMap.put(1L, new Video(1L, "Video 1", "Description 1"));
        videosMap.put(2L, new Video(2L, "Video 2", "Description 2"));
        videosMap.put(3L, new Video(3L, "Video 3", "Description 3"));
    }

    /**
     *  Method that returns a list of videos
     */
    @Override
    public Map<Long, Video> listVideos() {
        return videosMap;
    }

    /**
     *  Method that returns a video by id
     */
    @Override
    public Video getVideo(Long id) {
        if (Objects.isNull(id)) throw new IllegalArgumentException("Id can't be null");
        return videosMap.get(id);
    }

    /**
     *  Method that downloads a video
     */
    @Override
    public void downloadVideo(Long id) {
        System.out.println("Downloading video with id " + id);
    }
}