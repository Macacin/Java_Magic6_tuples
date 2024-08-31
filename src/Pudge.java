import java.util.Arrays;
import java.util.Scanner;

public class Pudge {
    public void make_build() {
        Scanner sc = new Scanner(System.in);

        String[] build = {"Момчик", "Блейд мейл", "Криты"};
        System.out.println("Добро пожаловать в безумную катку с бердменом!");
        System.out.println("Введите айтемы которые вы уже собрали (через запятую):");
        String input = sc.nextLine();
        String[] user_build = input.split(", ");

        System.out.println(Arrays.toString(user_build));
        int count = 0;
        for(int i=0; i<3; i++) {
            String user_item = user_build[i];
            for(int j=0; j<3; j++) {
                String needed_item = build[j];
                if (user_item.equals(needed_item)) {
                    count++;
                }
            }
        }
        if (count == build.length) {
            System.out.println("Нааайс билдачок как надо");
        }
        else {
            System.out.println("Фууу позор а не билд");
        }
    }
    public void findMaxMin() {
        int[] numbers = {4, 2, 10, 8, 7};
        int num3 = numbers[0];
        for (int k=0; k<(numbers.length-1); k++) {
            int num1 = numbers[k];
            int num2 = numbers[k+1];
            if ((num2 > num1) && (num2 > num3)) {
                num3 = num2;
            } else if ((num2 < num1) && (num1 > num3)) {
                num3 = num1;
            }
        }
        System.out.println(num3);

        int num4 = numbers[0];
        for (int k=0; k<(numbers.length-1); k++) {
            int num1 = numbers[k];
            int num2 = numbers[k+1];
            if ((num2 < num1) && (num2 < num4)) {
                num4 = num2;
            } else if ((num2 > num1) && (num1 < num4)) {
                num4 = num1;
            }
        }
        System.out.println(num4);
    }
}
