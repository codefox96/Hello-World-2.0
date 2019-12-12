import javafx.scene.media.AudioClip;


public class Song {
    public static void Song() {
        AudioClip gfi = new AudioClip(Song.class.getResource("asg.wav").toString());
        gfi.play();
    }
}
