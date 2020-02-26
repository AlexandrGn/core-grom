package lesson1_33.lesson34;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadWriteFile {

    public static void readFile(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        }catch (IOException e){
            System.err.println("Reading from file " + path + " failed");
        }

    }

    public static void writeFile(String path, String content) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            bufferedWriter.append(content);
        }catch (IOException e){
            System.err.println("Can't write to file");
        }
    }

    //Не тестував
    public static void writeToFileFromConsole(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.err.println("File with path " + path + " not found");
            return;
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Enter file content to write in the file");
            String text="";
            String newText;

            while (true) {
                if ((newText = bufferedReader.readLine()).equals("wr")) break;

                if (text.equals(""))
                    text = newText;
                else
                    text = text + '\n' + newText;
            }
            bufferedWriter.append(text);
        }catch(IOException e) {
            System.err.println("Can't write to file with path " + path);
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
