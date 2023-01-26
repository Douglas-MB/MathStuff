import java.util.Arrays;

public class PrimeNumber {

    public int[] breakNum(int value){
        int divDec=1;
        int restHigh;
        int restLow;
        int[] aux =  new int[11];
        int i =0;
        int copyValue = value;

        while(divDec<value){
            divDec = divDec*10;
        }

        while (copyValue>10) {
            divDec = divDec/10;
            restHigh = copyValue;
            restLow = restHigh % divDec;
            aux[i] = ((restHigh - restLow) / divDec);
            copyValue = restLow;
            i++;
            if (copyValue<10){
                aux[i] = copyValue;
                break;
            }
        }
        return aux;
    }
    public String[] decimalForm(int[] brokenNum){

        String[] aux = new String[15];
        int getInt;

        for (int i = 0; i < 10; i++) {
            getInt = brokenNum[i];
            aux[i] = getInt+"";
        }

        return aux;
    }
    public void genClassicPrimeNum(int aux){
        int[] array = new int[aux];
        int i=0;
        int steps=0;

        steps++; //aux
        steps++; //aux

        int n;
        steps++;
        n=aux;
        steps++;
        int cnt;
        steps++;
        cnt=0;
        steps++;

        steps++;
        while(aux>=2){
            if(aux%n-- ==0){
                steps++;
                ++cnt;
                steps++;

                steps++;
                if (cnt>2){
                    steps++;
                    aux--;
                    steps++;
                    n = aux;
                    steps++;
                    cnt=0;
                    steps++;
                }
            }

            steps++;
            if (n==1 && cnt <2){
               array[i] = aux;
               i++;

               steps++;
               aux--;
               steps++;
               n = aux;
               steps++;
               cnt=0;
            }
        }
        System.out.println("Classic' steps:  "+steps);
    }

    public int[] genBetterPrimeNum(int limit){

        int steps=0;
        steps++;
        steps++;
        int[] auxArray = new int[limit-1];
        int i=0;

        int aux;
        steps++;

        steps++;
        if (limit<=2){
            steps++;
            System.out.println("Your number is the prime 2 or a number less than 2");
            steps++;
            System.out.println("Better' steps:  "+steps);

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
            System.out.println("Better' steps:  "+steps);
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
                        System.out.println("Better' steps:  "+steps);

                        return auxArray;
                    }
                    steps++;
                    aux = limit - 2;
                }
            }
        }
        steps++;
        System.out.println("Better' steps:  "+steps);
        return auxArray;
    }

    public static void main(String[] args){
        PrimeNumber test = new PrimeNumber();
        int aux = MyTools.rng(999999);
        String auxAux = aux+"";
        String tet="";

        for (int i = 0; i <auxAux.length() ; i++) {
            tet = tet +  test.breakNum(aux)[i];
        }

        System.out.println("aux:  "+aux);
        System.out.println("tet:  "+tet);
        if(auxAux.equals(tet)){
            System.out.println("CORRECT");
        }
    }
}
