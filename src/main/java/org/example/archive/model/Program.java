package org.example.archive.model;

import java.util.Arrays;
import java.util.Objects;

public class Program <T extends Archive>{
    private String name;
    private T[] archives;

    public Program(String name, T[] archives) {
        this.name = name;
        this.archives = archives;
    }

    public void execute(String outpuPath){
        System.out.println("Programa: " + name);
        for (T archive : archives){
            archive.open();
            archive.move(outpuPath);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getArchives() {
        return archives;
    }

    public void setArchives(T[] archives) {
        this.archives = archives;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", archives=" + Arrays.toString(archives) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Program<?> program = (Program<?>) o;
        return Objects.equals(name, program.name) && Objects.deepEquals(archives, program.archives);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(archives));
    }
}
