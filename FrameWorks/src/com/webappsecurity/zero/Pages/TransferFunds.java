package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	@FindBy(id = "tf_fromAccountId")
	private WebElement frmAcc;

	@FindBy(id = "tf_toAccountId")
	private WebElement toAcc;

	@FindBy(id = "tf_amount")
	private WebElement amnt;

	@FindBy(id = "tf_description")
	private WebElement desc;

	@FindBy(id = "btn_submit")
	private WebElement continuebtn;

	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterFundTransferDetails(String amount, String description) {
		Select fromAccDD = new Select(frmAcc);
		fromAccDD.selectByIndex(2);
		Select toAccDD = new Select(toAcc);
		toAccDD.selectByIndex(3);
		amnt.sendKeys(amount);
		desc.sendKeys(description);
		continuebtn.click();

	}

}
