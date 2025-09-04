
public class IIRFilter {

    private final int order;
    private final double[] coeffsA;
    private final double[] coeffsB;
    private final double[] historyX;
    private final double[] historyY;

    public IIRFilter(int order) throws IllegalAccessException {
        if (order < 1) {
            throw new IllegalAccessException("Order must be at least 1");
        }

        this.order = order;
        coeffsA = new double[order + 1];
        coeffsB = new double[order + 1];

        coeffsA[0] = 1.0;
        coeffsB[0] = 1.0;

        historyX = new double[order];
        historyY = new double[order];
    }

    public void setCoeffs(double[] aCoeffs, double[] bCoeffs) throws IllegalAccessException {
        if (aCoeffs.length != order) {
            throw new IllegalAccessException("aCoeffs length must be " + order);
        }

        if (aCoeffs[0] == 0.0) {
            throw new IllegalAccessException("aCoeffs[0] cannot be zero");
        }

        if (bCoeffs.length != order) {
            throw new IllegalAccessException("bCoeffs length must be " + order);
        }

        for (int i = 0; i < order; i++) {
            coeffsA[i + 1] = aCoeffs[i];
            coeffsB[i + 1] = bCoeffs[i];
        }

    }

    public double process(double samle) {
        double result = 0.0;

        for (int i = 1; i <= order; i++) {
            result += (coeffsB[i] * historyX[i - 1] - coeffsA[i] * historyY[i - 1]);
        }
        result = (result + coeffsB[0] * samle) / coeffsA[0];

        for (int i = order - 1; i > 0; i--) {
            historyX[i] = historyX[i - 1];
            historyY[i] = historyY[i - 1];
        }

        historyX[0] = samle;
        historyY[0] = result;
        return result;
    }

}
