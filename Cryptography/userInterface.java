import java.util.Scanner;
public class userInterface
{
    public void scanMenu()
    {
        Scanner someScanner = new Scanner(System.in); //creates scanner object
        String response = "";
        while (!(response.equals("Q") ||  response.equals("q")))
        {
            System.out.println("Hello, and thank you for choosing Cryptor's Inc, the only manufacturer of high-quality Cryptors.");
            System.out.println("Now, let’s create a Cryptor.");
            System.out.println("What is the keyword?");
            String keyword = someScanner.nextLine();
            System.out.println("How many characters should it shift?");
            int shift = someScanner.nextInt();
            Key key1 = new Key(shift, keyword);
            Cryptor cryptor1 = new Cryptor(key1);
            System.out.println("A Cryptor has been made!");
            System.out.println("Now you can encrypt and decrypt messages.");
            System.out.println();
            System.out.println("Type E to encrypt or D to decrypt:");
        
            boolean isCiphered = false;
            boolean running = true;
            while (running == true) {
                String letter = someScanner.nextLine();
                if(letter.equals("D") || letter.equals("d")) { 
                    isCiphered = true;
                } else if(letter.equals("E") || letter.equals("e")) {
                    isCiphered = false;
                } else {
                    System.out.print("That is not a valid response.");
                }
            }

            if(isCiphered) {
                System.out.println("What is the message you would like to decrypt?");
            } else {
                System.out.println("What is the message you would like to encrypt?");
            }
            String statement = someScanner.nextLine();
            Message message1 = new Message(statement, isCiphered);
            System.out.println();
            System.out.println("PROCESSING");
            System.out.println();
            Message newMessage = cryptor1.cipher(message1);
            String newStatement = newMessage.returnStatement();
            System.out.println("Your new message is: " + newStatement);
            System.out.println("Press Q to quit.");
            response = someScanner.next();
        }
        System.out.println("Bye!");
    }
}