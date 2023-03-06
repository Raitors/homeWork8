import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] intMas = new int[3];
        intMas[0] = 1;
        intMas[1] = 2;
        intMas[2] = 3;
        double [] doubleMas = {1.57,7.654,9.986};
        byte [] byteMas = {1,2,3,4,5};

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] intMas = new int[3];
        intMas[0] = 1;
        intMas[1] = 2;
        intMas[2] = 3;
        double [] doubleMas = {1.57,7.654,9.986};
        byte [] byteMas = {1,2,3,4,5};

        for (int i=0; i< intMas.length;i++) {
            System.out.print( intMas[i]);
            if (i!=intMas.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i=0; i< doubleMas.length;i++) {
            System.out.print( doubleMas[i]);
            if (i!= doubleMas.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i=0; i< byteMas.length;i++) {
            System.out.print( byteMas[i]);
            if (i != byteMas.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] intMas = new int[3];
        intMas[0] = 1;
        intMas[1] = 2;
        intMas[2] = 3;
        double [] doubleMas = {1.57,7.654,9.986};
        byte [] byteMas = {1,2,3,4,5};

        for (int i=intMas.length-1; i>0 ;i--) {
            System.out.print( intMas[i]+",");
        }
        System.out.println(intMas[0]);

        for (int i=doubleMas.length-1; i>0 ;i--) {
            System.out.print( doubleMas[i]+",");
        }
        System.out.println(doubleMas[0]);

        for (int i=byteMas.length-1; i > 0 ;i--) {
            System.out.print( byteMas[i]+",");
        }
        System.out.println(byteMas[0]);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] intMas = new int[3];
        intMas[0] = 1;
        intMas[1] = 2;
        intMas[2] = 3;
        for (int i=0; i< intMas.length;i++){
            if (intMas[i] % 2!=0) {
                intMas[i]+=1;
            }
        }
        System.out.println(Arrays.toString(intMas));
    }
}