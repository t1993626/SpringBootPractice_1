package test;

public class demo {
	public static void main(String[] args) {
		Processor p = new MathProcessor();
		p.process(2,3);
		p.process(new Object[] {2,3});
		p.process(new int[] {2,3});
		String a ="insure";
		String b =new String("insure");
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
	}
}
