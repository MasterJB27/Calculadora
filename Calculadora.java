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
          case 2:
            System.out.println("Selecciono la opcion \"2. Resta de dos numeros\"");
            double res1=0, res2=0, resta=0;
            Scanner r1 = new Scanner(System.in);
            Scanner r2 = new Scanner(System.in);
            System.out.println("Ingrese primer numero: ");
            res1= r1.nextInt();
            System.out.println('\n');
            System.out.println("Ingrese segundo numero: ");
            res2= r2.nextInt();
            resta= res1-res2;
            System.out.println('\n');
            System.out.println("El resultado de la resta es: "+resta +'\n');
            System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
            String ingrese2 = " ";
            Scanner ot2 = new Scanner(System.in);
            ingrese2 = ot2.nextLine();
            System.out.println('\n');
            break;
              case 3:
              System.out.println("Selecciono la opcion \"3. Multiplicacion de dos numeros\"");
              double mul1=0, mul2=0, multi=0;
              Scanner m1 = new Scanner(System.in);
              Scanner m2 = new Scanner(System.in);
              System.out.println("Ingrese primer numero: ");
              mul1= m1.nextInt();
              System.out.println('\n');
              System.out.println("Ingrese segundo numero: ");
              mul2= m2.nextInt();
              multi= mul1*mul2;
              System.out.println('\n');
              System.out.println("El resultado de la resta es: "+multi +'\n');
              System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
              String ingrese3 = " ";
              Scanner ot3 = new Scanner(System.in);
              ingrese3 = ot3.nextLine();
              System.out.println('\n');
              break;
                case 4:
                System.out.println("Selecciono la opcion \"4. Division de dos numeros\"");
                double div1=0, div2=0, divi=0;
                Scanner d1 = new Scanner(System.in);
                Scanner d2 = new Scanner(System.in);
                System.out.println("Ingrese numero dividendo: ");
                div1= d1.nextInt();
                System.out.println('\n');
                System.out.println("Ingrese numero divisor: ");
                div2= d2.nextInt();
                System.out.println('\n');
                if (div2!=0){
                  divi= div1/div2;
                  System.out.println("El resultado de la resta es: "+divi +'\n');
                }
                else{
                  System.out.println("ERROR: La division entre 0 no es permitida");
                }
                System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
                String ingrese4 = " ";
                Scanner ot4 = new Scanner(System.in);
                ingrese4 = ot4.nextLine();
                System.out.println('\n');
                break;
        }
      }
    }
