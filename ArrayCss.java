import java.util.*;
public class ArrayCss {
    public static void main(String args[]) {
        // int marks[] = new int[10];
        // marks[1] = 45;
        // System.out.println(marks);
        // int number[] = { 7, 8, 9, 5 };
        // for (int i = 0; i < number.length; i++) {
        //     System.out.print(number[i]);
        // }
        int mrks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        mrks[0] = sc.nextInt();
        mrks[1] = sc.nextInt();
        mrks[2] = sc.nextInt();
    
       System.out.println("phy : " + mrks[0]);
       System.out.println("chem : " + mrks[1]);
       System.out.println("math : " + mrks[2]);
        sc.close();
    }
}