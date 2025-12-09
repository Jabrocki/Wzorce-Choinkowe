package agh.edu.solved.library;

import agh.edu.starter.library.VideoFile;

public class AudioMixer {
    public VideoFile fix(VideoFile file) {
        System.out.println("Fixing audio for file " + file.getFilename());
        return file;
    }
}
