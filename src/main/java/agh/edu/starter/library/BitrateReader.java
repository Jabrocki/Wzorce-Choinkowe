package agh.edu.starter.library;

public class BitrateReader {

    public static VideoFile read(VideoFile file) {
        System.out.println(
                "Reading file " + file.getFullName()
        );
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting buffer to codec " + codec.getExtension());
        return new VideoFile(buffer.getFileName(), codec.getExtension());
    }
}
