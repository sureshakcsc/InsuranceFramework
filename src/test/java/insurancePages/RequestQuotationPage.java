package insurancePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestQuotationPage {
	
	WebDriver driver;
	
    public RequestQuotationPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
          	
    }
    @FindBy(xpath="//li[@id='newquote']")
    WebElement ReqQuotationtab;

    @FindBy(id="quotation_incidents")
    WebElement enterIncident;
    
    @FindBy(id="quotation_vehicle_attributes_registration")
    WebElement quotationRegistration;
    
    @FindBy(id="quotation_vehicle_attributes_mileage")
    WebElement quotationattributesmileageentry;
    
    @FindBy(xpath="//input[@value='Save Quotation']")
    WebElement saveQuationbtn;

     public void RequotationPagetabclick() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 ReqQuotationtab.click();
     }

     
     public void enterQuotationincident(String quoteIncident)
     {
    	 enterIncident.sendKeys(quoteIncident);
     }
     
     public void enterQuotationRegistration(String quoteRegister)
     {
    	 quotationRegistration.sendKeys(quoteRegister);
     }
     
     public void enterQuotationAttributesentry(String quoteIncident)
     {
    	 quotationattributesmileageentry.sendKeys(quoteIncident);
     }
     
     public void saveQuotationbtn()
     {
    	 saveQuationbtn.click();     }
     }
