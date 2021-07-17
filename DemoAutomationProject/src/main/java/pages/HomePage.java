package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.DriverSetup;
import lib.WebDriverHelper;

public class HomePage {
	@FindBy(xpath = "//a[text() = 'How to Play']")
	private WebElement howToPlay;
	@FindBy(xpath = "//li[@id ='mega-menu-item-1612']//a[text() = 'About Rummy']")
	private WebElement aboutRummy;
	@FindBy(xpath = "//a[text() = 'How to Play Rummy']")
	private WebElement howToPlayRummy;
	@FindBy(xpath = "//a[text() = 'Promotions']")
	private WebElement promotions;
	@FindBy(xpath = "//a[text() = 'All Offers']")
	private WebElement allOffers;
	@FindBy(xpath = "//a[text() = 'Welcome Package']")
	private WebElement welcomePacakge;
	@FindBy(xpath = "//a[text() = 'No Deposit Bonus']")
	private WebElement noDepositBonus;
	@FindBy(xpath = "//a[text() = 'First Deposit Bonus']")
	private WebElement firstDepositBonus;
	@FindBy(xpath = "//a[text() = '2nd & 3rd Deposit Bonus']")
	private WebElement secondAndThirdDepositBonus;
	@FindBy(xpath = "//a[text() = 'Daily Offers']")
	private WebElement dailyOffers;
	@FindBy(xpath = "//a[text() = 'Surprise Offer (noon)']")
	private WebElement surpriseOffer;
	@FindBy(xpath = "//a[text() = 'Happy Hour Offer (dusk)']")
	private WebElement happyHourOffer;
	@FindBy(xpath = "//a[text() = 'Power Play offer (T20 night match)']")
	private WebElement powerPlayOffer;
	@FindBy(xpath = "//a[text() = 'Special Offers']")
	private WebElement specialOffers;
	@FindBy(xpath = "//a[text() = 'Club Bonus']")
	private WebElement clubBonus;
	@FindBy(xpath = "//a[text() = 'Refer and Earn']")
	private WebElement referAndEarn;
	@FindBy(xpath = "//a[text() = 'Loyalty Program']")
	private WebElement loyaltyProgram;
	@FindBy(xpath = "//a[text() = 'Instant Cash Bonus']")
	private WebElement instantCashBonus;
	@FindBy(xpath = "//a[text() = 'Deposits & Withdrawals']")
	private WebElement depositsAndWithdrawals;
	@FindBy(xpath = "//a[text() = 'Deposits']")
	private WebElement deposits;
	@FindBy(xpath = "//a[text() = 'Withdrawals']")
	private WebElement withdrawals;

	WebDriverHelper helper;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		helper = new WebDriverHelper();
	}


	public void clickOnHowToPlay() {
		try {
			helper.waitForElementVisible(howToPlay);
			howToPlay.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnAboutRummy() {
		try {
		clickOnHowToPlay();
		helper.waitForElementClickable(aboutRummy);
		aboutRummy.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnHowToPlayRummy() {
		try {
			clickOnHowToPlay();
			helper.waitForElementClickable(howToPlayRummy);
			howToPlayRummy.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnPromotions() {
		try {
			helper.waitForElementVisible(promotions);
			promotions.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnAllOffers() {
		try {
			clickOnPromotions();
		    helper.waitForElementVisible(allOffers);
			allOffers.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnWelcomePackage() {
		try {
			welcomePacakge.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnNoDepositeBonus() {
		try {
			clickOnPromotions();
			clickOnWelcomePackage();
			noDepositBonus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnFirstDepositeBonus() {
		try {
			clickOnPromotions();
			clickOnWelcomePackage();
			firstDepositBonus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnSecAndThirdDepositeBonus() {
		try {
			clickOnPromotions();
			clickOnWelcomePackage();
			secondAndThirdDepositBonus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDailyOffers() {
		try {
			dailyOffers.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnSurpriseOffer() {
		try {
			clickOnPromotions();
			clickOnDailyOffers();
		    surpriseOffer.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnHappyHourOffer() {
		try {
			clickOnPromotions();
			clickOnDailyOffers();
			happyHourOffer.click();	  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnPowerPlayOffer() {
		try {
			clickOnPromotions();
			clickOnDailyOffers();
			powerPlayOffer.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnSpecialOffer() {
		try {
		clickOnPromotions();
		specialOffers.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnClubBonus() {
		try {
			clickOnPromotions();
			clubBonus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnReferAndEarn() {
		try {
			referAndEarn.click();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnLoyaltyProgram() {
		try {
			loyaltyProgram.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnInstantCashBonus() {
		try {
		instantCashBonus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDepositeAndWithdrawl() {
		try {
			depositsAndWithdrawals.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnDeposits() {
		try {
			clickOnDepositeAndWithdrawl();
			helper.waitForElementVisible(deposits);
			deposits.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnWithDrawls() {
		try {
			clickOnDepositeAndWithdrawl();
			withdrawals.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
