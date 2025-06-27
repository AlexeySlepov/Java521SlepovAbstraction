package TaskTwo;

public class LocalFileManager implements FileManager{

    private String file;

    @Override
    public void copyFile(){
        if (file == null) {
            System.out.println("Файл не выбран");
        } else {
            System.out.println("Файл скопирован:" + file);
        }
    }

    @Override
    public void deleteFile(){
        if (file == null) {
            System.out.println("Файл не выбран");
        } else {
            System.out.println("Файл удален:" + file);
            file = null;
        }
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
