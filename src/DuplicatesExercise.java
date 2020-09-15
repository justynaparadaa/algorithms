/*
       The findDuplicates method is missing its implementation. It should return
    a list of values, that are repeated numberOfDuplicates times.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DuplicatesExercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        List<Integer> results = new ArrayList<>();

        if (numberOfDuplicates < 0) {
            return results;
        }

        if(integers == null){
            return results;
        }

        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());

        for (Integer integer : collect) {
            long counter = integers.stream().filter(Objects::nonNull).filter(number -> number.equals(integer)).count();
            if (counter == numberOfDuplicates) {
                results.add(integer);
            }
        }
        return results;
    }

}