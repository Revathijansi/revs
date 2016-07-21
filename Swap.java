
import java.util.scanner;
class Swap
{
int temp;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
temp=a;
a=b;
b=c;
c=temp;
System.out.println(a +b +c);
}
}
