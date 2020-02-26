package lesson35.DAO;

import lesson35.exceptions.FileInvalidException;
import lesson35.model.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public abstract class DAO<T extends IdEntity> {
    private String path;
    private static final String formatDate = "d-MM-yyyy";

    public final void setPath(String path) {
        this.path = path;
    }

    public T add(T t) throws Exception {
        t.setId(generateId());
        addWriteFile(t);
        return t;
    }

    private void addWriteFile(T t) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String stringNew = t.toString();
            if (new File(path).length() != 0) stringNew = "\n" + stringNew;
            // TODO: 11 создание целого объекта File для проверки пустой ли файл, норм ли это?
            bufferedWriter.append(stringNew);
        } catch (IOException e) {
            throw new IOException("не удалось добавить строку объекта " + t.getClass() + " id=" + t.getId() +
                    " в файл path=" + path + ". class DAO, metod addWriteFile(T t)");
        }
    }

    public void delete(long id) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(getList());

        for (String s : strings)
            if (Long.parseLong(s.split(",")[0]) == id)
                strings.remove(s);

        writeFile(strings);
    }

    private void writeFile(Collection<String> strings) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
            String lineBreak = "";
            for (String s : strings) {
                // TODO: 12
                //что делает строка bufferedWriter.append, добавляет в буфер и только потом записывает в файл?
                // или дописывает при каждом цикле
                // или перезаписывает при каждом цикле?
                bufferedWriter.append(lineBreak + s);
                lineBreak = "\n";
            }
        } catch (IOException e) {
            throw new IOException("не удалось перезаписать файл path=" + path + ". class DAO, metod writeFile(String path, Collection<T> ts)");
        }
    }

    private long generateId() {
        return new Date().getTime();
    }
    // TODO: 13 нормально ли привязывать айди к времени

    private Collection<String> getList() throws IOException {
        Set<String> list = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            throw new IOException("file not read path=" + path);
        }
        return list;
    }

    public T findById(long id) throws Exception {
        for (String s : getList())
            if (Long.parseLong(s.split(",")[0]) == id)
                return mapObject(s);
        return null;
        // TODO: 15 возвращает налл?
    }

    public Set<T> getAll() throws Exception {
        Set<T> list = new HashSet<>();
        for (String s : getList()) {
            list.add(mapObject(s));
        }

        return list;
    }

    public abstract T mapObject(String line) throws Exception;

    public static final Date toDateFormat(String strinfDate) throws FileInvalidException {
        try {
            return new SimpleDateFormat(formatDate).parse(strinfDate);
        } catch (Exception e) {
            throw new FileInvalidException();
        }
    }

}

