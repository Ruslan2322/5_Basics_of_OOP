package Lesson_05.Ex_01;

public class Files {
    private Directory directory;
    private String fileName;

    public Files(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }
}
