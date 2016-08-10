import java.io.*;
public class Square
{
public static void main(String[] args)
{
    int x1,y1,x2,y2,x3,y3,x4,y4;
    Scanner s=new Scanner(System.in);
    int x1=s.nextInt();
    int x2=s.nextInt();
    int y2=s.nextInt();
    int x3=s.nextInt();
    int y3=s.nextInt();
    int x4=s.nextInt();
    int y4=s.nextInt();
    int d1,d2;
    int a,b,c,d;
    a=x1-x3;
    b=y1-y3;
    c=x2-x4;
    d=y2-y4;
    d1=sqrt((a*a)+(b*b));
    d2=sqrt((c*c)+(d*d));
    if(d1==d2)
        printf("It is a square");
    else
        printf("It is not a square");
    return 0;
}
}
}
