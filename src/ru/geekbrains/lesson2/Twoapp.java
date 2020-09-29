package ru.geekbrains.lesson2;

public class Twoapp {
    public static void main (String[] args)
    {
        int[] arr = new int[]{1,0,0,1,1,0,0,1};
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                arr[i]=1;

            } else arr[i]=0;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int[] arr1 = new int[8];
        for(int i = 0; i < arr1.length; i++)
        {

            arr1[i]=i*3;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        int[] arr2 = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < arr2.length; i++)
        {
            if (arr2[i]<6)
            {
                arr2[i]=arr2[i]*2;
            }
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++)
        {
            for (int j = 0; j < arr3[i].length; j++)
            {
                if (i == j || arr3.length - i - 1 == j)
                {
                    arr3[i][j]=1;
                }
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
        int[] arr4 = new int[] {1,5,3,2,-90,4,5,2,4,8,9,41};
        int arrmin=arr4[0];
        int arrmax=arr4[0];
        for(int i = 0; i < arr4.length; i++)
        {

            if (arr4[i]<arr4[0])
            {
                arrmin=arr4[i];
            }
            if (arr4[i]>arr4[0])
            {
                arrmax=arr4[i];
            }

        }
        System.out.println("Минимальное значение массива: " + arrmin);
        System.out.println("Максимальное значение массива: " + arrmax);

        int[] nums = {2, 2, 2, 1, 2, 2, 10, 1};
        int sumNums = 0;
        int minSum = 0;
        int ost;
        boolean bool;
        int z =0;
        for (int i = 0; i < nums.length; i++) {
            sumNums = sumNums + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            minSum = minSum + nums[i];
            ost = sumNums - minSum;
            if (minSum==ost)
                z = z +1;
        }
        if (z==0) bool = false;
        else bool = true;
        System.out.println("В массиве есть место, в котором сумма левой и правой части массива равны: " + bool);
    }

}
