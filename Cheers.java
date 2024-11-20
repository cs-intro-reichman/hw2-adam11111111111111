// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int count = Integer.parseInt(args[1]);
                char letter;
                String temp = "AEFHILMNORSX";
                word = word.toUpperCase();
                for (int i = 0; i < word.length(); i++) {
                        letter = word.charAt(i);
                        if (temp.indexOf(letter) != -1) {
                                System.out.println("Give me an " + letter + ":  " + letter + "!");
                        } else {
                                System.out.println("Give me a  " + letter + ":  " + letter + "!");
                        }

                }
                System.out.println("what does that spell?");
                for (int i = 0; i < count; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
