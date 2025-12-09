package agh.edu.starter.library;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading file " + file.getFilename() + " using codec " + codec.getType());
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting buffer to codec " + codec.getType());
        return buffer;
    }
}
