package listas.array_ArrayList.quarentaNove;

public class Matriz {
    private float matriz[][] = new float[2][2];

    public Matriz(float n1, float n2, float n3, float n4){
        matriz[0][0] = n1;
        matriz[0][1] = n2;
        matriz[1][0] = n3;
        matriz[1][1] = n4;
    }

    public float determinante(){
        return (matriz[0][0]*matriz[1][1]) - (matriz[0][1]*matriz[1][0]);
    }

    public void visualizarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
