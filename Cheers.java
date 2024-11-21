// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                String newWord = "";
                int count = Integer.parseInt(args[1]);
                char letter;
                String temp = "AEFHILMNORSX";
                for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                                letter = (char) (word.charAt(i) - 32);
                        } else {
                                letter = word.charAt(i);
                        }
                        newWord += letter;
                        if (temp.indexOf(letter) != -1) {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        }

                }
                System.out.println("what does that spell?");
                for (int i = 0; i < count; i++) {
                        System.out.println(newWord + "!!!");
                }
        }
}
