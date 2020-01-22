import java.util.Scanner;

public class MyThread extends Thread {

    private int a=1;
    private int b=1;
    private int sum;
    Scanner in=new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Введіть кількість цифр");
        int s=in.nextInt();
        System.out.print(a+" "+b+" ");
        for (int i=s;i>2;i--) {



            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            sum = a + b;
            System.out.print(sum+" ");
                a = b;
                b = sum;
        }
    }
}
