package com.design.patterns.facade.example2.service;

import com.design.patterns.facade.example2.FileSound;
import com.design.patterns.facade.example2.interfaces.Sound;

public class SoundReader {
    public static FileSound read(FileSound fileSound, Sound sound) {
        System.out.println("SoundReader: reading sound " + fileSound.getNameSound() + " of type " + sound.getType());
        return fileSound;
    }

    public static FileSound convert(FileSound fileSound, Sound sound) {
        System.out.println("SoundReader: converting sound " + fileSound.getNameSound() + " of type " + sound.getType());
        return fileSound;
    }
}
