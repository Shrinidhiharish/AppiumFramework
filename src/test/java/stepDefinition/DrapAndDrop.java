package stepDefinition;

import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DrapAndDrop {
	AndroidDriver driver;

	@Given("the required desired capabilities")
	public void the_required_desired_capabilities() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator1");
		caps.setCapability("Platform", "Android");
		caps.setCapability("app", "E:\\Eclipse_Projects\\appiumFramework\\original.apk");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}

	@When("the Appium Demo Application is invoked and clicked on views followed by clciking on drag and drop")
	public void the_Appium_Demo_Application_is_invoked_and_clicked_on_views_followed_by_clciking_on_drag_and_drop() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
	}

	@Then("user should be able to darg the circle from source and drop it to the destination")
	public void user_should_be_able_to_darg_the_circle_from_source_and_drop_it_to_the_destination() {
		WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);
		TouchAction drag = new TouchAction(driver);
		// longpress(source)/move(destination)//release
		// t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		drag.longPress(element(source)).moveTo(element(destination)).release().perform();
		driver.quit();
	}

}
