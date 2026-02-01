package org.example.archive.model;

import java.util.Objects;

public class Audio extends Archive{
    private double timeAudio;

    public Audio(int size, String path, double timeAudio) {
        super(size, path);
        this.timeAudio = timeAudio;
    }

    @Override
    public void open() {
        System.out.println("Contenido del archivo de texto");
        System.out.println("Paht: " + getPath());
        System.out.println("Tamaño: " + getSize());
        System.out.println("Duración:" + timeAudio);
    }

    public double getTimeAudio() {
        return timeAudio;
    }

    public void setTimeAudio(double timeAudio) {
        this.timeAudio = timeAudio;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "timeAudio=" + timeAudio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return Double.compare(timeAudio, audio.timeAudio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeAudio);
    }
}
