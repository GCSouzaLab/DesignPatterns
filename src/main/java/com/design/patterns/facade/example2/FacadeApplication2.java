package com.design.patterns.facade.example2;

import com.design.patterns.facade.example2.enums.ETypeSound;

import java.io.File;

public class FacadeApplication2 {
    public static void main(String[] args) {
        SoundConversionFacade facade = new SoundConversionFacade();
        File mp3 = facade.convertToSound("song.mp3", ETypeSound.MP3);
        // ...

    }
}
