package java_basic.trainning1;

public class Singleton {
	private static Singleton singleton;
	private int num;
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
