package lesson1_33.lesson34.transfer1;

import java.io.*;

public class Solution {

    public static void transferFileContent(String fileFromPath, String fileToPath) throws Exception {

        validateTransferFileContent(fileFromPath, fileToPath);

        StringBuffer contentFrom;
        StringBuffer contentTo;
        try {
            contentFrom = readFile(fileFromPath);
            contentTo = readFile(fileToPath);
        } catch (IOException e) {
            //методы ничего не поменяли
            throw new IOException();
        }

        try {
            writeFileNewLine(fileToPath, contentFrom);
        } catch (IOException e) {
            writeFile(fileToPath, contentTo, false);
            throw new IOException();
        }

        try {
            deleteContentFile(fileFromPath);
        } catch (IOException e) {
            writeFile(fileFromPath, contentFrom, false);
            writeFile(fileToPath, contentTo, false);
            throw new IOException();
        }

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

    private static void deleteContentFile(String path) throws IOException {
        writeFile(path, new StringBuffer(), false);
    }

    private static void writeFileNewLine(String path, StringBuffer content) throws IOException {
        if (content.length() == 0) return;

        StringBuffer newContent = new StringBuffer(content);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            if (br.readLine() != null)
                newContent.insert(0, "\n");
        } catch (IOException e) {
            System.out.println("File " + path + " not reader");
            throw new IOException();
        }

        writeFile(path, newContent, true);
    }

    private static void validateTransferFileContent(String fileFromPath, String fileToPath) throws Exception {
        if (fileFromPath.equals(fileToPath)) throw new Exception("error: fileFromPath=fileToPath");

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.isFile()) {
            throw new FileNotFoundException("File with fileFromPath " + fileFromPath + " not found");
        } else if (!fileFrom.canWrite()) {
            throw new Exception("File " + fileFromPath + " does not have permissions to be written");
        } else if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFromPath + " does not have permissions to be read");
        } else if (!fileTo.isFile()) {
            throw new FileNotFoundException("File with fileToPath " + fileToPath + " not found");
        } else if (!fileTo.canWrite()) {
            throw new Exception("File " + fileToPath + " does not have permissions to be written");
        } else if (!fileTo.canRead()) {
            throw new Exception("File " + fileToPath + " does not have permissions to be read");
        }
    }


}
