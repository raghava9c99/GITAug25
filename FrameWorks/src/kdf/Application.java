package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

	@Test
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData(
				"C:\\Users\\ragha\\OneDrive\\Desktop\\Academics\\Quality Assurance\\Selenium\\TestData.xlsx", "Sheet2");
	Methods mtd = new Methods();
		for(int i=1;i<data.length;i++) {
		switch(data[i][3]) {
		case"openBroswer":
			mtd.openBroswer();
			break;
		case"maxBroswer":
			mtd.maximizeBroswerWindow();
			break;
		case"impwait":
			mtd.implementImplicitWait();
			break;
		case"navigateToApp":
			mtd.navigateToAUT(data[i][6]);
			break;
		case "enterUserID":
			mtd.enterUserId(data[i][5], data[i][6]);
			break;
		case "enterpassword":
			mtd.enterPassword(data[i][5], data[i][6]);
			break;
		case "clickLogin":
			mtd.clickButton(data[i][4], data[i][5]);
			break;
		case "verifyErrMsg":
			String actualMsg = mtd.getErrorMessage(data[i][4], data[i][5]);
			Assert.assertEquals(actualMsg, data[i][6]);
			break;
		case "closeApp":
			mtd.closeApplication();
			break;

		}
	}
	}
}
