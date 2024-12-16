package com.design.patterns.Facade.example2.service;

import com.design.patterns.Facade.example2.FileSound;
import com.design.patterns.Facade.example2.MP3Sound;
import com.design.patterns.Facade.example2.OggSound;
import com.design.patterns.Facade.example2.enums.ETypeSound;
import com.design.patterns.Facade.example2.interfaces.Sound;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class FileFactory {
    private static final Map<ETypeSound, Sound> soundMap = new EnumMap<>(ETypeSound.class);

    static {
        soundMap.put(ETypeSound.MP3, new MP3Sound());
        soundMap.put(ETypeSound.OGG, new OggSound());
    }

    public static Sound extract(FileSound file) {
        Sound sound = soundMap.get(file.getTypeSound());
        if (Objects.isNull(sound))
            throw new IllegalArgumentException("Sound type not found");
        return sound;
    }
}
