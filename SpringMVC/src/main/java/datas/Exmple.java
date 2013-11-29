package datas;

public class Exmple {
	private static String name;
	private static int age;
	
	public static void setName(String name){
		Exmple.name = name;
	}
	
	public static void setAge(int age){
		Exmple.age = age;
	}
	
	public static String getName(){
		return name;
	}
	
	public static int getAge(){
		return age;
	}
	
	public static void printName(){
		System.out.println("Your name : "+name);
	}

}
