package Lesson_05.Ex_01;



import java.util.ArrayList;

public class Directory {
    private String name;
    private ArrayList<TextFiles> files;

    public Directory(String directoryName) {
        this.name = name;
        files = new ArrayList<TextFiles>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTextFiles(ArrayList<TextFiles> textFiles) {
        this.files = files;
    }


    public void addFiles(TextFiles files) {
        this.files.add(files);
    }

    public ArrayList<TextFiles> getFiles() {
        return files;
    }

    public void removeFile(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getFileName().equalsIgnoreCase(name)) {
                files.remove(i);
            }
        }
    }
}


