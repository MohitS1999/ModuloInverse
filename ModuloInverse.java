import java.util.*;
public class ModuloInverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			System.out.println("For finding the ModuloInverse there is compulsory to put a and m is relatively prime(i.e (gcd(a,m)=1))");
			int a=sc.nextInt();
			int m=sc.nextInt();
			System.out.println(modInverse(a,m));
		}
	}
	public static int modInverse(int a,int m){
		//a under modulo m
		a=a%m;
		for(int x=1;x<m;x++)
			if ((x*a)%m==1)
				return x;
		return 0;
	}
}