
package src.main.javafiles;

public class Main {

    // Задача № 3
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[4];
            abc[0] = 1;
            abc[1] = 2;
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
     }
     
    // Задача № 2
    public void task2(){

        int[] intArray = new int[9];
        intArray[8]  =  8;
        int d = 1;
        try {
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
