package com.design.patterns.facade.example2;

import com.design.patterns.facade.example2.enums.ETypeSound;
import com.design.patterns.facade.example2.interfaces.Sound;

public class OggSound implements Sound {
    @Override
    public ETypeSound getType() {
        return ETypeSound.OGG;
    }
}
