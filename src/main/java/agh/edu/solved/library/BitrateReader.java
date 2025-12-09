package agh.edu.solved.library;

import agh.edu.starter.library.Codec;
import agh.edu.starter.library.VideoFile;

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
