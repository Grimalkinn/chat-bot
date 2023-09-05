public class node {
    private float[] weights;
    private float bias;

    public node() {
        weights = new float[3]; // Assuming 3 input weights for simplicity
        bias = 0;
    }

    public double calculateOutput(float[] inputs) {
        double weightedSum = 0;
        for (int i = 0; i < inputs.length; i++) {
            weightedSum += inputs[i] * weights[i];
        }
        weightedSum += bias;
        return weightedSum;
    }
}