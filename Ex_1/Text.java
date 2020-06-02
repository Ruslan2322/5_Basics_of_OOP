package Lesson_05.Ex_01;

public class Text {
    private String text;
    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void addText(String text) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(' ');
        this.text = stringBuilder.append(text).toString();
    }
}
