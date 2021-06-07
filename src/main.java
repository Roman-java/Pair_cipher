import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	StringBuilder str1 = new StringBuilder();
	StringBuilder str2 = new StringBuilder();
	
	System.out.println("Введіть фразу яку шифруємо:");
	String str = in.nextLine();
	System.out.println("Фраза яку шифруємо:");
	System.out.println(str);
	
	System.out.println("Фраза-ключ:");
	String key = "пономаренко роман русланович 0123456";
	System.out.println(key);
	
	System.out.println("Весь алфавіт та символи:");
	String alf = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя 0123456789";
	System.out.println(alf);
	
	for(char j : alf.toCharArray()) {
		if(key.indexOf(j) == -1)
			str2.append(j);
		else
			str1.append(j); }
	
	System.out.println("Перша частина пар:");
	String str_1 = str1.toString();
	System.out.println(str_1);
	
	System.out.println("Друга частина пар:");
	String str_2 = str2.toString();
	System.out.println(str_2);
	
	char[] buf_enc = new char[22];
	buf_enc = str.toCharArray();
	char[] buf_1 = new char[22];
	buf_1 = str_1.toCharArray();
	char[] buf_2 = new char[22];
	buf_2 = str_2.toCharArray();
	char[] buf_dec = new char[buf_enc.length];
	
	for(int m = 0; m < str.length(); m++)
		for(int l = 0; l < str_1.length(); l++)
			if (buf_enc[m] == buf_1[l])
				buf_enc[m] = buf_2[l];
			else if (buf_enc[m] == buf_2[l])
				buf_enc[m] = buf_1[l];
	System.out.println("Зашифрована фраза:");
	System.out.println(buf_enc);
	
	for(int m = 0; m < str.length(); m++)
		for(int l = 0; l < str_1.length(); l++)
			if (buf_enc[m] == buf_1[l])
				buf_dec[m] = buf_2[l];
			else if (buf_enc[m] == buf_2[l])
				buf_dec[m] = buf_1[l];
	System.out.println("Розшифрована фраза:");
	System.out.println(buf_dec);
	}
}