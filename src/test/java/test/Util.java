package test;

import java.util.Random;

public class Util{

	static final String ab = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static final String num = "0123456789";
	static Random random = new Random();

	String randomString(int len){
	   StringBuilder sb = new StringBuilder(len);
	   for(int i = 0; i < len; i++)
	      sb.append(ab.charAt(random.nextInt(ab.length())));
	   return sb.toString();
	}
	
	String randomStringNumber(int len){
		   StringBuilder sb = new StringBuilder(len);
		   for(int i = 0; i < len; i++)
		      sb.append(num.charAt(random.nextInt(num.length())));
		   return sb.toString();
		}
}
