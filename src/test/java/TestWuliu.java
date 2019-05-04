

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.google.common.collect.Maps;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.geocoding.PhoneNumberOfflineGeocoder;
import com.using.common.core.http.httpclient.SimpleHttpUtils;

public class TestWuliu {

	public static void main(String[] args) {
		
//		String url = "https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?cb=jQuery1102011654479686924835_1546841751274&appid=4001&com=tiantian&nu=669535742187&vcode=&token=&_=" + System.currentTimeMillis();
//		String url = "https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?appid=4001&com=tiantian&nu=669535742187&vcode=&token=&_=" + System.currentTimeMillis();
//		Map<String,Object> headers = Maps.newHashMap();
//		headers.put("Host", "sp0.baidu.com");
//		String responseBody = SimpleHttpUtils.httpRequest(url, null, "POST", "utf-8", headers);
//		System.err.println(responseBody);
		
//		PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
//		PhoneNumber phoneNumber = null;
//		try {
//			phoneNumber = phoneNumberUtil.parse("437062689", "AU");
//		} catch (NumberParseException e) {
//			e.printStackTrace();
//		}
//		boolean validNumber = phoneNumberUtil.isValidNumber(phoneNumber);
//		System.out.println(validNumber);
//		System.out.println(PhoneNumberOfflineGeocoder.getInstance().getDescriptionForNumber(phoneNumber, Locale.CHINA));
		
//		String responseBody = SimpleHttpUtils.httpGet("http://apilayer.net/api/validate?access_key=97b236905f3180178f91ca331b39b490&number=0411803850&country_code=AU", new HashMap<String, String>());
//		System.out.println(responseBody);
		
		Map<String, String> requestParams = Maps.newHashMap();
		requestParams.put("mobilephone", "0411803850");
		requestParams.put("geo", "AU");
		requestParams.put("address", "31 Rhys Ave");
		requestParams.put("suburb", "The Caves");
		requestParams.put("state", "QLD");
		requestParams.put("postcode", "4702");
		requestParams.put("fd", "au_kobi_homeowner");
		String result = SimpleHttpUtils.httpPost("https://api.previewleadgen.com/api/lead/validate/address", requestParams);
		System.out.println(result);
		
	}
}
