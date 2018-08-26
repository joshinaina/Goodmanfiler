package goodman;


	import static org.monte.media.FormatKeys.EncodingKey;
	import static org.monte.media.FormatKeys.FrameRateKey;
	import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
	import static org.monte.media.FormatKeys.MIME_AVI; 
	import static org.monte.media.FormatKeys.MediaTypeKey;
	import static org.monte.media.FormatKeys.MimeTypeKey;
	import static org.monte.media.VideoFormatKeys.CompressorNameKey;
	import static org.monte.media.VideoFormatKeys.DepthKey;
	import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
	import static org.monte.media.VideoFormatKeys.QualityKey;

	import java.awt.AWTException;
	import java.awt.GraphicsConfiguration;
	import java.awt.GraphicsEnvironment;
	import java.awt.Robot;
	import java.io.File;
	import java.io.IOException;

	//import org.apache.commons.io.FileUtils;
	import org.monte.media.Format;
	import org.monte.media.FormatKeys.MediaType;
	import org.monte.media.math.Rational;
	import org.monte.screenrecorder.ScreenRecorder;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class Screenshot
	{
	    public WebDriver driver;
	    public ScreenRecorder screenRecorder;

	        public void startRecording() throws IOException, AWTException 
	        {
	                  GraphicsConfiguration gc = GraphicsEnvironment
	                    .getLocalGraphicsEnvironment()
	                    .getDefaultScreenDevice()
	                    .getDefaultConfiguration();
	                    this.screenRecorder = new ScreenRecorder(gc,
	                    new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	                    CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	                    DepthKey, 24, FrameRateKey, Rational.valueOf(15),
	                    QualityKey, 1.0f,
	                    KeyFrameIntervalKey, 15 * 60),
	                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
	                    FrameRateKey, Rational.valueOf(30)),
	                    null);
	                    this.screenRecorder.start();
	        }
	        public void stopRecording() throws Exception
	        {
	        this.screenRecorder.stop();
	        }

	 @Test
	 public void TestJavaS1() throws Exception
	   {
	             Screenshot  video=new Screenshot();
	             video.startRecording();
	            System.setProperty("webdriver.chrome.driver","C:\\Users\\LittleMonkey\\Desktop\\software\\chromedriver_win32 (5)\\chromedriver.exe");
	            driver = new ChromeDriver();
	             // Maximize the window
	                driver.manage().window().maximize();
	        
	              // Pass the url
	                 driver.get("http://bakerybasket.littlemonkey.info/");
	                 
	                 
	                 
	                 video.stopRecording(); //Stopped recording

	          
	   }
	}


