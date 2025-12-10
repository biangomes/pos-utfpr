package br.edu.utfpr;

import com.opencsv.bean.AbstractBeanField;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter extends AbstractBeanField<String, LocalDate> {

    @Override
    protected LocalDate convert(String value) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate newDate = LocalDate.parse(value, pattern);
        return newDate;
    }
}
