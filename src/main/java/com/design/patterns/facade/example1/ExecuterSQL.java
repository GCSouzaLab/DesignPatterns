package com.design.patterns.facade.example1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExecuterSQL {
    private final String SQLFilename;

    public ExecuterSQL(String sql) {
        this.SQLFilename = sql;
    }

    public void execute() {
        // Here we could conect to the database and execute the SQL
        try {
            // Assuming the file is in the current directory
            Path filePath = Path.of(SQLFilename);
            // Read all file
            String sql = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
