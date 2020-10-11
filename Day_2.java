package Day2;

import java.util.Arrays; //这个类用于处理数组

public class Day_2 {

    static int array[] = new int[]{32, 16, 8, 9, 31, 20};

    public static void main(String[] args) {
        // GetDay();
        // Matrix();
        // Swap();
        // Taxis();
        // cope();
        // example();
        //Day_2 BubbleSort = new Day_2(); //建立对象 引用public里的方法
        // BubbleSort.BubbleSort(array);
        Day_2 SelectSort = new Day_2();
        // SelectSort.SelectSort(array);
        // ReverseSort(); 反转字符串 将所有字符换位置

    }

    /* 反转排序*/
    static void ReverseSort()
    {
        int t;
        int len=array.length;
        for(int i=0;i<len/2;++i)
        {
            t = array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=t;
        }
        Day_2 aaa = new Day_2();
        aaa.showArray(array);
    }

    /* 选择排序*/
    public void SelectSort(int[] A) {
        int index;
        for (int i = 1; i < A.length; ++i) {
            index = 0;
            for (int j = 1; j <= A.length - i; ++j) {
                if (A[j] > A[index])
                    index = j;
            }
            int t = A[A.length - i];
            A[A.length - i] = A[index];
            A[index] = t;
        }
        showArray(A);
    }

    // 冒泡排序
    public void BubbleSort(int[] A) {
        for (int i = 1; i < A.length; ++i) {
            for (int j = 0; j < A.length - i; ++j) {
                if (A[j] > A[j + 1]) {
                    int t = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = t;
                }
            }
        }
        showArray(A);
    }

    public void showArray(int[] A) {
        for (int i : A)
            System.out.print(i + " ");
    }

    // 数组查询
    static void example() {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, 9);
        System.out.println(index);
        int str = Arrays.binarySearch(array, 0, 2, 9);
        System.out.println(str);
    }

    //复制数组
    static void cope() {
        int new_arr[] = Arrays.copyOf(array, 1);//0-6
        for (int i : new_arr)
            System.out.print(i + " ");
        System.out.println();
        int next_arr[] = Arrays.copyOfRange(array, 2, 5);//2-4
        for (int i : next_arr)
            System.out.print(i + " ");
    }

    // sort 快排 根据 unicode 中的大小进行排序
    static void Taxis() {
        Arrays.sort(array);
        for (int a : array)
            System.out.print(a + " ");
    }

    // java.util.Arrays 字符修改 fill()方法
    static void Swap() {
        int arr[] = new int[5];
        Arrays.fill(arr, 8);//将元素都换成8;
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
        int arr2[] = new int[]{45, 12, 56, 2, 10};
        Arrays.fill(arr2, 0, 5, 8);//fill(array,a,b,num) 将array[a]~array[b-1] 改成num
        for (int a : arr2)
            System.out.print(a + " ");

    }

    /* 一维数组*/
    static void GetDay() {
        int day[];
        day = new int[12];
        for (int i = 0; i < 12; ++i) {
            if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5 || (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10 || (i + 1) == 12)
                day[i] = 31;
            else if ((i + 1) == 2)
                day[i] = 28;
            else
                day[i] = 30;
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }

    }

    /* 二维数组*/
    static void Matrix() {
        int double_arr[][] = new int[3][4];
        for (int i = 0; i < double_arr.length; ++i) {
            for (int j = 0; j < double_arr[i].length; ++j)
                System.out.print(double_arr[i][j] + "\t");
        }
    }
}
