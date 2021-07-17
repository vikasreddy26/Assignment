package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.DriverSetup;
import lib.ExtentReport;
import lib.WebDriverHelper;
import pages.HomePage;

public class NavigationTest extends DriverSetup {
	WebDriverHelper helper;
	ExtentReport report;

	public NavigationTest() {
		helper = new WebDriverHelper();
		report = new ExtentReport();
	}

	@BeforeClass
	public void setExtent() {
		report.setExtent();

	}

	@AfterClass
	public void endReport() {
		report.endReport();
	}

	@Test(priority = 0)
	public void HowToPlayTest() {
		setUp("chrome");
		report.createTest("HowtoPlay Navigation Test");
		report.attachScreenshotToReport("HomePage.png");
		report.logbrokenLinks("Homepage");
		HomePage home = new HomePage(driver);
		Assert.assertEquals(driver.getTitle(), "Rummy777 - Play Rummy Online & win Real Cash 2021");
		home.clickOnAboutRummy();
		report.attachScreenshotToReport("AboutRummy.png");
		report.logbrokenLinks("About Ruumy Page");
		Assert.assertEquals(driver.getTitle(), "About Rummy - Rummy777");
		home.clickOnHowToPlayRummy();
		report.attachScreenshotToReport("HowToPlayRummy.png");
		report.logbrokenLinks("HowToPlayRummypage");
		Assert.assertEquals(driver.getTitle(), "How to Play Rummy - Rummy777");
		tearDown();
	}

	@Test(priority = 1)
	public void PromotionsTest() {
		setUp("chrome");
		report.createTest("Promotions Navigation Test");
		HomePage home = new HomePage(driver);
		home.clickOnAllOffers();
		report.attachScreenshotToReport("AllOffers.png");
		report.logbrokenLinks("All Offers page");
		Assert.assertEquals(driver.getTitle(), "Promotions - Rummy777");
		home.clickOnNoDepositeBonus();
		report.attachScreenshotToReport("NoDepositBonus.png");
		report.logbrokenLinks("No deposit Bonus page");
		Assert.assertEquals(driver.getTitle(), "No Deposit Bonus - Rummy777");
		home.clickOnFirstDepositeBonus();
		report.attachScreenshotToReport("FirstDepositBonus.png");
		report.logbrokenLinks("First deposit Bonus page");
		Assert.assertEquals(driver.getTitle(), "First Deposit Bonus - Rummy777");
		home.clickOnSecAndThirdDepositeBonus();
		report.attachScreenshotToReport("SecondAndThirdDepositBonus.png");
		report.logbrokenLinks("Second and third deposit Bonus page");
		Assert.assertEquals(driver.getTitle(), "2nd & 3rd Deposit Bonus - Rummy777");
		home.clickOnSurpriseOffer();
		report.attachScreenshotToReport("SuepriseOffer.png");
		report.logbrokenLinks("Sueprise offer page");
		Assert.assertEquals(driver.getTitle(), "Surprise Offer (noon) - Rummy777");
		home.clickOnHappyHourOffer();
		report.attachScreenshotToReport("HappyHourOffer.png");
		report.logbrokenLinks("Happy hour offer page");
		Assert.assertEquals(driver.getTitle(), "Happy Hour Offer (dusk) - Rummy777");
		home.clickOnPowerPlayOffer();
		report.attachScreenshotToReport("PowerPlayOffer.png");
		report.logbrokenLinks("Power Play offer page");
		Assert.assertEquals(driver.getTitle(), "Power Play offer (T20 night match) - Rummy777");
		home.clickOnSpecialOffer();
		report.attachScreenshotToReport("SpecialOffer.png");
		report.logbrokenLinks("Special offer page");
		Assert.assertEquals(driver.getTitle(), "Special Offers - Rummy777");
		home.clickOnClubBonus();
		report.attachScreenshotToReport("ClubBonus.png");
		report.logbrokenLinks("Club Bonus page");
		Assert.assertEquals(driver.getTitle(), "Club Bonus At Rummy777 we have custom-made offers for every club.");
		tearDown();
	}

	@Test(priority = 2)
	public void referAndEarnTest() {
		setUp("chrome");
		report.createTest("Refer And Earn Navigation Test");
		HomePage home = new HomePage(driver);
		home.clickOnReferAndEarn();
		report.attachScreenshotToReport("ReferAndEarn.png");
		report.logbrokenLinks("Refer And Earn page");
		Assert.assertEquals(driver.getTitle(), "Refer and Earn - Rummy777");
	}

	@Test(priority = 3)
	public void instantCashBonusTest() {
		setUp("chrome");
		report.createTest("Instant Cash Bonus Navigation Test");
		HomePage home = new HomePage(driver);
		home.clickOnInstantCashBonus();
		report.attachScreenshotToReport("InstantCashBonus.png");
		report.logbrokenLinks("Instant Cash Bonus page");
		Assert.assertEquals(driver.getTitle(), "Instant Cash Bonus - Rummy777");
		tearDown();
	}

	@Test(priority = 4)
	public void depositsAndWithdrawlTest() {
		setUp("chrome");
		report.createTest("Deposit and Withdrawls Navigation Test");
		HomePage home = new HomePage(driver);
		home.clickOnDeposits();
		report.attachScreenshotToReport("Deposits.png");
		report.logbrokenLinks("Deposits page");
		Assert.assertEquals(driver.getTitle(), "Deposits - Rummy777");
		home.clickOnWithDrawls();
		report.attachScreenshotToReport("Withdrawls.png");
		report.logbrokenLinks("Withdrawls page");
		Assert.assertEquals(driver.getTitle(), "Withdrawals - Rummy777");
		tearDown();
	}

}
