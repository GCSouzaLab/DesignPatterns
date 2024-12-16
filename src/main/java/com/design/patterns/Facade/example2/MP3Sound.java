package com.design.patterns.Facade.example2;

import com.design.patterns.Facade.example2.enums.ETypeSound;
import com.design.patterns.Facade.example2.interfaces.Sound;

public class MP3Sound implements Sound {
    @Override
    public ETypeSound getType() {
        return ETypeSound.MP3;
    }
}
