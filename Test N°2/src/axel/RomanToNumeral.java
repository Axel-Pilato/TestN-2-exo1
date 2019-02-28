package axel;

public class RomanToNumeral {

	public int getNumeral(String nbrRom) {
		int num = 0;
		int i = 0;
		char lettre;
		
		while(i!=nbrRom.length()) {
			lettre = nbrRom.charAt(i);  // Stocke un caractere de la string 
			
			if(lettre == 'I') {
				System.out.println("I");
				num = num +1;
				i++;
			}
			else if (lettre == 'V') {
				System.out.println("V");
				num = num+5;
				i++;
			}
			else if (lettre == 'X') {
				System.out.println("X");
				num = num+10;
				i++;
			}
			else if (lettre == 'L') {
				System.out.println("L");
				num = num+50;
				i++;
			}
			else if (lettre == 'C') {
				System.out.println("C");
				num = num+100;
				i++;
			}
			else if (lettre == 'D') {
				System.out.println("D");
				num = num+500;
				i++;
			}
			else if (lettre == 'M') {
				System.out.println("M");
				num = num+1000;
				i++;
			}
			else System.out.println("erreur caractere");
		}
		return num;
	}

}
