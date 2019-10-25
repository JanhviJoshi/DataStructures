import java.util.*;

class UniqueCountString{

  public static void main(String[] args) {
    String string;
    string= takeInput();

    /* Converting all characters in the string to lowercase */
    string= string.toLowerCase();
    /* Removing all white spaces so that they are not counted */
    string= string.replaceAll("\\s", "");

    char c[]= new char[string.length()];
    for(int i=0; i<string.length(); ++i){
      c[i]= string.charAt(i);
    }
    /* Sorting all characters in the string in increasing order */
    mergeSort(c, 0, c.length-1);
    /* Finding the count of each element */
    findFrequency(c);
  }

  public static String takeInput(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string");
    String string= sc.nextLine();
    return string;
  }

  public static void mergeSort(char c[],int start,int end){
    int middle= (start+end)/2;
    if(start<end){
      mergeSort(c, start, middle);
      mergeSort(c, middle+1, end);
      merge(c, middle, start, end);
    }
  }

  public static void merge(char c[], int mid, int start, int end){
    int left= mid-start+1;
    int right= end-mid;

    char leftArray[]= new char[left];
    char rightArray[]= new char[right];

    //copying
    for(int i=0; i<left; ++i){
      //System.out.println("index:"+i);
      leftArray[i]= c[start+i];
    }
    for(int i=0; i<right; ++i)
      rightArray[i]= c[mid+i+1];

    int i=0;
    int j=0;
    int k=start;

    while(i<left && j<right){
      if(leftArray[i]<rightArray[j]){
        c[k]= leftArray[i];
        ++i;
      }
      else{
        c[k]=rightArray[j];
        ++j;
      }
      ++k;
    }

    while(i<left){
      c[k]= leftArray[i];
      ++i;
      ++k;
    }

    while(j<right){
      c[k]= rightArray[j];
      ++j;
      ++k;
    }

  }

  public static void findFrequency(char c[]){
    int count=1;
    int i;
    System.out.println("The frequency of each element in sting is:");
    for(i=0; i<c.length-1; ++i){
      if(c[i]!= c[i+1]){
        System.out.println(c[i]+"= "+ count);
        count=1;
      }else{
        ++count;
      }
    }
    /* Printing the count of the last element */
    System.out.println(c[i]+"= "+count);
  }
}
