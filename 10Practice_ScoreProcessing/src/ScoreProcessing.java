public class ScoreProcessing {
    private int min, max ;
    private MinMaxStrategy strategy;
    public ScoreProcessing(MinMaxStrategy strategy) { setStrategy(strategy); }
    public void setStrategy(MinMaxStrategy strategy) { this.strategy = strategy; }
    public void analyze(int[] data) {
        min = strategy.getMin(data);
        max = strategy.getMax(data);
    }
    public static void main(String[] args) {
        int[] data = {0, 50, 10, 30, 70} ;
        ScoreProcessing proc = new ScoreProcessing(new GeneralMinMax()) ;
        proc.analyze(data) ;
        proc.setStrategy(new JavaMinMax()) ;
        proc.analyze(data) ;
    }
}