import java.util.Scanner;

public class debug {

    //print method
    public static void print (String data) { System.out.println(data);}
    
    //input method
    public static String input (String msg) {
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        return in;
    }
    
    //main method
    public static void main (String[] args) {
    String paragraph = "";
    
    //https://go.codetogether.com/#/92a8f11a-0d50-4ba7-b45a-2bf62c8fc9d9/i3KYxRB94EAXzLtPPTQChM
    
    try {
        while (true) {
            String userInput = input("[Me] : ");

            if (userInput.equals("exit")) {break;}
            else {
                inputLayer prompt = new inputLayer();
                
                neuralNetwork data = new neuralNetwork();
                //data.getOutput();

                outputLayer response = new outputLayer();
                
                //testing
                paragraph += (userInput + " "); 
                //paragraph = userInput;
                print("[AI] : " + paragraph); 
            }
        }
    } catch (Exception ex) {print(String.valueOf(ex));}
  }
}

//process user input with opennlc
//class handleInput {}

//thinking here...
//class neuralNetwork {}

//process output with idk what
//class handleOutput {}

