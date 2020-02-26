
package lesson1_33.lesson2;

public class SumAndDivision {

    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=1000;i++){
            sum+=i;
        }
        int cel;
        int ostatok;
        
        cel=sum/1234;
        ostatok=sum%1234;
        System.out.println(cel<ostatok);
        
    }
    
}
