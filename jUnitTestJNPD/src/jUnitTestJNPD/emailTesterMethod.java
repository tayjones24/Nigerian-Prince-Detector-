package jUnitTestJNPD;

public class emailTesterMethod {
	String email;
	char a;
	int count =0;
	public static boolean isRealEmail(String email) { 
		for(int i=0;i<email.length(;i++)) {
			a = email.CharAt(i);
			if(a ='@') {
				count++;
			}
			if(count>1) {
				return false;
			}
		}
		if(email.contains("@")) {
			if(email.contains(".com") || email.contains(".edu")|| email.contains(".org")|| email.contains(".net")){
				int end = email.length()-4;
				String ending = email.substring(end);
				if(ending.contains(".com")||ending.contains(".edu")||ending.contains(".org")||ending.contains(".net")) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return false;
		
	}
	
}
