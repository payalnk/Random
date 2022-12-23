//Write a code to find pairs of all double-digit numbers with consecutive digits and a difference of 9
import java.util.*;
class difference{
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> num_pairs = new ArrayList<>();

        //Split all the 2-digit numbers to check whether they have consecutive digits 
        for (int i=10;i<=99;i++){
            int x = i%10;
            int y = i/10;
            if(Math.abs(y-x) == 1){
                l.add(i);
            }
        }

        //Check if the difference between these pairs is 9
        for(int i=0;i<l.size()-1;i++){
            List<Integer> pairs = new ArrayList<>();
            if(Math.abs(l.get(i+1)-l.get(i)) == 9){
                pairs.add(l.get(i));
                pairs.add(l.get(i+1));
                num_pairs.add(pairs);
            }
        }
        System.out.println(num_pairs);
    }
}
    