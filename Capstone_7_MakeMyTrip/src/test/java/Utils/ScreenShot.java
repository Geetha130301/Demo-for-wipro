package Utils;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void getScreenShot(String scrShotName, WebDriver driver) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
		String dateTime = sdf.format(date);
		String fileName = scrShotName + "_" + dateTime + ".png";
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\ScreenShot\\" + fileName);

		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
