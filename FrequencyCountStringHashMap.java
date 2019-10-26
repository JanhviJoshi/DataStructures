import java.util.*;

class FrequencyCountStringHashMAp{

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string:" );
    String s= sc.nextLine();

    HashMap<Character, Integer> hm= new HashMap<>();
    for(int i=0; i<s.length(); ++i){
      if(hm.containsKey(s.charAt(i))){
        Integer frequency= hm.get(s.charAt(i));
        frequency= frequency+1;
        hm.put(s.charAt(i), frequency);
      }else{
        hm.put(s.charAt(i), 1);
      }
    }
    for (Character name : hm.keySet()){
            if(name!= ' '){
              Integer val = hm.get(name);
              System.out.println("Element = " + name + ",Count = " + val);
            }
        }

  }
}
