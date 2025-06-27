package TaskOne;

public class AudioPlayer implements MediaPlayer{

    private String audio;

    @Override
    public void play(){
        if (audio == null) {
            System.out.println("Вы не выбрали аудио");
        } else {
            System.out.println("Аудио запущено:" + audio);
        }
    }

    @Override
    public void stop(){
        if (audio == null) {
            System.out.println("Не выбрано аудио");
        } else {
            System.out.println("Аудио остановлено:" + audio);
        }
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
