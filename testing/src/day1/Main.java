package day1;

public class Main {
 int num=16;
	boolean isPerfect=false;
	for(int i=1;i<=num/2;i++) {
		if(i*i==num) {
			isPerfect=true;
			break;
		}
	}
	if (isPerfect) {
		System.out.println("Yes it is Perfect no");
	} else {
System.out.println("It is not Perfect no");
	}
}
