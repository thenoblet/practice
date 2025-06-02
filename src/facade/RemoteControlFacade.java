package facade;

public class RemoteControlFacade {
    private final DvDPlayer dvdPlayer;
    private final Screen screen;
    private final Projector projector;
    public final SoundSystem soundSystem;

    public RemoteControlFacade(
            DvDPlayer dvDPlayer,
            Screen screen,
            Projector projector,
            SoundSystem soundSystem) {

        this.dvdPlayer = dvDPlayer;
        this.screen = screen;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        screen.lowerScreen();
        projector.turnOn();
        soundSystem.turnOn();
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        dvdPlayer.turnOff();
    }
}
