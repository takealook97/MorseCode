public class Output {
    void printInitialOutput() {
        System.out.println("_______________________________________________");
        System.out.println("|          * Morse Code Translator *          |");
        System.out.println("|        This is Morse-Code translator        |");
        System.out.println("|  You can put English, number and Morse-Code |");
        System.out.println("|_____________________________________________|");
    }

    void printInputOrder() {
        System.out.println("Input");
        System.out.print("> ");
    }

    void printText(String[] input){
        Translator translator = new Translator();
        System.out.println("(MorseCode to Text)");
        System.out.println(translator.getMorse2Text(input) + "\n");
    }

    void printMorse(String[] input){
        Translator translator = new Translator();
        System.out.println("(Text to MorseCode)");
        System.out.println(translator.getText2Morse(input) + "\n");
    }
}
