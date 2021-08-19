package main.java.com.hemebiotech.analytics;

/***
 * Application Biotech, permettant de synthétiser les symptomes
 */
public class BiotechApplication {


    public static void main(String args[]){

        IAnalyticsCounter counter = new SymptomCounter();
        counter.count(args);
    }
}
