package com.design.patterns.Facade.example2.service;

import com.design.patterns.Facade.example2.FileSound;

import java.io.File;

public class AudioMixer {
    public static File fix(FileSound fileSound) {
        System.out.println("AudioMixer: fixing sound " + fileSound.getNameSound() + " of type " + fileSound.getTypeSound().name());
        return new File("New sound");
    }
}
