package com.design.patterns.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class YouTubeProxy implements YouTube {
    private final YouTube youTube;
    private Map<Long, Video> videosCached = new HashMap<>();
    // if we'd like to reset cache every 5 minutes, example
    private boolean resetCache;

    public YouTubeProxy() {
        this.youTube = new YouTubeService();
    }

    @Override
    public Map<Long, Video> listVideos() {
        if (videosCached.isEmpty() || resetCache) {
            populateCache();
        }
        return videosCached;
    }

    @Override
    public void downloadVideo(Long id) {
        if (videosCached.isEmpty() || resetCache) {
            populateCache();
        }

        if (!videosCached.containsKey(id)) {
            youTube.downloadVideo(id);
        }
    }

    @Override
    public Video getVideo(Long id) {
        if (videosCached.isEmpty() || resetCache) {
            populateCache();
        }
        // Trying first in cache
        Video video = videosCached.get(id);
        // If not in cache, try in YouTubeService
        if (Objects.isNull(video)) video = youTube.getVideo(id);

        if (Objects.isNull(video)) {
            System.out.println("I couldn't find the video with id " + id);
            // Here we can custumize the exception, but here this isn't my focus
            throw new IllegalArgumentException();
        }
        System.out.println("Getting video with id " + id);
        return video;
    }

    private void populateCache() {
        videosCached = youTube.listVideos();
    }

    public void setResetCache(boolean resetCache) {
        this.resetCache = resetCache;
    }

    // This method is JUST to test reset cache
    public void add(Video video) {
        youTube.listVideos().put(video.getId(), video);
    }
}
