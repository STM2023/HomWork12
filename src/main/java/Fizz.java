public class Fizz {
    private StringBuilder resolt = new StringBuilder();
    private int counter;
    private int value;
    public  synchronized void fizz() throws InterruptedException  {
        //System.out.println("поток A fizz");

        while(counter <= value){
            if(counter % 3==0&&counter % 5!=0){

                // System.out.println("поток A   =" + counter);
                resolt.append("fizz") ;
                if(counter == value){
                    resolt.append(".") ;
                } else{
                    resolt.append(", ") ;
                }
                //printResolt();

                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
    public  synchronized void buzz() throws InterruptedException {
        //System.out.println("поток B  buzz");
        while(counter<= value){
            if(counter % 5 ==0&& counter % 3!=0){

                //  System.out.println("поток B =" + counter);
                resolt.append("buzz") ;
                if(counter == value){
                    resolt.append(".") ;
                } else{
                    resolt.append(", ") ;
                }
                // printResolt();

                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
    public  synchronized void fizzbuzz() throws InterruptedException {
        //System.out.println("поток C  fizzbuzz");
        while(counter <=value){
            if(counter % 3==0 && counter % 5 ==0){

                //  System.out.println("поток C =" + counter);

                resolt.append("fizzbuzz") ;
                if(counter == value){
                    resolt.append(".") ;
                } else{
                    resolt.append(", ") ;
                }
                //  printResolt();

                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }

    public  synchronized void number() throws InterruptedException {
        //System.out.println("поток D  number");
        while(counter <= value){
            if(counter % 3!=0 && counter % 5 !=0){

                //  System.out.println("поток D =" +counter);
                resolt.append(counter) ;
                if(counter == value){
                    resolt.append(".") ;
                } else{
                    resolt.append(", ") ;
                }
                // printResolt();

                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
    public Fizz(int value,int counter){
        this.value=value;
        this.counter=counter;
    }
    public void printResolt(){
        System.out.println(resolt.toString());
    }
}

