import java.util.Scanner;
class Renuka
{
public void mul(int  num)
{
for(int i=0;i<=10;i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
public void mul(int  num,int j)
{
for(int i=0;i<=j;i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
public void mul( int num,int l,int m)
{
for(int i=l ;i<=m;i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
}
class Polymorphism
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
Renuka obj=new Renuka();
obj.mul(num);
System.out.println("Enter the last digit");
int j=sc.nextInt();
obj.mul(num,j);
System.out.println("Enter the first digit");
int l=sc.nextInt();
System.out.println("Enter the last digit");
int m=sc.nextInt();
obj.mul(num,l,m);
}
}