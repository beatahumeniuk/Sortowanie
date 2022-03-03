import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SortTest {

    private final static int[] tab1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final static int[] tab2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    private final static int[] tab3 = new int[]{8, 3, 6, 2, 9, 5, 4, 1, 7};
    private final static int[] tab4 = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
    private final static int[] tab5 = new int[]{5, 6, 4, 7, 3, 8, 2, 9, 1};

    @ParameterizedTest
    @MethodSource("getUnsortedTabs")
    void bubbleSortTest(int[] unsortedTab) {
        Assert.assertEquals(tab1, BubbleSort.sort(unsortedTab));
    }

    @ParameterizedTest
    @MethodSource("getUnsortedTabs")
    void insertSortTest(int[] unsortedTab) {
        Assert.assertEquals(tab1, InsertSort.sort(unsortedTab));
    }

    @ParameterizedTest
    @MethodSource("getUnsortedTabs")
    void selectSortTest(int[] unsortedTab) {
        Assert.assertEquals(tab1, SelectSort.sort(unsortedTab));
    }

    @ParameterizedTest
    @MethodSource("getUnsortedTabs")
    void mergeSortTest(int[] unsortedTab) {
        Assert.assertEquals(tab1, MergeSort.sort(unsortedTab));
    }

    @ParameterizedTest
    @MethodSource("getUnsortedTabs")
    void quickSortTest(int[] unsortedTab) {
        Assert.assertEquals(tab1, QuickSort.sort(unsortedTab));
    }

    private static Stream<Arguments> getUnsortedTabs() {
        return Stream.of(
                Arguments.of(tab1),
                Arguments.of(tab2),
                Arguments.of(tab3),
                Arguments.of(tab4),
                Arguments.of(tab5));
    }
}
