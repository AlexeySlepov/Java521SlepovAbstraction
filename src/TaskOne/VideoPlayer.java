package TaskOne;

public class VideoPlayer implements MediaPlayer{
    private String video;

    @Override
    public void play(){
        if (video == null) {
            System.out.println("Вы не выбрали видео");
        } else {
            System.out.println("Видео запущено:" + video);
        }
    }

    @Override
    public void stop(){
        if (video == null) {
            System.out.println("Не выбрано видео");
        } else {
            System.out.println("Видео остановлено:" + video);
        }
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
