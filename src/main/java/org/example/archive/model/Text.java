package org.example.archive.model;

import java.util.Objects;

public class Text extends Archive{
    private String content;

    public Text(int size, String path, String anotherText) {
        super(size, path);
        this.content = anotherText;
    }

    @Override
    public void open() {
        System.out.println("Contenido del archivo");

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Text{" +
                "anotherText='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Text text = (Text) o;
        return Objects.equals(content, text.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }
}
