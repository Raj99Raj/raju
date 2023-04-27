package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public static String getScreenshot(WebDriver driver, String filename)throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis();
		File dst = new File(path);
		try
		{
			FileUtils.copyFile(src, dst);
		}catch (IOException e)
		{
			System.out.println("capture failed"+e.getMessage());
		}
		return path;
	}
}
