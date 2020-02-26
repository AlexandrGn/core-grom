package lesson1_33.lesson33.ClassWork;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadWriteFile {

    public static void readFile(String path) {
        FileReader reader;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
            return;
        }
        BufferedReader br = new BufferedReader(reader);

        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed");
        } finally {
            IOUtils.closeQuietly(br);
            IOUtils.closeQuietly(reader);
        }

    }

    public static void writeFile(String path, String content) {
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append(content);
        } catch (IOException e) {
            System.err.println("Can't write to file");
        } finally {
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(writer);
        }

    }

    public static void writeToFileFromConsole(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.err.println("File with path " + path + " not found");
            return;
        }

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        String text="";
        String newText;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter file content to write in the file");

            while (true) {
                if ((newText = bufferedReader.readLine()).equals("wr")) break;

                if (text.equals(""))
                    text = newText;
                else
                    text = text + '\n' + newText;
            }

            bufferedWriter.append(text);
        } catch (IOException e) {
            System.err.println("Can't write to file with path " + path);
        } finally {
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(bufferedReader);
        }

    }


    public static void readFileByConsolePath() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        File file = null;

        System.out.println("Please, enter file path to read");
        try {
            String path = bufferedReader.readLine();
            file = new File(path);

            if (validateReadFileByConsolePath(file))
                readFile(path);
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(reader);
        }


    }

    private static boolean validateReadFileByConsolePath(File file){
        if (!file.isFile()){
            System.err.println("File with path " + file.getPath() + " not found");
            return false;
        }else if (!file.canRead()){
            System.err.println("File with path " + file.getPath() + " not can read");
            return false;
        }

        return true;
    }

}
