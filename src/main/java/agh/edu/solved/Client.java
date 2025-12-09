package agh.edu.solved;

public class Client {
    public static void main(String[] args) {
        VideoConverterFacade facade = new VideoConverterFacade();
        VideoFile result = facade.encode("cats.mov", "mp4");
        System.out.println("Got result file: " + result.getFilename());
    }
}