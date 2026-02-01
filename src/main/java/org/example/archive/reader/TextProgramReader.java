package org.example.archive.reader;

import org.example.archive.model.Program;
import org.example.archive.model.Text;

public class TextProgramReader implements ProgramReader<Program<Text>> {
    @Override
    public Program<Text> read() {
        Text[] texts = new Text[2];
        texts[0] = new Text(10,"/docs/a.txt","hola");
        texts[1] = new Text(20,"/docs/b.txt","Adios"    );

        return new Program<>("Editor de texto", texts);
    }
}
