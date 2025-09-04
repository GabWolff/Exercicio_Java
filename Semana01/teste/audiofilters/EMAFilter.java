
public class EMAFilter {

    private final double alpha;
    private double emaValue;

    /**
     * Constructs an EMA filter with a given smoothing factor.
     *
     * @param alpha Smoothing factor (0 < alpha <= 1)
     * @throws IllegalArgumentException if alpha is not in (0,1]
     */
    public EMAFilter(double alpha) {
        if (alpha <= 0 || alpha > 1) {
            throw new IllegalArgumentException("Alpha must be in (0,1]");
        }
        this.alpha = alpha;
        this.emaValue = 0.0;
    }

    /**
     * Applies the EMA filter to an audio signal array.
     *
     * @param audioSignal Array of audio samples
     * @return Smoothed signal
     */
    public double[] apply(double[] audioSignal) {
        if (audioSignal.length == 0) {
            return new double[0];
        }
        double[] emaSignal = new double[audioSignal.length];
        emaValue = audioSignal[0];
        emaSignal[0] = emaValue;
        for (int i = 1; i < audioSignal.length; i++) {
            emaValue = alpha * audioSignal[i] + (1 - alpha) * emaValue;
            emaSignal[i] = emaValue;
        }
        return emaSignal;
    }
}
