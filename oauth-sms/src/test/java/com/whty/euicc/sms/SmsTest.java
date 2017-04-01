package com.whty.euicc.sms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.whty.euicc.cipher.DesMac;
import com.whty.euicc.sms.exception.SMSException;



public class SmsTest {
	static String eid = "89001012012341234012345678901224";
	static String triggerParameterforhttp ="813F833D86070000A50300001E89328A0A3137322E39362E302E318B0A303132333435363738398C182F7365727665722F61646D696E6167656E743F636D643D31";
	static String por4 = "027100002412012345DC5F01485E5016DC868F9C83B995DE63D91B0646AC23C91EB1A2CF2C5450F719";
	static String por5 = "02710000161201234500000000010E005154E83B5B00B879029000";
	static String spiString="1201";
	static String kicString="12";
	static String kidString="12";
	static String tarString="000001";
	static String cntrString="0000000004";
	static String respData = "02700000571502001212000000000000000200D0D72062F0C9063C813F833D86070000A50300001E89328A0A3137322E39362E302E318B0A303132333435363738398C182F7365727665722F61646D696E6167656E743F636D643D31";
	static String respData1 ="02700000581516391212B002028CE216AF9764800C0EA241D64D39E2A242C4146A2F0726DF352C756F7544E62FDF3CA271C19EEB67E4C968BAF43D1ADEC5407018A625B328E1CDECB7EEB45BDF5A74F1422D59B2663EBB9F2CC1E2F517";
	static String respdata2 = "02700000580D04001212000000C65EF5A02E7E9FBFD504AE58BC77A2D5E9655369AABE34C67D6116A15DEF1C26098DB1851AEA8419F6D4F7284FBAC852CFB8EAB86900F6ACCAB47B6A5AEA766A7F6F95C35EDAF8CF44A81F70B56EA973";	
	static String triggerString ="813F833D86070001A50300001E89328A0A3137322E39362E302E318B0A303132333435363738398C182F7365727665722F61646D696E6167656E743F636D643D31";	
	static String trggerDatav= "813F833D86070000A50300001E89328A0A3137322E39362E302E318B0A303132333435363738398C182F7365727665722F61646D696E6167656E743F636D643D31";
	static String dataS = "00000000010600D796A4B80EB7622A029000";
	static String iiiString  = "811A831886070000A50300001E890D8A0B31302E382E34302E313430";
	static String str_in = "027000006815160112120000016BC0E3F59317A50FDA2B21CD6390AE9E739FB8C5E63483454C1375A751694636293C01EEB80C4C54FEACD6E3DA49CB421DC3EED36B666EAB17708C21636C623877149D1EB448CA7FD1984FB41231EEE520FDE4890478C7919DB0F87516B93507";
	
	
	@Test
	public void parseSubmitResp() throws SMSException{
//		String dataString = "02710000140A0000013E6E106493CBC3C1ED1582243F32D4A6";
		String dataString = "027100003c12CA01015C329019590F27E2BDD43C5BC2C9ACF87F08A016397C28477FFE51D2B5456833741DEFC7E984CB0815AF7CD3B9DF3414C35CF33E92A3B011";
		String kicKey = "D9BE655005BEB775324D53DEA699F13A";
		String kidKey = "52DABF691AFD0E2B540CA6A09DEE3BF9";
		Sms sms = new Sms();
		String res = sms.parseSubmitResp(dataString,"0639",kicKey,kidKey);
		System.out.println(res);
	}
	
	@Test
	public void parseSubmitSms() throws SMSException{
//		String dataString = "02710000140A0000013E6E106493CBC3C1ED1582243F32D4A6";
		String dataString = "02700000321502390005CA01010000000000006C53D4B4A46EF1CF811A831886070000A50300001E890D8A0B31302E382E34302E313430";
		Sms sms = new Sms();
		String res = sms.parseSubmitSms(dataString);
		System.out.println(res);
	}
	
	@Test
	public void smsctSim() throws Exception {
		String spi = "0630";
		String kic = "25";
		String kid = "25";
		String tarString = "CA0101";
		String counter = "0000000000";
		String kicKey = "D9BE655005BEB775324D53DEA699F13A";
		String kidKey = "D9BE655005BEB775324D53DEA699F13A";
		String dataStr = "58084661ad28c847142b";
		Map<String, String> map = new HashMap<String, String>();
//		map.put("ctSpi", spi);
//		map.put("ctKic", kic);
//		map.put("ctKid", kid);
//		map.put("ctTar", tarString);
		map.put("ctCntr", counter);
		map.put("ctKicKey", kicKey);
		map.put("ctKidKey", kidKey);
		
		
		List<String> res = new Sms().sendSmsForCTSim(dataStr,map);
		for (String s : res) {
			System.out.println(s);
		}
	}
	
	@Test
	public void smsPpTest() throws Exception{
		boolean s = true;
		if (!s) {
			System.out.println("not true:" + s);
		}
	}
	
	
	@Test
	public void desTest1()throws Exception{
		String receiptString = "86B3308FFAEE177BF925130D89DE2611";
		String A6 = "A615900203099501108001808101108201018301209100";
		String rew = DesMac.threeDesMac(A6,receiptString,0);
		System.out.println(rew);
		
	}
	

	

	
		
}

	
	

	
