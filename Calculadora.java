import java.util.Scanner;

public class Calculadora {

    public static void main (String [] args){
      int ing;
      Scanner in = new Scanner(System.in);
      System.out.println("MENU");
      System.out.println("1. Suma de dos numeros");
      System.out.println("2. Resta de dos numeros");
      System.out.println("3. Multiplicacion de dos numeros");
      System.out.println("4. Division de dos numeros");
      System.out.println("5. Ver Bitacora");
      System.out.println("6. Borrar Bitacora");
      System.out.println("7. Salir");
        System.out.println("Ingrese una opcion");
        ing = in.nextInt();
        switch (ing) {
          case 1:
          System.out.println("Selecciono la opcion \"1. Suma de dos numeros\"");
          double sum1=0, sum2=0, suma=0, op=0;
          Scanner n1 = new Scanner(System.in);
          Scanner n2 = new Scanner(System.in);
          System.out.println("Ingrese primer numero: ");
          sum1= n1.nextInt();
          System.out.println('\n');
          System.out.println("Ingrese segundo numero: ");
          sum2= n2.nextInt();
          suma= sum1+sum2;
          System.out.println('\n');
          System.out.println("El resultado de la suma es: "+suma +'\n');
          System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
          String ingrese1 = " ";
          Scanner ot1 = new Scanner(System.in);
          ingrese1 = ot1.nextLine();
          System.out.println('\n');
          break;
        }
      }
    }
