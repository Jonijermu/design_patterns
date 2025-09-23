import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {

    String extension;
    List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }


    @Override
    public void visit(File file) {
        if (file.getName().contains(extension)) {
            matchedFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public List<File> getMatchedFiles() {
        return matchedFiles;
    }
}
