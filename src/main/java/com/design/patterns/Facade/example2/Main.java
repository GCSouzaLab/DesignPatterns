package com.design.patterns.Facade.example2;

import com.design.patterns.Facade.example2.enums.ETypeSound;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        SoundConversionFacade facade = new SoundConversionFacade();
        File mp3 = facade.convertToSound("song.mp3", ETypeSound.MP3);
        // ...

    }
}
