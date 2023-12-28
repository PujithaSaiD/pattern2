import java.util.*;
public class Pattern2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        for(int i=0;i<p;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            list.add(n);
            list1.add(m);
        }
        for(int j=0;j<p;j++){
            for(int k=1;k<=list.get(j);k++){
                for(int l=0;l<list1.get(j);l++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        
    }
}