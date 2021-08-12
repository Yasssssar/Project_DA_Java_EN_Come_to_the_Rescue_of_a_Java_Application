package main.java.com.hemebiotech.analytics;

public class BiotechApplication {


    public static void main(String args[]){

        IAnalyticsCounter counter = new AnalyticsCounter();
        counter.count(args);
    }
}
