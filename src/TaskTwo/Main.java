package TaskTwo;

public class Main {

    public static void main(String[] args) {

        LocalFileManager localFile = new LocalFileManager();
        localFile.copyFile();
        localFile.setFile("Abstraction.java");
        localFile.copyFile();
        localFile.deleteFile();

        System.out.println();
        System.out.println();

        CloudFileManager cloudFile = new CloudFileManager();
        cloudFile.copyFile();
        cloudFile.setConnection(true);
        cloudFile.setFile("Abstraction.java");
        cloudFile.copyFile();
        cloudFile.deleteFile();
        cloudFile.setConnection(false);

    }
}
