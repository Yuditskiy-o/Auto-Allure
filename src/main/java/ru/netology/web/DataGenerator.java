package ru.netology.web;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Data
@NoArgsConstructor
public class DataGenerator {

    public static String getRandomCity() {
        List<String> list = Arrays.asList("Новосибирск", "Москва", "Санкт-Петербург", "Казань", "Йошкар-Ола");
        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        return randomElement;
    }

    public static String getRelevantDate(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String getIrrelevantDate() {
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return today;
    }

}
