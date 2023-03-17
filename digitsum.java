import java.util.Scanner;

class digitsum{
	public static void main(String[] args){
		int n,temp,digit,sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp=n;
		
		while(temp>0){
			digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
			
		}
		System.out.println("The sum is"+" "+sum);
	}
}