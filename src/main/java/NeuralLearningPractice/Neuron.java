package NeuralLearningPractice;

public class Neuron {

    public static void main(String[] args) {

        double[] inputs = {1, 2, 3, 4, 5};

        double[] expectedValues = {2, 4, 6, 8, 10};

        double weight = 0;

        double learningRate = 0.1;

        double errorLimit = 0.0001;

        boolean tanulasBefejezve = false;

        for (int epoch = 0; epoch < 1000 && !tanulasBefejezve; epoch++) {

            for (int i = 0; i < inputs.length && !tanulasBefejezve; i++) {

                double input = inputs[i];

                double expected = expectedValues[i];

                double prediction = input * weight;

                double error = expected - prediction;

                weight = weight + learningRate * error * input;

                System.out.println(
                        "Kör: " + epoch +
                                " | Példa: " + i +
                                " | Bemenet: " + input +
                                " | Elvárt: " + expected +
                                " | Jóslat: " + prediction +
                                " | Hiba: " + error +
                                " | Súly: " + weight
                );

                if (Math.abs(error) < errorLimit) {

                    tanulasBefejezve = true;

                    System.out.println("A tanulás befejeződött.");
                    System.out.println("Tanulási körök száma: " + (epoch + 1));


                }
            }
        }
    }
}