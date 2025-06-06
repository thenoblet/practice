package adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        // Built-in support for mp3
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        // MediaAdapter provides support for other formats
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {

            AdvancedMediaPlayer player = createPlayer(audioType);
            MediaAdapter mediaAdapter = new MediaAdapter(player);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }

    private AdvancedMediaPlayer createPlayer(String audioType) {
        return switch (audioType.toLowerCase()) {
            case "vlc" -> new VLCPlayer();
            case "mp4" -> new MP4Player();
            default -> throw new UnsupportedOperationException("Unsupported type: " + audioType);
        };
    }
}
