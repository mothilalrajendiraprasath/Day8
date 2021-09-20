import java.util.Scanner;
public class linecomparison {
    static int x1, y1, x2, y2, x3, y3, x4, y4, linelength1, linelength2;

    public static void lineCheck() {
        linelength1 = (int) (Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
        linelength2 = (int) (Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2));
        System.out.print("Length of line 1:" + linelength1);
        System.out.println();
        System.out.print("Length of line 2:" + linelength2);
        System.out.println();
        if (linelength1 == linelength2) {
            System.out.println("Both the lines are equal");
        } else if (linelength1 > linelength2) {
            System.out.println("line 1 is greater than line 2");
        } else {
            System.out.println("line 1 is lesser than line 2");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        linecomparison check = new linecomparison();
        int linelength1, linelength2;
        System.out.println("Line compariosn");
        System.out.println(" First coordinates (x1, y1) : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("second coordinates (x2, y2) : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println(" Third coordinates (x3, y3) : ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("second coordinates (x4, y4) : ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        check.lineCheck();
    }
}
