package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DatePrefixGenerator implements PrefixGenerator {

    private String pattern;

    public void setPattern(String pattern){
        this.pattern = pattern;
    }

    @Override
    public String getPrefix() {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(new Date());
    }
}
