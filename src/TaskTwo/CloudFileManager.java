package TaskTwo;

public class CloudFileManager implements FileManager {
    private boolean connection = false;
    private String file;

    @Override
    public void copyFile() {
        if (connection == true) {
            if (file == null) {
                System.out.println("Файл не выбран");
            } else {
                System.out.println("Файл скопирован:" + file);
            }
        } else {
            System.out.println("Подключитесь к облачному хранилищу");
        }
    }

    @Override
    public void deleteFile() {
        if (connection == true) {
            if (file == null) {
                System.out.println("Файл не выбран");
            } else {
                System.out.println("Файл удален:" + file);
                file = null;
            }
        } else {
            System.out.println("Подключитесь к облачному хранилищу");
        }
    }

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
