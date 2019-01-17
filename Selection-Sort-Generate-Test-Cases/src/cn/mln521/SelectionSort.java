package cn.mln521;

import java.util.Arrays;

/**
 * @Descripton TODO
 * Created by xl
 * @Date 2019/1/17 22:26
 */
public class SelectionSort {

    // 我们的算法类不允许产生任何实例
    public SelectionSort() {}

    public static <T extends Comparable<T>> void sort(T[] arr) {

        int n = arr.length;
        for (int i = 0 ; i < n; i++) {
            // 寻找[i, n)区间里的最小值的索引
            int minLength = i;
            for (int j = i + 1; j < n; j++) {
                // 使用compareTo方法比较两个Comparable对象的大小
                if (arr[j].compareTo(arr[minLength]) < 0) {
                    minLength = j;
                }
            }

            swap(arr, i ,minLength);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        // 测试排序算法辅助函数
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectionSort.sort(arr);
        SortTestHelper.printArray(arr);

    }
}
