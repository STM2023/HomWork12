public class Task2 {


    public static void main(String[] args)  throws InterruptedException {
        //value =30;
        Fizz fizz= new Fizz(15,1);


        Thread threadA= new Thread(()->{
            try{
                fizz.fizz();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread threadB= new Thread(()->{
            try{
                fizz.buzz();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread threadC= new Thread(()->{
            try{
                fizz.fizzbuzz();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread threadD= new Thread(()->{
            try{
                fizz.number();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        threadA.join();
        threadB.join();
        threadC.join();
        threadD.join();

        fizz.printResolt();

    }

}


