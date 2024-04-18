package Annotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AnnotationTest {
@BeforeSuite
public void main() {
	System.out.println("connection db");
}
@Test
public void main1() {
	System.out.println("test script running");
}
@BeforeMethod
public void main2() {
	System.out.println("method 1");
}
@BeforeMethod
public void main3() {
	System.out.println("method 2");
}
@AfterMethod
public void main4() {
	System.out.println("exit method");
}
@BeforeClass
public void main5() {
	System.out.println("befor class");
}
@Test
public void main6() {
	System.out.println("script 2");
}
@BeforeClass
public void main7() {
	System.out.println("before class2");
}
}
