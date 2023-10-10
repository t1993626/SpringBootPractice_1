package test;

import java.util.Arrays;

public class Processor {
	public Processor() {
		System.out.println("Creatint Processor");
	}

	public void process(int i , int j) {
		System.out.printf("Processor two Integer : %d,%d",i,j);
	}
	public void process(int[] ints) {
		System.out.println("Adding Integer Arrays:"+Arrays.toString(ints));
	}
	public void process(Object[] objs) {
		System.out.println("Adding Object Arrays:"+Arrays.toString(objs));
	}
	
	
	
}

class MathProcessor extends Processor {

	public MathProcessor() {
		super();
		System.out.println("Creatint MathProcessor");
	}
	@Override
	public void process(int i , int j) {
		System.out.println("Sum two Integer :"+(i+j));
	}
	@Override
	public void process(int[] ints) {
		int sum=0;
		for(int i :ints) {
			sum+=i;
		}
		System.out.println("Sum of  Integer Arrays:"+sum);
	}

}