package Structural.Composite;

public class Test {
    public static void main(String[] args) {
        FileComponent DSAFolder = new Folder("DSA");
        FileComponent DataStructureFolder = new Folder("Data Structure");
        FileComponent AlgorithmFolder = new Folder("Algorithm");

        FileComponent stackPDF = new File("Stack.pdf", 100);
        FileComponent queuePDF = new File("Queue.pdf", 200);
        ((Folder) DataStructureFolder).add(stackPDF);
        ((Folder) DataStructureFolder).add(queuePDF);

        FileComponent sortPDF = new File("Sort.pdf", 300);
        FileComponent searchPDF = new File("Search.pdf", 400);
        ((Folder) AlgorithmFolder).add(sortPDF);
        ((Folder) AlgorithmFolder).add(searchPDF);

        FileComponent readmeFile = new File("README.md", 1);

        ((Folder) DSAFolder).add(DataStructureFolder);
        ((Folder) DSAFolder).add(AlgorithmFolder);
        ((Folder) DSAFolder).add(readmeFile);

        System.out.println(DSAFolder.toString());
    }
}