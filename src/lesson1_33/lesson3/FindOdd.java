package lesson1_33.lesson3;

public class FindOdd {

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=1000;i+=2){
            System.out.println("Found");
            sum+=i;
        }
        if (sum*5>5000) System.out.println("Bigger");
        else System.out.println("Smaller or equal");
    }
    
}
