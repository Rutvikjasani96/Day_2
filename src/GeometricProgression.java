import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a,r,n,ans,r_n=1; // n = terms
        System.out.println("Enter  First Term : ");
        a = x.nextInt();
        System.out.println("Enter Common ratio : ");
        r = x.nextInt();
        System.out.println("Enter term : ");
        n = x.nextInt();
        for(int i=1;i<n;i++){
            r_n = r_n * r;
        }
        System.out.println("r_n : "+r_n);
        ans = (a*(r_n-1))/(r-1);
        System.out.println("Answer : "+ans);
    }
}
