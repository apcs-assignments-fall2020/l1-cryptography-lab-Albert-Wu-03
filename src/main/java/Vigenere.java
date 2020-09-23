import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        		char ch1=' ';
		String str1 = "";
		int i1 = 0 ;
		for(int i = 0; i < message.length(); i++) {
			int ch  = key.charAt(i1%3);
            if(key.charAt(i1%3)<='Z' && key.charAt(i1%3)>='A'){
                ch = key.charAt(i1%3)-65;
            }
            if(key.charAt(i1%3)<='z' && key.charAt(i1%3)>='a'){
                ch = key.charAt(i1%3)-97;
            }
            if((message.charAt(i)>= 'A' && message.charAt(i)<= 'Z') || (message.charAt(i)>= 'a' && message.charAt(i)<= 'z')){
            	ch1 = (char) (message.charAt(i)+ch);
            	if (ch1>'Z'&&ch<'a'||(ch>'z')) {
            		ch1-=26;
            	}
            	str1 = str1 + ch1;	
            	i1++;		
            }else {           
           		str1 = str1 + message.charAt(i);
            }        
            }
            return str1;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }

    public static char[] decryptVigenere(String message, String key) {
        return null;
    }
}
