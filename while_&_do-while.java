import java.util.Scanner;
public class Hell {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
// while 和 do while 只是在初始值就不满足循环条件时，效果不同；其他情况二者效果等同		
		while(count > 0)
		{
			System.out.println(count);
			count--;
		}
//		do
//		{
//			System.out.println(count);
//			count--;
//		}while(count > 0);
		

		System.out.println("Last result of count:"+count);
	}
}
