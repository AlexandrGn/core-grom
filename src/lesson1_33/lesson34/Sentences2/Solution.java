package lesson1_33.lesson34.Sentences2;

import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {
        validateTransferSentences(fileFromPath, fileToPath, word);

        StringBuffer contentFrom;
        StringBuffer contentTo;
        try {
            contentFrom = readFile(fileFromPath);
            contentTo = readFile(fileToPath);
        } catch (IOException e) {
            //методы ничего не поменяли
            throw new IOException();
        }

        StringBuffer newContents[];
        newContents = transformationsStringBuffer(contentFrom, word);

        try {
            writeFile(fileFromPath, newContents[0], false);
        } catch (IOException e) {
            writeFile(fileFromPath, contentFrom, false);
            throw new IOException();
        }

        try {
            writeFile(fileToPath, newContents[1], true);
        } catch (IOException e) {
            writeFile(fileFromPath, contentFrom, false);
            writeFile(fileFromPath, contentTo, false);
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

    private static StringBuffer[] transformationsStringBuffer(StringBuffer content, String word) {
        StringBuffer contentFromFileNew = new StringBuffer();
        StringBuffer contentToFile = new StringBuffer();

        ArrayList<String> sentences = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (true) {
            index2 = content.indexOf(".", index1);
            if (index2 == -1) {
                sentences.add(content.substring(index1));
                break;
            } else if (index2 == index1) {
                sentences.add(".");
                index1++;
            } else {
                sentences.add(content.substring(index1, index2));
                index1 = index2;
            }
        }


        for (String sb : sentences) {
            if (sb.length() > 10 && sb.indexOf(word) != -1)
                contentToFile.append(sb);
            else {
                contentFromFileNew.append(sb);
            }
        }

        return new StringBuffer[]{contentFromFileNew, contentToFile};
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

    private static void validateTransferSentences(String fileFromPath, String fileToPath, String word) throws Exception {
        validateTransferFileContent(fileFromPath, fileToPath);
        if (word == null || word.equals(""))
            throw new Exception("no word");
    }

}
