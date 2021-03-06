package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        histogram.increment("ull.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram);        
        histogramDisplay.execute();
    }
    
}
