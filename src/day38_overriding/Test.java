package day38_overriding;

public class Test {
	
	int x,y;
	
	public Test(int x,int y) {
		initailize(x,y);
		
	}
	
	public void initailize(int x,int y) {
		this.x=x*x;
		this.y=y*y;
	}
	

	public static void main(String[] args) {
		int x=3,y=5;
		Test obj=new Test(x,y);
		System.out.println(obj.x+" "+obj.y);
		

	}

}
