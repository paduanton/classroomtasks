package br.edu.ifsul.sapucaia.repeticao;
public class Q24_DOWHILE {
	public static void main(String[] args) {
		short h = 10;
		
		System.out.println("10 at� 150\nM�ltiplos de 3 e 7...");
		do {
			h++;
			if(h % 3 == 0 && h % 7 == 0) {
				System.out.println(h);;
			}
		} while(h < 150);
	}
}