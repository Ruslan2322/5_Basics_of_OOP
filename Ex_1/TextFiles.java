package Lesson_05.Ex_01;

public class TextFiles extends Files {

    private  Text content;


    public TextFiles(Directory directory, String fileName) {
        super (directory, fileName);
        content = new Text("");
        super.getDirectory().addFiles(this);

    }
    public void addText(String line) {
        content.addText(line);
    }


    public void changeName(String fileName) {
        this.setFileName(fileName);
    }
    public void printContent() {
        System.out.println(content.getText());
    }
}
