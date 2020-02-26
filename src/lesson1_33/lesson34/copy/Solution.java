package lesson1_33.lesson34.copy;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class Solution {
    public static void copyFileContent(String fileFromPath, String fileToPath) throws IOException {
        File fileFrom=new File(fileFromPath);
        File fileTo=new File(fileToPath);

        validate(fileFrom,fileTo);

        Files.copy(fileFrom.toPath(),fileTo.toPath());
    }

    public static void copyFileContentApacheIO(String fileFromPath, String fileToPath) throws IOException{
        File fileFrom=new File(fileFromPath);
        File fileTo=new File(fileToPath);

        validate(fileFrom,fileTo);

        FileUtils.copyFile(new File(fileFromPath),new File(fileToPath));
    }

    private static void validate(File fileFrom, File fileTo) throws FileNotFoundException{

        if (!fileFrom.isFile()) {
            throw new FileNotFoundException("File with fileFromPath " + fileFrom.getPath() + " not found");
        } else if (fileTo.isFile()) {
            throw new FileNotFoundException("File with fileToPath " + fileTo.getPath() + " found");
        } else if (!fileTo.isDirectory()){
            throw new FileNotFoundException("Directory with fileToPath " + fileTo.getPath() + " not found");
        }
    }
}
