package webadv.s99201105.p02;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
		
		String line = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
		if((sha256hex(args[0])).equals(line)){
			System.out.println("17201215-楼畅 登录成功");
		}else{
			System.out.println("17201215-楼畅 登录失败");
		}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
