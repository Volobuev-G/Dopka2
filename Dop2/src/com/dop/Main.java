package com.dop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(fileReader(Path.of("results.txt")));
    }
    public static Map<String, Integer> fileReader(Path file) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        Files.lines(file).map(s -> s.split("\\s+"))
                .forEach(array -> {StudentsTasksAttempts student = new StudentsTasksAttempts(array[0]
                        ,Integer.parseInt(array[1])
                        ,Integer.parseInt(array[2])
                        ,Integer.parseInt(array[3]));
                    map.put(student.getLastName()
                            ,map.getOrDefault(student.getLastName(),0)
                                    + scoreCounter(student.getAttemptNumber(),student.getScore()));
                });
        return map;
    }
    public static int scoreCounter(int attemptNumber,int maxScore) {
        if (attemptNumber < 5) {
            return maxScore;
        } else if (attemptNumber >=5 && attemptNumber < 10) {
            return maxScore/2;
        } else {
            return 1;
        }
    }
}
