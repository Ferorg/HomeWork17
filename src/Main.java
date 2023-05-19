import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        MassGen mass1=new MassGen("HH");
        MassGen mass2=new MassGen("CC");
        MassGen mass3=new MassGen("JJ");
        MassGen mass4=new MassGen("KK");
        MassGen mass5=new MassGen("TT");
        MassGen mass6=new MassGen("RR");
        MassGen mass7=new MassGen("ZZ");
        MassGen mass8=new MassGen("xx");
        MassGen mass9=new MassGen("MM");
        MassGen mass10=new MassGen("QQ");


        Future<String> future1 =executorService.submit(mass1);
        Future<String> future2 =executorService.submit(mass2);
        Future<String> future3 =executorService.submit(mass3);
        Future<String> future4 =executorService.submit(mass4);
        Future<String> future5 =executorService.submit(mass5);
        Future<String> future6 =executorService.submit(mass6);
        Future<String> future7 =executorService.submit(mass7);
        Future<String> future8 =executorService.submit(mass8);
        Future<String> future9 =executorService.submit(mass9);
        Future<String> future10 =executorService.submit(mass10);

        try {
            String result1 = future1.get();
            String result2 = future2.get();
            String result3 = future3.get();
            String result4 = future4.get();
            String result5 = future5.get();
            String result6 = future6.get();
            String result7 = future7.get();
            String result8 = future8.get();
            String result9 = future9.get();
            String result10 = future10.get();
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            System.out.println(result6);
            System.out.println(result7);
            System.out.println(result8);
            System.out.println(result9);
            System.out.println(result10);
            
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();

    }
}