public class Client {
    public static void main(String[] args) {
        AbstractFile file1 = new File("file1.txt");
        AbstractFile file2 = new File("file2.txt");
        AbstractFile file3 = new File("file3.txt");
        AbstractFile file4 = new File("file4.txt");

        Directory rootDirectory = new Directory("root");
        rootDirectory.add(file1);
        rootDirectory.add(file2);

        Directory subDirectory = new Directory("subdir");
        subDirectory.add(file3);
        subDirectory.add(file4);
        
        rootDirectory.add(subDirectory);

        rootDirectory.ls();
    }
}
