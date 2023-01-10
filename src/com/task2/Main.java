package com.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        LightTrial lt1 = new LightTrial("lt1", r.nextInt(100), r.nextInt(100));
        LightTrial lt2 = new LightTrial("lt2", r.nextInt(100), r.nextInt(100));
        Trial tr1 = new Trial("tr1", r.nextInt(100), r.nextInt(100) );
        Trial tr2 = new Trial("tr2", r.nextInt(100), r.nextInt(100) );
        Trial tr3 = new Trial("tr3", r.nextInt(100), r.nextInt(100) );

        StrongTrial st1 = new StrongTrial("st1", r.nextInt(100), r.nextInt(100));
        StrongTrial st2 = new StrongTrial("st2", r.nextInt(100), r.nextInt(100));

        ExtraTrial et1 = new ExtraTrial("ET1", r.nextInt(100), r.nextInt(100), r.nextInt(100));
        ExtraTrial et2 = new ExtraTrial("ET2", r.nextInt(100), r.nextInt(100), r.nextInt(100));

        ArrayList<Trial> trials = new ArrayList<>(Arrays.asList(lt1, lt2, tr1, tr2, tr3, st1, st2, et1, et2));

        // Вывести коллекцию на экран(каждый элемент с новой строки);
        trials.forEach(System.out::println);
        // Вывести номер пройденных испытаний
        List<Trial> ttt = trials.stream().filter(el -> el.isPassed()).toList();
        int numberPassed = ttt.size();
        System.out.println(ttt.size());

        // 4. Отсортировать коллекцию по сумме первых и вторых оценок - два метода
        trials.stream().sorted(Comparator.comparingInt(el -> (el.getMarkOne() + el.getMarkTwo())))
                .forEach(System.out::println);
        trials.stream().sorted((el1, el2) -> (el1.getMarkOne()+ el1.getMarkTwo())
                - (el2.getMarkOne()+ el2.getMarkTwo())).forEach(System.out::println);

        // 5. Вывести суммы первых и вторых оценок (каждый элемент с новой строки);
        trials.stream().mapToInt(e -> e.getMarkTwo()+ e.getMarkOne()).forEach(System.out::println);

        // 6. Создать новую коллекцию из непройденных экзаменов,
        //очистить все оценки и вывести на экран
        trials.stream().filter(e -> !e.isPassed()).forEach(el -> {
            el.resetMarks();
            System.out.println(el);
        });






    }



}
