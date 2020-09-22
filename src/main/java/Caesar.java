import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        char ch = ' ';
		String str1 = "";
		for(int i = 0; i < message.length(); i++) {
            if((message.charAt(i)>= 'A' && message.charAt(i)<= 'Z') || (message.charAt(i)>= 'a' && message.charAt(i)<= 'z')){
            ch = (char) (message.charAt(i)+3);
            if (ch>'Z'&&ch<'a'||(ch>'z')) {
            	ch-=26;
            }
			str1 = str1 + ch;			
            }else {           
            str1 = str1 + message.charAt(i);
			}
        }
        return str1;
    }       


    public static String decryptCaesar(String message) {    
    char ch = ' ';
    String str1 = "";
    for(int i = 0; i < message.length(); i++) {
    	if((message.charAt(i)>= 'A' && message.charAt(i)<= 'Z') || (message.charAt(i)>= 'a' && message.charAt(i)<= 'z')){
    		ch = (char) (message.charAt(i)-3);
    		if ((ch<'a'&& ch>'Z')||ch<'A') {
    			ch+=26;
    		}
    		str1 = str1 + ch;			
    	}else {           
    		str1 = str1 + message.charAt(i);
    	}
    }
        return str1;
    }

    public static String encryptCaesarKey(String message, int key) {
        char ch = ' ';
        String str1 = "";
        int k = key%26;
		for(int i = 0; i < message.length(); i++) {
            if((message.charAt(i)>= 'A' && message.charAt(i)<= 'Z') || (message.charAt(i)>= 'a' && message.charAt(i)<= 'z')){
            ch = (char) (message.charAt(i)+k);
            if (ch>'Z'&&ch<'a'||(ch>'z')) {
            	ch-=26;
            }
			str1 = str1 + ch;			
            }else {           
            str1 = str1 + message.charAt(i);
			}
        }
        return str1;
    }

    public static String decryptCaesarKey(String message, int key) {
        char ch = ' ';
        String str1 = "";
        int k = key%26;
		for(int i = 0; i < message.length(); i++) {
            if((message.charAt(i)>= 'A' && message.charAt(i)<= 'Z') || (message.charAt(i)>= 'a' && message.charAt(i)<= 'z')){
            ch = (char) (message.charAt(i)-k);
            if ((ch<'a'&& ch>'Z')||ch<'A') {
            	ch+=26;
            }
			str1 = str1 + ch;			
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
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
