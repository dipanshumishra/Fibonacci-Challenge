import java.util.Scanner;

class FibonacciSeries{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Fibonacci Series you want :");
        int len=scan.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);

        for(i=2;i<len;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }}