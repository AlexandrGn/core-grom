package lesson1_33.lesson24.firstExample;

public class Demo <T>{

//    private printUser(User user){
//        //print
//    }

//    private printSolution(Solution Solution){
//        //print
//    }

//    private printChannel(Channel Channel){
//        //print
//    }


    public void print(T t){
        System.out.println(t);
    }

    private static void calculatePrice(AbstractOrder abstractOrder){
        System.out.println(abstractOrder.getPrice());
    }


    public static void main(String[] args) {
        calculatePrice(new FirstOrder());
        calculatePrice(new SecondOrder());
    }
}
