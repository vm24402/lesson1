import java.util.Scanner;

public class conditional_constructions {
    public static void main(String[] args) {
         /* Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:

        a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате*/

        Scanner A1= new Scanner(System.in);
        System.out.println("введите значение а");
        Scanner B2 = new Scanner(System.in);
        System.out.println("введите значение b");
         int a = A1.nextInt();
         int b = B2.nextInt();
         int a1 = a*a;
         int b2 = b*b*b;
         if (a1>b2){
            System.out.print("а больше чем b");
         }
            else {
                System.out.print("b больше чем а ");
            }
        }

    }
