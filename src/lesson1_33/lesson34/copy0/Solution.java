package lesson1_33.lesson34.copy0;

import java.io.*;

public class Solution {

    public static void copyFileContent(String fileFromPath, String fileToPath) throws Exception{
        validateCopyFileContent(fileFromPath, fileToPath);

        writeFile(fileToPath, readFile(fileFromPath),true);
    }

    private static StringBuffer readFile(String path) throws IOException {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
            if (res.length() > 0)
                res.replace(res.length() - 1, res.length(), "");
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed");
            throw new IOException();
        }


        return res;
    }

    private static void writeFile(String path, StringBuffer content, boolean append) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append))) {
            bw.append(content);
        } catch (IOException e) {
            System.out.println("File " + path + " not write");
            throw new IOException();
        }
    }

    private static void validateCopyFileContent(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.isFile()) {
            throw new FileNotFoundException("File with fileFromPath " + fileFromPath + " not found");
        } else if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFromPath + " does not have permissions to be read");
        } else if (!fileTo.isFile()) {
            throw new FileNotFoundException("File with fileToPath " + fileToPath + " not found");
        } else if (!fileTo.canWrite()) {
            throw new Exception("File " + fileToPath + " does not have permissions to be written");
        }
    }

}
