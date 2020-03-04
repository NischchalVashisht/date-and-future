package com.knoldus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * following class count File frequency count of word
 */
public class FileContentCount {

    /**
     *
     * @param filepath file path of a particular file
     * @return frequency Count
     */
    static Map<String, Integer> getContentCount(String filepath) {
        try (Stream<String> stream = Files.lines(Paths.get(filepath))) {
           List<String> list= stream.map(x->x.split(":=")).flatMap(Arrays::stream).collect(Collectors.toList());
           return list.stream().collect(Collectors.toMap(String::toLowerCase, w -> 1, Integer::sum));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

}