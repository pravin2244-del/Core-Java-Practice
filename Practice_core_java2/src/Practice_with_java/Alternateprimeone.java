package Practice_with_java;

public class Alternateprimeone {

	    public static void main(String[] args) {

	        int num = 1000;
	        int count = 0;

	        for (int i = 2; i < num; i++) {

	            boolean flag = true;

	            for (int j = 2; j * j <= i; j++) {
	                if (i % j == 0) {
	                    flag = false;
	                    break;
	                }
	            }

	            if (flag) {
	                count++;

	                // Print every 2nd prime
	                if (count % 2 == 0) {
	                    System.out.println("Prime Number: " + i);
	                    System.out.println("Count: " + count);
	                }
	            }
	        }
	    }
	}


