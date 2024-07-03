package house.kitchen;

import java.util.Arrays;
import java.util.Objects;

public class Tasse {
    private String color;
    private String[] text;
    private int size;
    private int content;

    public Tasse() {
        color = "weiß";
        text = new String[5];
    }

    public Tasse(String color) {
        this.color = color;
    }

    public Tasse(String color, String text) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String[] getText() {
        return text;
    }

    public int getSize() {
        return size;
    }

    public int getContent() {
        return content;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasse tasse = (Tasse) o;
        return size == tasse.size && content == tasse.content && Objects.equals(color, tasse.color) && Objects.deepEquals(text, tasse.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, Arrays.hashCode(text), size, content);
    }

    @Override
    public String toString() {
        return "Tasse{" +
               "color='" + color + '\'' +
               ", text=" + Arrays.toString(text) +
               ", size=" + size +
               ", content=" + content +
               '}';
    }
}
