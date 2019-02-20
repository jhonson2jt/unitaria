package tgd;

import java.util.Scanner;

public class TGD {

    public static void main(String[] args) {

        metodos m = new metodos();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");

        int n = leer.nextInt(), x;

        String estudiante[] = new String[n];
        int codigo[] = new int[n];
        float nota1[] = new float[n];
        float nota2[] = new float[n];
        float nota3[] = new float[n];
        float definitiva[] = new float[n];

        m.llenarVectores(n, codigo, nota1, nota2, nota3);
        int op;
        do {
            System.out.println("\n");
            System.out.println("*** MENU ***");
            System.out.println("1. Ver notas por estudiante");
            System.out.println("2. Mayor definitiva");
            System.out.println("3. Menor definitiva");
            System.out.println("4. Visualizar promedios");
            System.out.println("0. Salir");
            System.out.print("Favor ingrese una opcion: ");
            op = leer.nextInt();
            System.out.println("\n");

            switch (op) {
                case 1:
                    System.out.print("Ingrese el codigo del estudiante a buscar: ");
                    x = leer.nextInt();
                    int p = m.buscarPosicion(x, codigo);
                    if (p != (-1)) {
//                        System.out.println("La posicion del estuadiante es: " + p);
                         m.imprimir(p, codigo, nota1, nota2, nota3, definitiva);
                    } else {
                        System.out.println("El estudiante con codigo " + x + " no existe");
                    }
                    break;
                case 2:
                    m.mayorNota(codigo, definitiva);
                    break;
                case 3:
                    m.menorNota(codigo, definitiva);
                    break;
                case 4:
                    System.out.println(" \t\t => Promedio <=");
                    m.promedio(nota1, nota2, nota3, definitiva);
                    m.imprimir(-1, codigo, nota1, nota2, nota3, definitiva);
                    break;
            }

        } while (op != 0);

//        for (int j = 0; j < n; j++) {
//            System.out.println("Estudiante " + j + " " + nota3[j]);
//        }
    }

}
