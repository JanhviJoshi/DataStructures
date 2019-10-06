import java.io.*;
import java.util.*;

class UniqueCount{
  public static void main(String args[]){
    //System.out.println("hello world");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of terms: ");
    int num= sc.nextInt();
    int arr[]= new int[num];
    if(num==0){
      System.out.println("No elements entered");
    }
    else{
      System.out.println("Enter elements: ");
      for(int i=0; i<num; ++i){
        arr[i]= sc.nextInt();
      }
      if(num==1){
        System.out.println("Number of unique elements: "+ 1);
      }
      else{
        //sorting array using mergeSort with time complexity nlog n
        mergeSort(arr, 0, arr.length-1);
        // for(int i=0; i<arr.length; ++i){
        //   System.out.println(arr[i]);
        // }
        int cnt= findUnique(arr);
        System.out.println("Number of unique elements: "+ cnt);
      }
    }
  }

  public static void mergeSort(int arr[], int beg, int end){
    int mid= (beg+end)/2;

    if(beg<end){
      mergeSort(arr, beg, mid); //first half
      mergeSort(arr, mid+1, end); //second half

      merge(arr, beg, mid, end);
  }
  }

  public static void merge(int arr[], int l, int m, int r){
    int n1= m-l+1;
    int n2= r-m;

    //copy into new arrays from old array
    int ll[]= new int[n1];
    int rr[]= new int[n2];

    for(int i=0; i<n1; ++i)
      ll[i]= arr[l+i];
    for(int i=0; i<n2; ++i)
      rr[i]= arr[m+i+1];

    int i=0;
    int j=0;
    int k=l;

    while(i<n1 && j<n2){
      if(ll[i]<rr[j]){
        arr[k]= ll[i];
        ++i;
      }
      else{
        arr[k]= rr[j];
        ++j;
      }
      ++k;
    }

    //if l array left
    while(i<n1){
      arr[k]= ll[i];
      ++k;
      ++i;
    }

    while(j<n2){
      arr[k]=rr[j];
      ++k;
      ++j;
    }
  }

  public static int findUnique(int arr[]){
    int cnt=1;
    int n= arr.length;
    for(int i=0; i<n-1; ++i){
      if(arr[i]!=arr[i+1])
        ++cnt;
      }
    return cnt;
  }
}
