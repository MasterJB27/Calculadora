import java.util.Scanner;

public class Calculadora {

    public static void main (String [] args){
      int ing;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA SUMA
      double sum1=0, sum2=0, suma=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA RESTA
      double res1=0, res2=0, resta=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA MULTIPLICACION
      double mul1=0, mul2=0, multi=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA DIVISON
      double div1=0, div2=0, divi=0;
      //DECLARACION DE LOS ARRAYS QUE SE USARAN PARA LA BITACORA
      double[] sumas = new double[20];
      double[] restas = new double[20];
      double[] ml = new double[20];
      double[] dv = new double[20];
      //ESTE SCANNER SERVIRA PARA LEER LA OPCION QUE SE INGRESARA
      Scanner in = new Scanner(System.in);
      /*EN ESTA PARTE SE USA UN CICLO DO WHILE PARA PODER REPETIR EL FLUJO DEL
      PROGRAMA CUANTAS VECES QUERAMOS*/

      do{
      /*EN LOS SIGUIENTES TEXTOS SE REPRESENTA EL MENU EN DONDE SE ENCUENTRAN
      LAS OPCIONES QUE EL USUARIO PODRA ELEGIR*/
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

          Scanner n1 = new Scanner(System.in);
          Scanner n2 = new Scanner(System.in);
          System.out.print("Ingrese primer numero: "); sum1= n1.nextDouble();
          System.out.print('\n');
          System.out.print("Ingrese segundo numero: "); sum2= n2.nextDouble();
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

            Scanner r1 = new Scanner(System.in);
            Scanner r2 = new Scanner(System.in);
            System.out.print("Ingrese primer numero: "); res1= r1.nextDouble();
            System.out.println('\n');
            System.out.print("Ingrese segundo numero: "); res2= r2.nextDouble();
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

              Scanner m1 = new Scanner(System.in);
              Scanner m2 = new Scanner(System.in);
              System.out.print("Ingrese primer numero: "); mul1= m1.nextDouble();
              System.out.println('\n');
              System.out.print("Ingrese segundo numero: "); mul2= m2.nextDouble();
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

                Scanner d1 = new Scanner(System.in);
                Scanner d2 = new Scanner(System.in);
                System.out.print("Ingrese numero dividendo: "); div1= d1.nextDouble();
                System.out.println('\n');
                System.out.print("Ingrese numero divisor: "); div2= d2.nextDouble();
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
                case 5:
                System.out.println("Usted realizó las siguientes operaciones: ");
                System.out.println("Las operaciones que usted realizo son: "+'\n');

                  sumas[0]=sum1;
                  sumas[1]=sum2;
                  System.out.println(sumas[0] +" + " +sumas[1] +" = "+suma);

                  restas[0]=res1;
                  restas[1]=res2;
                  System.out.println(restas[0] +" - " +restas[1] +" = "+resta);

                  ml[0]=mul1;
                  ml[1]=mul2;
                  System.out.println(ml[0] +" * " +ml[1] +" = "+multi);

                  dv[0]=div1;
                  dv[1]=div2;
                  System.out.println(dv[0] +" / " +dv[1] +" = "+divi);

                System.out.println("Presione \"Enter\" para desplegar nuevamente el Menu Principal");
                String ingrese5 = " ";
                Scanner ot5 = new Scanner(System.in);
                ingrese5 = ot5.nextLine();
                System.out.println('\n');
                break;
              }
            }while(ing!=7);
      }
    }
