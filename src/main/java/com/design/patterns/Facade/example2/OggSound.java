package com.design.patterns.Facade.example2;

import com.design.patterns.Facade.example2.enums.ETypeSound;
import com.design.patterns.Facade.example2.interfaces.Sound;

public class OggSound implements Sound {
    @Override
    public ETypeSound getType() {
        return ETypeSound.OGG;
    }
}
