import java.util.Scanner;
public class UC1 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int x1,x2,y1,y2,x3,x4,y4;
       int linelength;
        System.out.println("Line compariosn");
        System.out.println(" First coordinates (x1, x2) : ");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("second coordinates (x2, y2) : ");
        x2=sc.nextInt();
        y2=sc.nextInt();
        linelength=(int)(Math.sqrt((x2-x1)^2+(y2-y1)^2));
}
}
