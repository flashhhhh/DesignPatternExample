package Structural.Composite;

public class File implements FileComponent {
    private String fileName;
    private int fileSize;

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public int dataSize() {
        return fileSize;
    }

    public String toString() {
        return "File: " + fileName + " has size " + fileSize + " bytes";
    }
}