package com.interview.sabre;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.interview.exercises.sabre.Solution.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void multiplyAndSort_test() {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Collection<Integer> transformedNumbers = multiplyOddNumbersInTheCollectionBy2AndEvenBy3ThenSortTheResult(nums);

        assertThat(transformedNumbers).isEqualTo(List.of(2, 6, 6, 10, 12, 14, 18, 18, 24));

    }

    @Test
    public void makePowersAndRemoveFours_test() {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Collection<Integer> transformedNumbers = makePowerOfTwoForAllTheNumbersAndRemoveFours(nums);

        assertThat(transformedNumbers).isEqualTo(List.of(1, 9, 16, 25, 36, 49, 64, 81));

    }

    @Test
    public void firstThreePositiveNumbers_test() {

        List<Integer> nums = List.of(-4, -3, -2, -1, 0, 1, 2, 3, 4);

        Collection<Integer> transformedNumbers = firstThreePositiveNumbers(nums);

        assertThat(transformedNumbers).isEqualTo(List.of(1, 2, 3));

    }

    @Test
    public void increaseEveryEvenNumberBy3AndReturnUnique_test() {

        List<Integer> nums = List.of(-4, -3, -2, -1, 0, 1, 2, 3, 4, 4, 2, -2);

        Collection<Integer> transformedNumbers = increaseEveryEvenNumberBy3AndReturnUnique(nums);

        assertThat(transformedNumbers).isEqualTo(List.of(-1, -3, 1, 3, 5, 7));

    }

    @Test
    public void removeTheLowestNumber_test() {

        List<Integer> nums = List.of(-3, -2, -1, 0, 1, 2, 3, 4, 4, 2, -2);

        Collection<Integer> transformedNumbers = removeTheLowestNumber(nums);

        assertThat(transformedNumbers).isEqualTo(List.of(-2, -1, 0, 1, 2, 3, 4, 4, 2, -2));

    }

    @Test
    public void addABCtoEveryStringAndSortStringsByTheirLength_test() {

        List<String> words = List.of("asdf", "vc", "sdf", "s", "sdferty");

        Collection<String> transformedWords = addABCtoEveryStringAndSortStringsByTheirLength(words);

        assertThat(transformedWords).isEqualTo(List.of("sABC", "vcABC", "sdfABC", "asdfABC", "sdfertyABC"));

    }

    @Test
    public void chooseUniqueElementsCommonToBothCollections_test() {

        List<Integer> nums1 = List.of(1, 2, 3, 4, 4, 5);
        List<Integer> nums2 = List.of(4, 5, 6, 7, 8);

        Collection<Integer> commonNums = chooseUniqueElementsCommonToBothCollections(nums1, nums2);

        assertThat(commonNums).isEqualTo(List.of(4, 5));

    }

    @Test
    public void onlyUniqueMultiplesOfBoth2and3_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(2, 3, 6, 9, 12),
                List.of(12, 15, 18, 22),
                List.of(18, 24, 26, 28)
        );

        Collection<Integer> uniqueMultiples = onlyUniqueMultiplesOfBoth2and3(nums2d);

        assertThat(uniqueMultiples).isEqualTo(List.of(6, 12, 18, 24));

    }

    @Test
    public void maxNumberFrom_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(2, 3, 6, 9, 12),
                List.of(12, 32, 18, 22),
                List.of(18, 24, 26, 28)
        );

        Integer maxNum = maxNumberFrom(nums2d);

        assertThat(maxNum).isEqualTo(32);

    }

    @Test
    public void chooseCollectionsThatContainOnlyPositiveNumbers_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(2, 3, 6, 9, 12),
                List.of(-12, 32, -18, -22),
                List.of(18, 24, 26, -28),
                List.of(54, -1, 21, 76),
                List.of(9, 34, 12, 87)
        );

        Collection<Collection<Integer>> positiveNums = chooseCollectionsThatContainOnlyPositiveNumbers(nums2d);

        assertThat(positiveNums).isEqualTo(List.of(
                List.of(2, 3, 6, 9, 12),
                List.of(9, 34, 12, 87)
        ));

    }

    @Test
    public void chooseCollectionsThatContainOnlyPositiveNumbersAndSortCollectionsFromShortestToLongest_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(4, 3, 6, 9, 12),
                List.of(-12, 32, -18, -22),
                List.of(18, 24, 26, -28),
                List.of(54, -1, 21, 76),
                List.of(2, 34, 12, 87),
                List.of(3, 34, 12, 87),
                List.of(1, 34, 12),
                List.of(0, 34)
        );

        Collection<Collection<Integer>> positiveSortedNums = chooseCollectionsThatContainOnlyPositiveNumbersAndSortCollectionsFromShortestToLongest(nums2d);

        assertThat(positiveSortedNums).isEqualTo(List.of(
                List.of(0, 34),
                List.of(1, 34, 12),
                List.of(2, 34, 12, 87),
                List.of(3, 34, 12, 87),
                List.of(4, 3, 6, 9, 12)
        ));

    }

    @Test
    public void countUniqueElementsFrom_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(4, 4, 6, 9, 12),
                List.of(-12, 4, 6, -22)
        );

        Long uniqueCount = countUniqueElementsFrom(nums2d);

        assertThat(uniqueCount).isEqualTo(4);

    }

    @Test
    public void chooseMaxFromEachCollection_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(4, 3, 6, 9, 12),
                List.of(-12, 32, -18, -22),
                List.of(18, 24, 26, -28),
                List.of(54, -1, 21, 76),
                List.of(2, 34, 12, 87),
                List.of(3, 34, 12, 87),
                List.of(1, 34, 12),
                List.of(0, 34),
                List.of()
        );

        Collection<Integer> maxNums = chooseMaxFromEachCollection(nums2d);

        assertThat(maxNums).isEqualTo(List.of(12, 32, 26, 76, 87, 87, 34, 34));

    }

    @Test
    public void leavePositiveNumbersAndSortCollectionsFromShortestToLongest_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(4, 3, 6, 9, 12),
                List.of(-12, 32, -18, -22),
                List.of(18, 24, 26, -28),
                List.of(54, -1, 21, 76),
                List.of(2, 34, 12, 87),
                List.of(3, 34, 12, 87),
                List.of(1, 34, 12),
                List.of(0, 34)
        );

        Collection<Collection<Integer>> positiveNumsSortedByLength = leavePositiveNumbersAndSortCollectionsFromShortestToLongest(nums2d);

        assertThat(positiveNumsSortedByLength).isEqualTo(List.of(
                List.of(32),
                List.of(0, 34),
                List.of(18, 24, 26),
                List.of(54, 21, 76),
                List.of(1, 34, 12),
                List.of(2, 34, 12, 87),
                List.of(3, 34, 12, 87),
                List.of(4, 3, 6, 9, 12)
        ));

    }

    @Test
    public void chooseElementsCommonToAllCollections_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(4, 3, 6, 9, 12),
                List.of(12, 4, -18, -22),
                List.of(12, 24, 4, -28)
        );

        Collection<Integer> commonElements = chooseElementsCommonToAllCollections(nums2d);

        assertThat(commonElements).isEqualTo(List.of(4, 12));

    }

    @Test
    public void multiplyNumbersInEachCollectionThenSortResultsByAbsoluteValue_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(-2, -3, 4, -5, 6),
                List.of(1, 2, 3, 4),
                List.of(-1, -3, 5, -7)
        );

        Collection<Integer> result = multiplyNumbersInEachCollectionThenSortResultsByAbsoluteValue(nums2d);

        assertThat(result).isEqualTo(List.of(24, -105, -720));

    }

    @Test
    public void leavePositiveNumbersThenSortCollectionsFromShortestToLongestAndCalculateAverageForEach_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(-2, -3, 4, -5, 6),
                List.of(1, 2, 3, 4),
                List.of(-1, -3, 5, -7)
        );

        Collection<Double> result = leavePositiveNumbersThenSortCollectionsFromShortestToLongestAndCalculateAverageForEach(nums2d);

        assertThat(result).isEqualTo(List.of(5.0, 5.0, 2.5));

    }

    @Test
    public void calculateAverageForEachCollectionThenCreateMapAverageToStringRepresentation_test() {

        List<Collection<Integer>> nums2d = List.of(
                List.of(-2, -3, 4, -5, 6),
                List.of(1, 2, 3, 4),
                List.of(-1, -3, 5, -7)
        );

        Map<Double, String> result = calculateAverageForEachCollectionThenCreateMapAverageToStringRepresentation(nums2d);

        assertThat(result).isEqualTo(Map.of(-1.5, "-1.5", 0.0, "0.0", 2.5, "2.5"));

    }

}