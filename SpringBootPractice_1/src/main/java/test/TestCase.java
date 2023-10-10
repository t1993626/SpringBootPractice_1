package test;

import org.junit.Assert;
import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Singleton instance_A =Singleton.getInstance();
		Singleton instance_B =Singleton.getInstance();
		Assert.assertNotNull(instance_A);
		Assert.assertNotNull(instance_B);
		Assert.assertTrue(instance_A == instance_B);
	}
	public static void main(String[] args) {
		TestCase t = new TestCase();
		t.test();
	}
}
