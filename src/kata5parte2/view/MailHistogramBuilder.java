package kata5parte2.view;

import kata5parte2.model.Histogram;
import kata5parte2.model.Mail;

import java.util.List;

public class MailHistogramBuilder {
    public static Histogram<String> build (List<Mail> list){
        Histogram<String> histo = new Histogram<>();
        String domain;
        for(Mail m : list){
            domain = m-getDomain();
            if(domain != null){
                histo.increment (m.getDomain());
            }
        }
        return histo;
    }
}
