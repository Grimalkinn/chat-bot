import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class neuralNetwork extends node{
    private List<node> nodes;

    public neuralNetwork() {
        ArrayList<node> nodes = new ArrayList<node>();
    }

    public void addNode(node name) {
        nodes.add(name);
    }

    public float[] forwardPropagation(float[] inputs) {
        float[] outputs = new double[nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            node nodes = node.get(i);
            float output = nodes.calculateOutput(inputs);
            outputs[i] = output;
        }
        return outputs;
    }


    public static void main(String[] args) {
        neuralNetwork network = new neuralNetwork();

        //add 5 nodes
        for (int i = 0; i < 5; i++) {
            node node = new node();
            network.addNode(node);
        }
        Random random = new Random();
        float randFloat = new random.nextFloat();

        float[] inputs = {0.5f, 0.3f, 0.8f};

        float[] outputs = network.forwardPropagation(inputs);
        for (float output : outputs) {
            System.out.println(output);
        }
    }
}

