package adapter;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
       // do nothing
    }
}
