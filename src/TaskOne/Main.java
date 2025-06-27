package TaskOne;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audio = new AudioPlayer();
        audio.play();
        audio.setAudio("To the moon");
        audio.play();
        audio.setAudio("Sonne");
        audio.play();
        audio.stop();

        System.out.println();
        System.out.println();

        VideoPlayer video = new VideoPlayer();
        video.play();
        video.setVideo("Matrix");
        video.play();
        video.setVideo("Snatch");
        video.play();
        video.stop();
    }
}
