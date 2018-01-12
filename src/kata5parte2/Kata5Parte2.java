package kata5parte2;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderDDBB;

import java.sql.*;
//import java.util.Calendar;
import java.util.List;

public class Kata5Parte2 {
    
    private String fileName;
    private List<Mail>mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histogramDisplay;

    public static void main(String[] args) {
         Kata5Parte2 kata = new Kata5Parte2();
         kata.execute();
    }
    
    private void execute(){
        input();
        proccess();
        output();
    }
    
    private void input(){
        fileName = "KATA5.sqlite";
        mailList = MailListReaderDDBB.read(fileName);
    }
    
    private void proccess(){
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
    private void output(){
        histogramDisplay = new HistogramDisplay (histogram);
        histogramDisplay.execute();
    }
}
