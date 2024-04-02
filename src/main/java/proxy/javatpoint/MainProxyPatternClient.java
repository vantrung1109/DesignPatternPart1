package proxy.javatpoint;

public class MainProxyPatternClient {
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		access.grantInternetAccess();
	}
}