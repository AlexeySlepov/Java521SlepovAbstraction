package TaskThree;

public class Science extends Subject {

    public String type;

    public Science(String name, String teacher, String type) {
        super(name, teacher);
        this.type = type;
    }

    @Override
    public void study() {
        System.out.println("Область - " + name + ", Учитель - " + teacher + ", предмет - " + type);
    }
}