package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String folderName;
    private List<FileComponent> files = new ArrayList<FileComponent>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(FileComponent file) {
        files.add(file);
    }

    public void remove(FileComponent file) {
        files.remove(file);
    }

    @Override
    public int dataSize() {
        int totalSize = 0;
        for (FileComponent file : files) {
            totalSize += file.dataSize();
        }
        return totalSize;
    }

    public String toString() {
        String result = "Folder name: " + folderName + "\n";
        result += "Total size: " + dataSize() + " bytes";

        return result;
    }
}