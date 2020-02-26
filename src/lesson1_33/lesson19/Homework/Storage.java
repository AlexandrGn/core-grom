package lesson1_33.lesson19.Homework;

import java.util.Arrays;

public class Storage {
    private long id;
    private File[] files;
    private String[] formatsSupported;
    private String storageCountry;
    private long storageSize;

    public Storage(long id, File[] files, String[] formatsSupported, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public long getId() {
        return id;
    }

    public File[] getFiles() {
        return files;
    }

    public String[] getFormatsSupported() {
        return formatsSupported;
    }

    public String getStorageCountry() {
        return storageCountry;
    }

    public long getStorageSize() {
        return storageSize;
    }


    public File add(File file) throws Exception {
        for (int i = 0; i < files.length; i++)
            if (files[i] == null) {
                return files[i]=file;
            }

        throw new Exception(message(file.getId()) + "Storage full");
    }

    public void delete(File file) throws Exception {
        for (int i = 0; i < files.length; i++)
            if (file.equals(files[i])) {
                files[i] = null;
                return;
            }

        throw new Exception("File " + file.getId() + " not delete in storage " + id + " . File not found");
    }

    public void validateFile(File file) throws Exception {
        formatStorage(file);

        try {
            findFileId(file.getId());
            throw new Exception(message(file.getId()) + "File.id already exists");
        }catch (Exception e){}
    }

    public File findFileId(long id) throws Exception {
        //бросает ошибку если айди не найдено
        for (File f : files)
            if (f != null && f.getId() == id) return f;

        throw new Exception("File not found");
    }


    public void formatStorage(File file) throws Exception {
        for (String formatStorage : formatsSupported)
            if (formatStorage.equals(file.getFormat())) return;

        throw new Exception(message(file.getId()) + "No format file");
    }

//    public void findFileId(File file) throws Exception {
//        //бросает ошибку если айди уже занято
//        for (File f : files)
//            if (f != null && f.getId() == file.getId())
//                throw new Exception(message(file.getId()) + "File.id already exists");
//    }

    public long busyPlace() {
        long memory = 0;
        for (File f : files)
            if (f != null) memory += f.getSize();

        return memory;
    }

    public String message(long idFile) {
        return "File (id file: " + idFile +
                " ) not correct in storage (id storage: " + id + " ). ";
    }

    @Override
    public String toString() {
        return "------------------------------------------Storage--------------------------------------------------------------" + "\n" +
                "{" +
                "id=" + id +
                ", files=" + "\n" + Controller.vivodFiles(files) +
                ", formatsSupported=" + Arrays.toString(formatsSupported) +
                ", storageCountry='" + storageCountry + '\'' +
                ", storageSize=" + storageSize +
                '}' + "\n" +
                "------------------------------------------Storage--------------------------------------------------------------";
    }
}
