
public class BreakExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		//1-100以内的数求和，求出 当 和 第一次大于20的当前数 【for + break】
		
		//思路分析
		//1. 循环1-100，求和sum
		//2. sum > 20 时，记录下当前数，然后break
		//3. 在for循环外部，定义变量 n，把当前i 赋给 n
		int sum = 0; //累积和
		
		//注意i 的作用在 for{}
		int n = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;//累积
			if(sum > 20) {
				System.out.println("和>20时候 当前数i=" +1);
				n = 1;
				break;
			}
		}
		
		System.out.println("当前数=" + n);
	}
}