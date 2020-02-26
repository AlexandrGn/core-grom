package lesson1_33.lesson19.Homework;

import java.sql.SQLException;

public class Controller {

    public static File put(Storage storage, File file) throws Exception {
        validatePut(storage, file);

        return storage.add(file);
    }

    public static void delete(Storage storage, File file) throws Exception {
        storage.delete(file);
    }

    public static void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        validateTransferAll(storageFrom, storageTo);

        for (File file : storageFrom.getFiles())
            if (file != null) {
                storageTo.add(file);
                storageFrom.delete(file);
            }

    }

    private static void validateTransferAll(Storage storageFrom, Storage storageTo) throws Exception {
        if (storageFrom.busyPlace() > storageTo.getStorageSize())
            //недостаточно памяти
            throw new Exception("Not enough memory to transfer data");


        int countFilesInStorageFrom = 0;
        int freeCountFilesInStorageTo = 0;

        for (File file : storageFrom.getFiles())
            if (file != null)
                countFilesInStorageFrom++;

        for (File file : storageTo.getFiles())
            if (file == null)
                freeCountFilesInStorageTo++;

        if (freeCountFilesInStorageTo < countFilesInStorageFrom)
            //недостаточно ячеек памяти для переноса данных
            throw new Exception("Not enough cells to transfer data");


        for (File file : storageFrom.getFiles())
            if (file != null)
                storageTo.validateFile(file);
    }

    public static void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {
        File file = storageFrom.findFileId(id);

        validateTransferFile(storageTo, file);

        storageTo.add(file);
        storageFrom.delete(file);
    }

    public static void validatePut(Storage storage, File file) throws Exception {
        if (file.getSize() + storage.busyPlace() > storage.getStorageSize())
            throw new Exception(storage.message(file.getId()) + "No space in storage");

        storage.validateFile(file);
    }

    public static void validateTransferFile(Storage storage, File file) throws Exception {
        validatePut(storage, file);

    }

    public static String vivodFiles(File[] files) {
        String s = "";
        for (File f : files) {
            if (f != null)
                s += "---" + f.toString() + "\n";
            else s += "---" + null + "\n";

        }

        return s;
    }

}
