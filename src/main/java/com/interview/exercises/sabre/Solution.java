package com.interview.exercises.sabre;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Solution {

    public static Collection<Integer> multiplyOddNumbersInTheCollectionBy2AndEvenBy3ThenSortTheResult(Collection<Integer> entries) {
        return entries.stream()
                .map(num -> num % 2 == 0 ? num * 3 : num * 2)
                .sorted()
                .toList();
    }

    public static Collection<Integer> makePowerOfTwoForAllTheNumbersAndRemoveFours(List<Integer> entries) {
        return entries.stream()
                .map(num -> num * num)
                .filter(num -> num != 4)
                .toList();
    }

    public static Collection<Integer> firstThreePositiveNumbers(Collection<Integer> entries) {
        return entries.stream()
                .filter(num -> num > 0)
                .limit(3)
                .toList();
    }

    public static Collection<Integer> increaseEveryEvenNumberBy3AndReturnUnique(Collection<Integer> entries) {
        return entries.stream()
                .map(num -> num % 2 == 0 ? num + 3 : num)
                .distinct()
                .toList();
    }

    public static Collection<Integer> removeTheLowestNumber(Collection<Integer> entries) {
        if (entries.isEmpty()) return Collections.EMPTY_LIST;

        Optional<Integer> min = entries.stream().min(Comparator.naturalOrder());

        return entries.stream()
                .filter(num -> !Objects.equals(num, min.get()))
                .toList();
    }

    public static Collection<String> addABCtoEveryStringAndSortStringsByTheirLength(Collection<String> entries) {
        return entries.stream()
                .map(word -> word + "ABC")
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    public static Collection<Integer> chooseUniqueElementsCommonToBothCollections(Collection<Integer> first, Collection<Integer> second) {
        return first.stream()
                .filter(second::contains)
                .distinct()
                .toList();
    }

    public static Collection<Integer> onlyUniqueMultiplesOfBoth2and3(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .flatMap(Collection::stream)
                .filter(num -> num % 2 == 0 && num % 3 == 0)
                .distinct()
                .toList();
    }

    public static Integer maxNumberFrom(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .flatMap(Collection::stream)
                .max(Comparator.naturalOrder()).get();
    }

    public static Collection<Collection<Integer>> chooseCollectionsThatContainOnlyPositiveNumbers(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .filter(nums -> nums.stream().allMatch(num -> num >= 0))
                .collect(Collectors.toList());
    }

    public static Collection<Collection<Integer>> chooseCollectionsThatContainOnlyPositiveNumbersAndSortCollectionsFromShortestToLongest(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .filter(nums -> nums.stream().allMatch(num -> num >= 0))
                .sorted(Comparator.comparingInt(Collection::size))
                .toList();
    }

    public static Long countUniqueElementsFrom(Collection<Collection<Integer>> entries) {
        List<Integer> uniqueNums = new ArrayList<>();
        Set<Integer> numsTmp = new HashSet<>();

        List<Integer> nums = entries.stream()
                .flatMap(Collection::stream)
                .toList();

        nums.forEach(num -> {
            if (!numsTmp.contains(num)) {
                numsTmp.add(num);
                uniqueNums.add(num);
            } else {
                uniqueNums.remove(num);
            }
        });

        return (long) uniqueNums.size();
    }

    public static Collection<Integer> chooseMaxFromEachCollection(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .filter(nums -> !nums.isEmpty())
                .map(nums -> nums.stream().max(Comparator.naturalOrder()).get())
                .toList();
    }

    public static Collection<Collection<Integer>> leavePositiveNumbersAndSortCollectionsFromShortestToLongest(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .map(nums -> nums.stream().filter(num -> num >= 0).collect(Collectors.toCollection(ArrayList::new)))
                .sorted(Comparator.comparingInt(Collection::size))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static Collection<Integer> chooseElementsCommonToAllCollections(Collection<Collection<Integer>> entries) {
        if (entries.isEmpty()) return Collections.emptyList();

        Iterator<Collection<Integer>> iterator = entries.iterator();
        Set<Integer> commonNums = new HashSet<>(iterator.next());

        while (iterator.hasNext()) {
            Collection<Integer> next = iterator.next();
            commonNums.retainAll(next);
        }

        return commonNums;
    }

    public static Collection<Integer> multiplyNumbersInEachCollectionThenSortResultsByAbsoluteValue(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .map(nums -> {
                    AtomicInteger res = new AtomicInteger(1);
                    nums.forEach(num -> res.updateAndGet(v -> v * num));
                    return res.get();
                })
                .sorted(Comparator.comparingInt(Math::abs))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static Collection<Double> leavePositiveNumbersThenSortCollectionsFromShortestToLongestAndCalculateAverageForEach(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .filter(nums -> !nums.isEmpty())
                .map(nums -> nums.stream().filter(num -> num >= 0).toList())
                .sorted(Comparator.comparing(Collection::size))
                .mapToDouble(nums -> nums.stream().mapToInt(Integer::intValue).average().getAsDouble())
                .boxed().toList();
    }

    public static Map<Double, String> calculateAverageForEachCollectionThenCreateMapAverageToStringRepresentation(Collection<Collection<Integer>> entries) {
        return entries.stream()
                .map(nums -> nums.stream().mapToInt(Integer::intValue).average())
                .collect(Collectors.toMap(
                        num -> num.getAsDouble(),
                        num -> String.valueOf(num.getAsDouble())
                ));
    }

}