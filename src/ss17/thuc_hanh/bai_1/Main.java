package ss17.thuc_hanh.bai_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private void copyFileUsingJava7Files(File source1 , File dest) throws IOException {
        Files.copy(source1.toPath(),(dest.toPath()), StandardCopyOption.REPLACE_EXISTING);
    }
}
