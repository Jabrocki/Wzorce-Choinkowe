package agh.edu.solved;

import agh.edu.starter.library.*;

public class VideoConverterFacade {

    public VideoFile encode(String filename, String format) {
        // 1. Utworzenie obiektu pliku wejściowego
        VideoFile file = new VideoFile(filename);

        // 2. Wybór kodeka
        Codec destinationCodec;
        if ("mp4".equalsIgnoreCase(format)) {
            destinationCodec = new Mp4Codec();
        } else if ("ogg".equalsIgnoreCase(format)) {
            destinationCodec = new OggCodec();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }

        // 3. Odczyt pliku
        VideoFile buffer = BitrateReader.read(file, destinationCodec);

        // 4. Konwersja
        VideoFile intermediate = BitrateReader.convert(buffer, destinationCodec);

        // 5. Poprawa audio
        AudioMixer mixer = new AudioMixer();
        VideoFile result = mixer.fix(intermediate);

        System.out.println("Finished encoding " + filename + " to format " + format);
        return result;
    }
}
