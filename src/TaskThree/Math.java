package TaskThree;

public class Math extends Subject {

    public String type;

    public Math(String name, String teacher, String type) {
        super(name, teacher);
        this.type = type;
    }

    @Override
    public void study() {
        System.out.println("Область - " + name + ", Учитель - " + teacher + ", предмет - " + type);
    }
}