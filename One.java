public class One
{
public static void main(String args[])
{
//no increment will print 1 11 111 1111 11111
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if(i%2==0)
System.out.print(" *");
else
System.out.print(" " +(char)(j+64));
n++;  // print 1 23 456 78910 1112131415
}
//n++; //to print 1 22 333 4444 55555
System.out.println();
}

}
}
