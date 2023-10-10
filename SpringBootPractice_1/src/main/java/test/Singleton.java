package test;

public class Singleton {
	private static Singleton instance;
	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			instance =new Singleton();
//		}
//		return instance;
		return new Singleton();
	}
}
