package Lesson_05.Ex_01;

// Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
// вывести на консоль содержимое, дополнить, удалить.


public class MainTextEngine {
        public static void main(String...args) {


            Directory directory = new Directory("Song of ice and fire");
            String fileName = "Winter is coming";
            TextFiles tFile = new TextFiles(directory, fileName);
            String line1 = "John Martin is a writer.";
            tFile.addText(line1);

            System.out.println("Text file created: \"" + tFile.getFileName() + "\"");

            tFile.changeName("Winter is coming");
            System.out.println("The file name is changed to \"" + tFile.getFileName() + "\"");

            System.out.println("\nTest: print content.");
            tFile.printContent();

            System.out.println("\nTest: add content and print.");
            String line2 = "he wrote a magnificent work - a song of ice and flame";
            tFile.addText(line2);
            tFile.printContent();

            System.out.println("\nTest: print the contents of a directory.");
            for (Files files : directory.getFiles()) {
                System.out.println(files);
            }
//
            System.out.println("\nTest: create a new text file and print the contents of the directory.");
            Files tFile2 = new TextFiles(directory, "Java For Dummies");
            for (TextFiles file : directory.getFiles()) {
                System.out.println(file);
            }
//
            System.out.println("\nTest: deleting a text file and print the contents of the directory.");
            directory.removeFile("Spring Boot in Action");
            for (TextFiles file : directory.getFiles()) {
                System.out.println(file);
            }
        }
    }


