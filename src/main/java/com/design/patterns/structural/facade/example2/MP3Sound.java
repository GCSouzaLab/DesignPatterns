package com.design.patterns.structural.facade.example2;

import com.design.patterns.structural.facade.example2.enums.ETypeSound;
import com.design.patterns.structural.facade.example2.interfaces.Sound;

public class MP3Sound implements Sound {
    @Override
    public ETypeSound getType() {
        return ETypeSound.MP3;
    }
}
