package agh.edu.solved;
import agh.edu.starter.library.*;

public class VideoConverterFacade {

    public VideoFile encode(String filename, String initFormat, String distFormat) {
        // 1. Utworzenie obiektu pliku wejściowego
        VideoFile file = new VideoFile(filename, initFormat);

        // 2. Wybór kodeka
        Codec destinationCodec;
        if ("mp4".equalsIgnoreCase(distFormat)) {
            destinationCodec = new Mp4Codec();
        } else if ("ogg".equalsIgnoreCase(distFormat)) {
            destinationCodec = new OggCodec();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + distFormat);
        }

        // 3. Odczyt pliku
        VideoFile buffer = BitrateReader.read(file);

        // 4. Konwersja
        VideoFile intermediate = BitrateReader.convert(buffer, destinationCodec);

        // 5. Poprawa audio
        AudioMixer mixer = new AudioMixer();
        VideoFile result = mixer.fix(intermediate);

        System.out.println("Finished encoding " + filename + " to format " + distFormat);
        return result;
    }
}
