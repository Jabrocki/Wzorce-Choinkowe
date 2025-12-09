package agh.edu.starter.library;

public class AudioMixer {
    public VideoFile fix(VideoFile file) {
        System.out.println("Fixing audio for file " + file.getFullName());
        return file;
    }
}
