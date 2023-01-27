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
        int steps=0;

        steps++; //aux
        steps++; //aux

        int n;
        steps++;
        n=number;
        steps++;
        int cnt;
        steps++;
        cnt=0;
        steps++;

        steps++;
        while(number>=2){
            if(number%n-- ==0){
                steps++;
                ++cnt;
                steps++;

                steps++;
                if (cnt>2){
                    steps++;
                    number--;
                    steps++;
                    n = number;
                    steps++;
                    cnt=0;
                    steps++;
                }
            }

            steps++;
            if (n==1 && cnt <2){
               array[i] = number;
               i++;

               steps++;
               number--;
               steps++;
               n = number;
               steps++;
               cnt=0;
            }
        }
        System.out.println("Classic' steps:  "+ decimalForm(breakNum(steps)));
    }

    public int[] genBetterPrimeNum(int limit){

        int steps=0;
        steps++;
        steps++;
        int[] auxArray = new int[size(limit)];
        int i=0;

        int aux;
        steps++;

        steps++;
        if (limit<=2){
            steps++;
            System.out.println("Your number is the prime 2 or a number less than 2");
            steps++;
            System.out.println("Better steps:  "+ decimalForm(breakNum(steps)));

            auxArray[i] = 2;
            return auxArray;
        }
        steps++;
        if(limit%2==0){
            limit--;
            steps++;
        }

        aux = limit-2;
        steps++;

        steps++;
        if (aux==1){

            steps++;
            auxArray[0] = 3;
            steps++;
            auxArray[1] = 2;

            steps++;
            System.out.println("Better steps:  "+ decimalForm(breakNum(steps)));
            System.out.println(Arrays.toString(auxArray));
            return auxArray;
        }

        steps++;
        while(limit>2){

            steps++;
            if (limit % aux == 0){
                steps++;
                limit = limit -2;

            }else{
                steps++;
                aux = aux - 2;
                steps++;
                if (aux==1){
                    auxArray[i] = limit;
                    i++;

                    steps++;
                    limit = limit - 2;
                    steps++;
                    if (limit<=3){
                        auxArray[i++] = 3;
                        auxArray[i] = 2;

                        steps++;
                        System.out.println("Better steps:  "+ decimalForm(breakNum(steps)));

                        return auxArray;
                    }
                    steps++;
                    aux = limit - 2;
                }
            }
        }
        steps++;
        System.out.println("Better steps:  "+ decimalForm(breakNum(steps)));
        return auxArray;
    }

    public static void main(String[] args){
        PrimeNumber test = new PrimeNumber();
        test.genClassicPrimeNum(9999);
        test.genBetterPrimeNum(9999);
    }
}
