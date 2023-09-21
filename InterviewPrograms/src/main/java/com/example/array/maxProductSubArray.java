package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class maxProductSubArray {
    public void operation(int a[]) {
        int total = 1;
        int cur_max = 1;
        int cur_min = 1;
        for (int i = 0; i < a.length; i++) {
            int temp = cur_max * a[i];
            cur_max = maxValue(cur_max * a[i], cur_min * a[i], a[i]);
            cur_min = minValue(temp, cur_min * a[i], a[i]);
            total = Math.max(total, cur_max);
        }
        log.info("max Product subArray:{}", total);
    }

    private int maxValue(int curMax, int curMin, int currentValue) {
        int max = Math.max(curMax, curMin);
        return Math.max(max, currentValue);
    }

    private int minValue(int curMax, int curMin, int currentValue) {
        int min = Math.min(curMin, curMax);
        return Math.min(min, currentValue);
    }

    public static void main(String[] args) {
        int a[] = {1, -2, -3, 0, 7, -8, -2};
        maxProductSubArray obj = new maxProductSubArray();
        obj.operation(a);
    }
}
