package com.design.patterns.Facade.example2;

import com.design.patterns.Facade.example2.enums.ETypeSound;
import com.design.patterns.Facade.example2.interfaces.Sound;
import com.design.patterns.Facade.example2.service.AudioMixer;
import com.design.patterns.Facade.example2.service.FileFactory;
import com.design.patterns.Facade.example2.service.SoundReader;

import java.io.File;

public class SoundConversionFacade {

    public File convertToSound(String name, ETypeSound typeSound) {
        System.out.println("Starting conversion");
        FileSound fileSound = new FileSound(name, typeSound);
        Sound sound = FileFactory.extract(fileSound);
        FileSound buffer = SoundReader.read(fileSound, sound);
        FileSound intermadiateData = SoundReader.convert(buffer, sound);
        File result = AudioMixer.fix(intermadiateData);
        System.out.println("Conversion completed");
        return result;
    }
}
