package TaskThree;

public class Main {

    public static void main(String[] args) {
        Subject[] subjects = {
                new Math("Математика", "Жукова М.А", "Алгебра"),
                new History("История", "Совельев И.Н.", "История России 19 века"),
                new Science("Наука", "Медведева Е.В.", "Физика"),
                new Science("Наука", "Епифанова И.Г.", "Химия"),
                new Math("Математика", "Жукова М.А", "Геометрия")
        };

        for (int i = 0; i < subjects.length; i++) {
            subjects[i].study();
        }
    }

}
