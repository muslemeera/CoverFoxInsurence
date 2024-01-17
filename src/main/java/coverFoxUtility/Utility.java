package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility {
	
		public static String readDataFromExcel(int row,int cell) throws IOException
		{
		Reporter.log("Reading data from excelSheet", true);

		FileInputStream myfile= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\CoverFox.xlsx");

		 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

		String data = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
		}
		public static void takeScreenShot(WebDriver driver,String TCID) throws IOException
		{
		Reporter.log("Taking screenshot", true);
		String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\My Screenshot pic\\coverFox"+TCID+"_"+timeStamp+".png");
		Reporter.log("Saved screenshot at "+dest, true);
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		}
		
	}
