

import java.util.Map;

import com.google.common.collect.Maps;
import com.using.common.core.http.httpclient.SimpleHttpUtils;

public class TestWuliu {

	public static void main(String[] args) {
		
//		String url = "https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?cb=jQuery1102011654479686924835_1546841751274&appid=4001&com=tiantian&nu=669535742187&vcode=&token=&_=" + System.currentTimeMillis();
		String url = "https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?appid=4001&com=tiantian&nu=669535742187&vcode=&token=&_=" + System.currentTimeMillis();
		Map<String,Object> headers = Maps.newHashMap();
//		headers.put("Host", "sp0.baidu.com");
		String responseBody = SimpleHttpUtils.httpRequest(url, null, "POST", "utf-8", headers);
		System.err.println(responseBody);
	}
}
