package DataProviderConcept;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import com_Tyss_Fiducia_GenericUtility.IPathConstant;
public class DataProviderMain {
@DataProvider
public Object[][] dataLogingExcel() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("generate_bill_admin");
int rowCount= s.getLastRowNum()+1;
int cellCount=s.getRow(0).getLastCellNum();
Object[][]obj=new Object[rowCount][cellCount];
for(int i=0;i<rowCount;i++) {
	for(int j=0;j<cellCount;j++) {
		obj[i][j]=s.getRow(i).getCell(j).getStringCellValue();
	}
}
return obj;
}
}