package TaskThree;

public class History extends Subject {

    public String period;

    public History(String name, String teacher, String period) {
        super(name, teacher);
        this.period = period;
    }

    @Override
    public void study() {
        System.out.println("Область - " + name + ", Учитель - " + teacher + ", период истории - " + period);
    }
}