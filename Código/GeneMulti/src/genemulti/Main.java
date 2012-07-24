/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package genemulti;
import java.util.Random;

/**
 *
 * @author antares
 */
public class Main {

    public static void prime (int [] [] matriz){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");;
            }
            System.out.print("\n");
        }
    }

     public static void prime (int [] [] matriz, int [] [] pmatriz){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");;
            }
                System.out.print("   ");
            for (int j=0;j<pmatriz[0].length;j++){
                System.out.print(pmatriz[i][j] + " ");;
            }
            System.out.print("\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Random r = new Random();

         int [][] matriz = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
         int [][] pmatriz = {{11,13,17},{23,29,31},{33,37,41}};
         matriz[r.nextInt(3)][r.nextInt(3)]+=1;
         matriz[r.nextInt(3)][r.nextInt(3)]+=2;
         
         System.out.println("Posición de los planetas:");
         prime(matriz, pmatriz);

//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.println(i*3+j);
//             }
//         }

         int a = 1;

         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 a = matriz[i][j]==0 ? 1 * a : matriz[i][j]* pmatriz[i][j] * a;
             }
         }

         System.out.println("Salida: " + a);

}

}
