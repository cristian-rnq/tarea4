package org.example.archive.model;

import java.util.Objects;

public class Image extends Archive{
    private int height;
    private int width;

    public Image(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    @Override
    public void open() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Image{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Image image = (Image) o;
        return height == image.height && width == image.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }
}
