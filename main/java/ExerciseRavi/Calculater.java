package ExerciseRavi;

public class Calculater {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
   Calculater ram = new Calculater();
        System.out.println(ram.add(2,4));
        System.out.println(ram.add(2,4,5));
        System.out.println(ram.add(3,7.6));
    }
}
