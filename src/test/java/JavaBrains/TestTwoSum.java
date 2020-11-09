package JavaBrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTwoSum {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void test1(){
        int[] nums = new int[]{3,15,2,7};
        int requiredSum = 9;
        Assertions.assertArrayEquals(twoSum.twoSum(nums, requiredSum), new int[]{2, 7});
    }
}
