import java.util.Arrays;

public class PrimeNumber {

    private int size(int range){
        if (range<=3){
            return range;
        }else if(range<11){
            range = 4;
            return range;
        } else if (range<=100) {
            return 27;
        }
        return range/2;
    }

    private String breakNum(int value){
        return ""+value;
    }
    public String decimalForm(String aux){
        String decNum="";
        int cnt=0;

        for (int i = aux.length()-1; i >=0; i--) {
            cnt++;
            decNum = aux.charAt(i) + decNum;

            if(cnt==3 && i!=0){
                decNum =  "," + decNum;

                cnt =0;
            }
        }
        return decNum;
    }
    public void genClassicPrimeNum(int number){


        int[] array = new int[size(number)];
        int i=0;


        int n;
        n=number;
        int cnt;
        cnt=0;

        while(number>=2){
            if(number%n-- ==0){
                ++cnt;

                if (cnt>2){
                    number--;
                    n = number;
                    cnt=0;
                }
            }

            if (n==1 && cnt <2){
               array[i] = number;
               i++;

               number--;
               n = number;
               cnt=0;
            }
        }
    }

    public int[] genBetterPrimeNum(int limit){

        int[] auxArray = new int[size(limit)];
        int i=0;

        int aux;

        if (limit<=2){
            System.out.println("Your number is the prime 2 or a number less than 2");

            auxArray[i] = 2;
            return auxArray;
        }
        if(limit%2==0){
            limit--;
        }

        aux = limit-2;

        if (aux==1){

            auxArray[0] = 3;
            auxArray[1] = 2;

            System.out.println(Arrays.toString(auxArray));
            return auxArray;
        }

        while(limit>2){

            if (limit % aux == 0){
                limit = limit -2;

            }else{
                aux = aux - 2;
                if (aux==1){
                    auxArray[i] = limit;
                    i++;

                    limit = limit - 2;
                    if (limit<=3){
                        auxArray[i++] = 3;
                        auxArray[i] = 2;


                        return auxArray;
                    }
                    aux = limit - 2;
                }
            }
        }
        return auxArray;
    }

    public static void main(String[] args){
        PrimeNumber test = new PrimeNumber();

        long betterStart = System.nanoTime();
        test.genBetterPrimeNum(99999);
        long betterEnd =  System.nanoTime();
        System.out.println("Better: "+ (betterEnd - betterStart)/(1e+9));


        long classicStart =  System.nanoTime();
        test.genClassicPrimeNum(99999);
        long classicEnd =  System.nanoTime();
        System.out.println("Classic: "+ (classicEnd - classicStart)/(1e+9));

        }
}
