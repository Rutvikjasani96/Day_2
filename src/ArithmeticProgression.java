import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a,d,n,ans=0;
        System.out.println("Enter First Term : ");
        a = x.nextInt();
        System.out.println("Enter Common Ratio : ");
        d = x.nextInt();
        System.out.println("Enter N : ");
        n = x.nextInt();
        ans = n*((2*a)+(n-1)*d)/2;
        System.out.println("Answer : "+ans);
    }
}
