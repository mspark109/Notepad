package common;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Random;

public class EncryptionUtil {
	
	public static String getSha256(String plainText) {
		String sha256 = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] bytes = plainText.getBytes(Charset.forName("UTF-8"));
			md.update(bytes);

			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}

			for (int i = 0; i < sb.length(); i++) {
				sha256 += Integer.toHexString(sb.toString().toUpperCase().charAt(i));
			}

			return sha256;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String getRandom(int length, boolean upperYn) {
		StringBuffer sb = new StringBuffer();
		Random rn = new java.security.SecureRandom();
		
		if(upperYn){
			char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
					'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			for (int i = 0; i < length; i++) {
				sb.append(chars[rn.nextInt(chars.length)]);
			}
		}else{
			char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
					'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
					'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
					'z' };
			for (int i = 0; i < length; i++) {
				sb.append(chars[rn.nextInt(chars.length)]);
			}
		}
		return sb.toString();
	}
}
