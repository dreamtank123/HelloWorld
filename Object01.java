
public class Object01 {
	
	// 编写一个main方法
	public static void main(String[] args) {
		
		/*
		张老太养了两只猫猫：一只名字叫小白，今年3岁，白色。
		还有一只叫小花，今年100岁，花色。请编写一个程序，当用户输入小猫的名字时，
		就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
		则显示 张老太没有这只猫猫。
		 */
		//使用OOP面向对象解决
		//实例化一只猫[创建一只猫对象]
		//解读
		//1.new Cat() 创建一只猫
		//2.Cat cat1 = new Cat(); 把创建的猫赋给 cat1
		//3.cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		//创建第二只猫，并赋给 cat2
		//cat2 也是一个对象（猫对象）
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		
		//怎么访问对象的属性呢
		System.out.println("第1只猫信息" + cat1.name
				+ " " + cat1.age + " " + cat1.color);
		System.out.println("第2只猫信息" + cat2.name
				+ " " + cat2.age + " " + cat2.color);
		
	}
}	
	
//使用面向对象的方式来解决养猫问题

//定义一个猫类 Cat ->自定义的数据类型
class Cat {
	//属性
	String name;//名字
	int age;//年龄
	String color;//颜色
	
	

	
}
