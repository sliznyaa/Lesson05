public class Lesson05 {
    public static void main (String[]args){
        int a = 10;
        do {
            System.out.println(a);
            a++;
        }while(a<10);
        System.out.println("_______________________________");
        for (int i = 0; i < 10; i+=2){ // напишет только парные числа
            System.out.println(i);
            //randomNum++;
        }
        for (int i = 1; i < 10; i+=2){ // напишет только не парные числа
            System.out.println(i);
            //randomNum++;
        }
    }
}
