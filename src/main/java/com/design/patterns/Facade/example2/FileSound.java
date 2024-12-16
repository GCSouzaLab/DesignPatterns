package com.design.patterns.Facade.example2;

import com.design.patterns.Facade.example2.enums.ETypeSound;
import lombok.Data;

@Data
public class FileSound {
    private String nameSound;
    private ETypeSound typeSound;

    public FileSound(String nameSound, ETypeSound typeSound) {
        this.nameSound = nameSound;
        this.typeSound = typeSound;
    }
}
