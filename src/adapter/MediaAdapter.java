package adapter;

public class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer player;

    public MediaAdapter(AdvancedMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            player.playVLC(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            player.playMP4(fileName);
        }
    }
}
