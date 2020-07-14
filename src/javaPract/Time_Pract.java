package javaPract;

import java.time.LocalTime;

public class Time_Pract {
public static void main(String[] args) {
	
	LocalTime MyTime = LocalTime.now();
	
	System.out.println(MyTime);
	
	String Temp1 =MyTime.toString();
	
	System.out.println(Temp1);
	
	String Final_RES = Temp1.replace(":", "").replace(".", "").trim();
	
	System.out.println(Final_RES);
}
}
