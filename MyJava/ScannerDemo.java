import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int i =sc.nextInt();
		
		System.out.println("请输入第二个数字：");
		int j =sc.nextInt();
		
		System.out.println("两数之和为：");
		System.out.println(i + j);
	}
}
