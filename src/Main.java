import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] pudge_guide = {"Пикаем пуджа пятерочку", "Собираем момчик",
                "Выносим врагов", "Хукаем дальников", "Ломаем трон"};
        String[] right_guide = new String[5];
        right_guide[0] = pudge_guide[0];
        right_guide[1] = pudge_guide[3];
        right_guide[2] = pudge_guide[1];
        right_guide[3] = pudge_guide[2];
        right_guide[4] = pudge_guide[4];

        System.out.println(Arrays.toString(right_guide) + "\n" +
                Arrays.equals(right_guide, pudge_guide));

        Pudge pudge = new Pudge();
        pudge.make_build();
        pudge.findMaxMin();
    }
}