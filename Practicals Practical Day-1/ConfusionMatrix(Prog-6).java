public class ConfusionMatrix {

    public static void main(String[] args) {
        int[][] actualLabels = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int[][] predictedLabels = {{1, 0, 1}, {1, 1, 0}, {0, 0, 1}};

        int[][] confusionMatrix = calculateConfusionMatrix(actualLabels, predictedLabels);

        int tp = confusionMatrix[0][0];
        int tn = confusionMatrix[1][1];
        int fp = confusionMatrix[0][1] + confusionMatrix[1][0];
        int fn = confusionMatrix[1][0] + confusionMatrix[0][1];

        double precision = (double) tp / (tp + fp);
        double recall = (double) tp / (tp + fn);
        double f1Score = 2 * precision * recall / (precision + recall);

        System.out.println("Confusion Matrix:");
        printMatrix(confusionMatrix);
        System.out.println("True Positive (TP): " + tp);
        System.out.println("True Negative (TN): " + tn);
        System.out.println("False Positive (FP): " + fp);
        System.out.println("False Negative (FN): " + fn);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1-Score: " + f1Score);
    }

    private static int[][] calculateConfusionMatrix(int[][] actualLabels, int[][] predictedLabels) {
        int numClasses = Math.max(getMaxValue(actualLabels), getMaxValue(predictedLabels)) + 1;
        int[][] confusionMatrix = new int[numClasses][numClasses];

        for (int i = 0; i < actualLabels.length; i++) {
            for (int j = 0; j < actualLabels[i].length; j++) {
                int actualLabel = actualLabels[i][j];
                int predictedLabel = predictedLabels[i][j];
                confusionMatrix[actualLabel][predictedLabel]++;
            }
        }

        return confusionMatrix;
    }

    private static int getMaxValue(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }
        }
        return max;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
