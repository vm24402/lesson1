import java.util.Scanner;

public class lesson_3 {
    public static void main(String[] args){
        /*System.out.print("Hello world!\n");
        System.out.print("Bye world...");
        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner DDD = new Scanner(System.in);
        double number = DDD.nextDouble();
        System.out.println("Вы ввели\n" +number);
        System.out.println("Введите второе целое число от 1 до 10: ");
        Scanner ppp = new Scanner(System.in);
        int number2 = ppp.nextInt();
        System.out.println("вы ыыели второе число"+number2);*/



        Scanner A1= new Scanner(System.in);
        System.out.println("введите значение а");
        double a = A1.nextDouble();
        Scanner B2 = new Scanner(System.in);
        System.out.println("введите значение b");

        double b = B2.nextDouble();
        double c;
        c=b*a*(a+b)/(a*a);
        //System.out.printf("%.3f",value); пример из
        System.out.printf("%.2f",c);










    }

}
