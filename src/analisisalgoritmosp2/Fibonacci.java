package analisisalgoritmosp2;

public class Fibonacci {

    private String ar[][];
    private int cont1 = 0;
    private int cont2 = 0;

    public Fibonacci() {
        
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }
    

    public void fibonacciI(int n) {
        cont1 = 0;
        ar = new String[n][2];
        int num = 0; 
        cont1++;
        int aux2 = 1; 
        cont1++;
        int aux1 = 1;
        cont1++;
        ar[0][0] = String.valueOf(aux1);
        ar[0][1] = String.valueOf(cont1);
        cont1++;
        for (int i = 0; i < n-1 ; i++) {
            cont1++;
            cont1++;
            num = aux1 + aux2; cont1++;
            aux2 = aux1; cont1++;
            aux1 = num; cont1++;
            ar[i+1][0] = String.valueOf(num);
            ar[i+1][1] = String.valueOf(cont1);
        }
        cont1++;
        DocExcel ex = new DocExcel(ar,"FiboIterativo");
    }

    public int fibonacciR(int n) {
        //cont2=0;
        cont2++;
        cont2++;
        cont2++;
        if (n == 0 || n == 1) {
            cont2++;
            return 1;
        } else {
            cont2++;
            return fibonacciR(n-1) + fibonacciR(n-2);
        }
    }
}
