package com.design.patterns.Proxy;

import java.util.Map;

public interface YouTube {
    Map<Long, Video> listVideos();
    Video getVideo(Long id);
    void downloadVideo(Long id);
}
