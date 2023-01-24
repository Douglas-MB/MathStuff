import java.util.ArrayList;

public class Main {
    static int x=0;
    int exp;

    public int limit(int i){

        return (3 + 4*i);
    }

    public int seqA(int n, int a){
        exp = n*x +a;
        x++;
        return exp;
    }

    public int seqB(int n, int a){
        exp = n*x*x + a;
        x++;
        return exp;
    }

    public int seqC(int n, int a){
        exp = n*x*x*x + a;
        x++;
        return exp;
    }
    public int seqD(int n, int a){
        exp = n*x*x*x*x + a;
        x++;
        return exp;
    }
    public int seqE(int n, int a){
        exp = n*x*x*x*x*x + a;
        x++;
        return exp;
    }


    public static void main(String[] args)
    {
        MyTools.clean();

        ArrayList<ArrayList<Integer>> valueListA = new ArrayList<>();
        ArrayList<Integer> valueListB;

        Main test = new Main();
        int n=0;
        int y=0;
        int limit = test.limit(y);
        int aux=0;

        System.out.println();
        while(y<=4) {

            for (int i = 0; i <= limit/(y+1); i++) {
                valueListB = new ArrayList<>();
                for (int j = 0; j < 8; j++) {
                    if(y==1){
                        aux = test.seqB(n,1);
                    }else if(y==2){
                        aux = test.seqC(n,1);
                    } else if (y==3) {
                        aux = test.seqD(n,1);
                    } else if (y==4) {
                        aux = test.seqE(n,1);
                    } else{
                    aux = test.seqA(n,1);
                    }

                    valueListB.add(aux);
                }
                valueListA.add(valueListB);
                n++;
                Main.x = 0;
            }
            n=0;
            y++;
            limit = test.limit(y);
        }

        for (int i = 0; i < valueListA.size(); i++) {
            System.out.printf("n = %04d: ",i+1);
            for (int j = 0; j < 8; j++) {
                System.out.printf(" %05d ",valueListA.get(i).get(j));
            }

            n = n+1;
            System.out.println();
        }
        System.out.println();
        int auxB;
        n=1;
        for (int i = 0; i < valueListA.size(); i++) {
            System.out.printf("n: %04d|", n);
            for (int j = 0; j <8; j++) {
                auxB = j +1;
                if(auxB>= 8){
                    auxB = j;
                }
                aux = valueListA.get(i).get(j) - valueListA.get(i).get(auxB);
                System.out.printf(" %04d ", -(aux));
            }
            System.out.println();
            n++;
        }

    }
}