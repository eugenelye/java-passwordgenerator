package password;

import java.util.Random;
import java.util.Scanner;

public class LaunchPassword {

	public static void main(String[] args) {
		//0-9:&#48-&#57
		//A-Z: &#65-&#90
		//a-z: &#97-&#122
		//special characters: &#33-&#42
		
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int i = 0, random, x;

        
        StringBuffer pw = new StringBuffer();
		
		System.out.println("Please state the length of your password");
		int lengthInput = scan.nextInt(); 
		
		System.out.println("Do you want uppercase characters?");
		char upperCase=scan.next().toLowerCase().charAt(0);
		
		System.out.println("Do you want Lowercase characters?");
		char lowerCase=scan.next().toLowerCase().charAt(0);
		
		System.out.println("Do you want numbers?");
		char numbers=scan.next().toLowerCase().charAt(0);
		
		System.out.println("Do you want special?");
		char symbols=scan.next().toLowerCase().charAt(0);

		
		while(i<lengthInput) {
			
			random = rand.nextInt(4);
			switch (random) {
			case 1: if(upperCase=='y') {
					x=rand.nextInt(96);
					while(x>=60 && x<=90) {
					pw.append((char)(x));
					i++;
					break;
				}
			}break;
			
			case 2: if(lowerCase=='y') {
				x=rand.nextInt(123);
				while(x>=97 && x<=122) {
				pw.append((char)(x));
				i++;
				break;
				}
			}break;
			
			case 3: if(numbers=='y') {
				x=rand.nextInt(58);
				while(x>=48 && x<=57) {
				pw.append((char)(x));
				i++;
				break;
				}
			}break;
			
			case 4: if(numbers=='y') {
				x=rand.nextInt(43);
				while(x>=33 && x<=42) {
				pw.append((char)(x));
				i++;
				break;
				}
			}break;
			}
			
		}

		
		System.out.println(pw);
		
	}

}

