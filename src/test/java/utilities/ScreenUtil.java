package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenUtil {

    public static void getScreenshot(String scenario) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        Date date = new Date();
        String fileName = sdf.format(date) + "-" + scenario.replace(" ", "-") ;
        File des = ThreadLocalDriver.getTLDriver().getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//screenshots//" + fileName + ".png"));
        System.out.println("Screenshot is captured");
    }

}
