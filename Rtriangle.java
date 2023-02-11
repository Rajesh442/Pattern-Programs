public class Rtriangle
{
public static void main(String args[])
{
int n=4,m=8;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
}
for(int k=i;k<=n;k++){
System.out.print(m);
}
m=m-2;
System.out.println();
}


}
}
