package insuranceTestcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import insuranceBase.TestBase;
import insurancePages.RequestQuotationPage;

public class RequestQuotationTestcase extends TestBase{
	
	@Test
	@Parameters({"quoteRegister","quoteIncident","quoteAttributeEntry"})
	public void ReqTestQuotation(String quoteRegister, String quoteIncident,String quoteAttributeEntry) throws InterruptedException
	{
				
		RequestQuotationPage quotPage = new RequestQuotationPage(driver);
		quotPage.RequotationPagetabclick();
		quotPage.enterQuotationRegistration(quoteRegister);
		quotPage.enterQuotationincident(quoteIncident);
		quotPage.enterQuotationAttributesentry(quoteAttributeEntry);
		quotPage.saveQuotationbtn();
	}

}
