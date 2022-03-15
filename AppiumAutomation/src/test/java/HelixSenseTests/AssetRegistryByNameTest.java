package HelixSenseTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import HelixSensePages.AssetRegistryByNamePage;
public class AssetRegistryByNameTest extends HelixSenseTestBase {

	AssetRegistryByNamePage assetRegistryByName;
	
	@Test(dataProvider = "dataProvider")
	public void AssetRegistryByNameTest(String Name)
	{
		assetRegistryByName=new AssetRegistryByNamePage(driver);
		assetRegistryByName.addAssetByName(Name);
		boolean status=assetRegistryByName.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Using SearchAssetByName");
	}
	
}
