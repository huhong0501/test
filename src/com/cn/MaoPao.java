package com.cn;

import com.sun.org.apache.xpath.internal.objects.XString;

public class MaoPao {

  public static void maoPao(int[] arr){
      for (int j = 0;j<arr.length-1;j++){
          for (int i = 0;i<arr.length-1-j;i++){
              if (arr[i]>arr[i+1]) {
                  int temp = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = temp;
              }
          }
      }
  }
  public static void prArr(int[] arr){
      String str = "[";
      for (int j = 0;j<=arr.length-1;j++){
          if (j==arr.length-1){
              str+=arr[j]+"]";
          }else {
              str+=arr[j]+",";
          }
      }
      System.out.println(str);
  }
    public static void main (String[] args){
        int[] arr ={3,5,76,88,67,55};
maoPao(arr);
prArr(arr);
    }
}
