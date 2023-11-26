package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static Boolean isEmpty(String input) {
		if (input == null) {
			return true;
		}
		return input.equals("");
	}

	public static Boolean isEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null) {
			return false;
		}
		return pat.matcher(email).matches();
	}

	public static boolean isNumber(String num) {
		boolean result = true;
		if (num == null)
			return false;
		try {
			long k = Long.parseLong(num);
			if (k < 0) {
				result = false;
			}
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;
	}
	
	public static boolean isValidMobileNo(String str) {
        // Biểu thức chính quy: (0|91)?[7-9][0-9]{9}
        Pattern ptrn = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher match = ptrn.matcher(str);
        return match.matches(); // Sử dụng match.matches() thay vì so sánh với str
	}
}