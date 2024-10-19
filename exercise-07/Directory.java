import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {
    private String name;
    private List<AbstractFile> includedFiles;

    public Directory(String name) {
        this.name = name;
        this.includedFiles = new ArrayList<>();
    }

    public void add(AbstractFile file) {
        includedFiles.add(file);
    }

    public void ls() {
        System.out.println("Directory: " + name);
        for (AbstractFile file : includedFiles) {
            file.ls(); 
        }
    }
}
