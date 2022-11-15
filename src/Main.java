import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double arr[] = new double[n];
        for (int i=0; i < n; i++) {
            arr[i]=Math.random();
        }
        Minimum value=new Minimum();
        /*value.minMax(arr,n);
        value.bubble(arr);
        int rem[]={2,3,5,3,6,3};
        value.remove(rem,3);
        value.count("hellool");
        //value.prime(2,100);
        //System.out.println(value.unique("helloeh"));
        for(int i=2;i<=100;i++){
            if(value.prime(i)){
                System.out.print(i+" " );
            }
        }*/
        int curent[]={1,2,3,4,5,6};
        value.even(curent);
        System.out.println("Hello world!");
    }
}