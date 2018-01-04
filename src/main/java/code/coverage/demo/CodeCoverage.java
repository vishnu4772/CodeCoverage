package code.coverage.demo;

public class CodeCoverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		start();
	}
public static String start(){
	int i=10;
	if (i == 1)
	{
		System.out.println("1");
		
	}
	System.out.println("start");
	return "start";
}
public static String stop(){
	System.out.println("stop");
	return "stop";
}
}
