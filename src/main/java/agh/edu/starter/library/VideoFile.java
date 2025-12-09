package agh.edu.starter.library;

// TODO: Zmiana formatu pliku
public class VideoFile {
    private final String fileName;
    private final String fileExtension;

    public VideoFile(String fileName, String fileExtension) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public String getFullName() {
        return fileName + "." + fileExtension;
    }
}
