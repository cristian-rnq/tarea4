package org.example;

import org.example.archive.model.Program;
import org.example.archive.model.Text;
import org.example.archive.reader.ProgramReader;
import org.example.archive.reader.TextProgramReader;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextProgramReader textProgramReader = new TextProgramReader();
        Program<Text> program =textProgramReader.read();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un path de salida");
        String outputPath = scanner.nextLine();

        program.execute(outputPath);
    }
}