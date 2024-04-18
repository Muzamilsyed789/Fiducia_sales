package DataProviderConcept;
import org.testng.annotations.Test;
public class LoginUsingDataProvider {
	@Test(dataProviderClass =DataProviderMain.class,dataProvider= "dataLogingExcel")
	public void dataProvider1(String username,String password,String opt) {

		System.out.println(username+"----->"+ password+"------>"+ opt);
	}
}
