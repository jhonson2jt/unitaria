package tgd;

import java.util.Scanner;

public class metodos {

    public void llenarVectores(int n, int codigo[], float nota1[], float nota2[], float nota3[]) {

        Scanner leer = new Scanner(System.in);
        float d;
        int i = 0, x;

        while (i < n) {
//            System.out.print("Ingrese nombre del estudiante: " + i);
//            estudiante[i] = leer.nextLine();
            System.out.print("Ingrese codigo del estudiante " + (i + 1) + ": ");
            x = leer.nextInt();
            while (validarCodigoEstudiante(x, codigo)) {
                System.out.print("El estudiante con codigo " + x + " ya existe, favor ingrese otro codigo: ");
                x = leer.nextInt();
            }
            codigo[i] = x;
            System.out.print("Ingrese nota 1 del estudiante " + (i + 1) + ": ");
            d = leer.nextFloat();
            while (!validarNota(d)) {
                System.out.print("Nota no valida => Ingrese nota 1 del estudiante " + (i + 1) + ": ");
                d = leer.nextFloat();
            }
            nota1[i] = d;
            System.out.print("Ingrese nota 2 del estudiante " + (i + 1) + ": ");
            d = leer.nextFloat();
            while (!validarNota(d)) {
                System.out.print("Nota no valida => Ingrese nota 2 del estudiante " + (i + 1) + ": ");
                d = leer.nextFloat();
            }
            nota2[i] = d;
            System.out.print("Ingrese nota 3 del estudiante " + (i + 1) + ": ");
            d = leer.nextFloat();
            while (!validarNota(d)) {
                System.out.print("Nota no valida => Ingrese nota 3 del estudiante " + (i + 1) + ": ");
                d = leer.nextFloat();
            }
            nota3[i] = d;
            i++;
        }

    }

    public void promedio(float nota1[], float nota2[], float nota3[], float definitiva[]) {

        float suma = 0;
        float promedio = 0;

        for (int i = 0; i < nota1.length; i++) {
            suma = nota1[i] + nota2[i] + nota3[i];
            promedio = suma / 3;
            definitiva[i] = promedio;
            suma = 0;
            promedio = 0;
        }
    }

    public void imprimir(int x, int codigo[], float nota1[], float nota2[], float nota3[], float definitiva[]) {
        System.out.println("Co. estudiante\tNota 1\tNota 2\tNota 3\tDefinitiva");

        if (x != (-1)) {
            System.out.println(codigo[x] + " \t\t" + nota1[x] + "\t" + nota2[x] + "\t" + nota3[x] + "\t" + definitiva[x]);
        } else {
            for (int i = 0; i < definitiva.length; i++) {
                System.out.println(codigo[i] + " \t\t" + nota1[i] + "\t" + nota2[i] + "\t" + nota3[i] + "\t" + definitiva[i]);
            }
        }

    }

    public boolean validarNota(float x) {
        if (x >= 0 && x <= 5.0) {
            return true;
        } else {
            return false;
        }
    }

    public int buscarPosicion(int x, int codigo[]) {
        int temp = -1;
        for (int i = 0; i < codigo.length; i++) {
            if (x == codigo[i]) {
                temp = i;
            }
        }
        return temp;
    }

    public boolean validarCodigoEstudiante(int x, int codigo[]) {
        boolean temp = false;
        for (int i = 0; i < codigo.length; i++) {
            if (codigo[i] == x) {
                temp = true;
            }
        }
        return temp;
    }

    public void mayorNota(int codigo[], float definitiva[]) {
        float mayor;
        int pos;
        mayor = definitiva[0];
        pos = 0;
        for (int f = 1; f < codigo.length; f++) {
            if (definitiva[f] > mayor) {
                mayor = definitiva[f];
                pos = f;
            }
        }
        System.out.println("El estudiente con mayor nota tiene el codigo " + codigo[pos]);
        System.out.println("Su definitiva es: " + mayor);
    }
    
    public void menorNota(int codigo[], float definitiva[]) {
        float mayor;
        int pos;
        mayor = definitiva[0];
        pos = 0;
        for (int f = 1; f < codigo.length; f++) {
            if (definitiva[f] < mayor) {
                mayor = definitiva[f];
                pos = f;
            }
        }
        System.out.println("El estudiente con menor nota tiene el codigo " + codigo[pos]);
        System.out.println("Su definitiva es: " + mayor);
    }


}
