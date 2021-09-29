package analisisalgoritmosp2;

import java.util.ArrayList;

public class Perfectos {

    private ArrayList divisores = new ArrayList();
    private String ar[][];
    private String ar2[][];
    private int cont1 = 0;
    private int cont2 = 0;
    private int aux = 0;

    public Perfectos() {
    }

    public int getCont1() {
        return cont1;
    }
    
    public int Perfecto(int n) {
        cont1 = 0;
        divisores.clear();
        // Almacena los divisores
        cont1++;
        for (int i = n - 1; i > 0; i--) {
            cont1++;
            cont1++;
            cont1++;
            if (n % i == 0) {
                cont1++;
                divisores.add(i);
            }
        }
        cont1++;
        //Hace la suma de divisores
        int suma = 0;
        cont1++;
        cont1++;
        for (int j = 0; j < divisores.size(); j++) {
            cont1++;
            cont1++;
            cont1++;
            suma = suma + Integer.valueOf(divisores.get(j).toString());
        }
        cont1++;
        if (suma == n) {
            cont1++;
            return 1; //Es perfecto
        } else {
            cont1++;
            return 0; //No es perfecto 
        }
    }
    
    public void MostrarPerfectos(int num){
        ar = new String[num][2];
        cont2=0;
        cont2++;
        int m = 1;
        cont2++;
        aux = 0; 
        cont2++;
        while ( aux < num) {
            cont2++;
            if ( this.Perfecto(m) == 1) {
                ar[aux][0] = String.valueOf(aux+1);
                ar[aux][1] = String.valueOf(cont2);
                aux++; 
                cont2++;
            }
            cont2++;
            m++;
        }
        cont2++;
        DocExcel ex = new DocExcel(ar,"MostrarPerfecto");
    }
}
