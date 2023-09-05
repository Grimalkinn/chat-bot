import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.tokenize.Tokenizer;

public class inputLayer {
    public static void main(String[] args) {
        String text = "Natural language processing is fascinating.";

        Tokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer.tokenize(text);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
