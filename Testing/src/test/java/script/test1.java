package script;

import org.testng.annotations.Test;


import config.StartBrowser;
import custcmd.ActionDriver;
import or.Hublogin;
import or.Hublogout;

public class test1 extends StartBrowser
{
	
  @Test
  public void testlogin_out() throws Exception
  {
	  ActionDriver aDriver= new ActionDriver();
	  aDriver.launchApplication("http://shopmytools.com/#!/");
	  Thread.sleep(5000);	 
	  aDriver.click(Hublogin.lnkHublogin);
	  aDriver.multiwindows();
	  aDriver.type(Hublogin.txtloginname, "9866218421");
	  aDriver.type(Hublogin.txtpass, "Sivaram1$");
	  aDriver.click(Hublogin.butlogin);
	  Thread.sleep(3000);	
	  //aDriver.multiplefrane(0);
	 // aDriver.click(Hublogout.butArrow);
	  aDriver.click(Hublogout.butarrow);
	  Thread.sleep(2000);	
	  aDriver.click(Hublogout.arroedwn);
	  //aDriver.dropdown();
	  aDriver.click(Hublogout.butLogout);
	  Thread.sleep(1000);
	  aDriver.alert();
	  Thread.sleep(1000);
  }
}
