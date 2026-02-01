package org.example.archive.model;

import java.util.Objects;

public abstract class Archive {
    private int size;
    private String path;

    public Archive(int size, String path) {
        this.size = size;
        this.path = path;
    }

    public abstract void open();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "size=" + size +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Archive archive = (Archive) o;
        return size == archive.size && Objects.equals(path, archive.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, path);
    }
}
