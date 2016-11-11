import java.util.Scanner;

public class Calculadora {

    public static void main (String [] args){
      //LAS VARIABLES QUE ESTAN DECLARADAS EN -1 SERVIRAN PARA INDICAR EL INDICE
      //EN DONDE SE GUARDARA LA INFORMACION DE LAS OPERACIONES QUE SE REALIZARAN
      int ing, a1=-1, a2=-1, a3=-1, a4=-1;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA SUMA
      double sum1=0, sum2=0, suma=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA RESTA
      double res1=0, res2=0, resta=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA MULTIPLICACION
      double mul1=0, mul2=0, multi=0;
      //DECLARACION DE LAS VARIABLES QUE SE USARAN PARA LA DIVISON
      double div1=0, div2=0, divi=0;
      //DECLARACION DE LOS ARRAYS QUE SE USARAN PARA LA BITACORA
      double[] sumas = new double[50];
      double[] restas = new double[50];
      double[] ml = new double[50];
      double[] dv = new double[50];
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
//ESTE PRIMER CASE SERA UTILIZADO PARA REALIZAR LAS OPERACIONES DE SUMA
          case 1:
          //ESTA OPERACION INDICA EL INDICE DONDE SE GUARDARA LA OPERACION
          a1=a1+1;
          System.out.println("Selecciono la opcion \"1. Suma de dos numeros\"");
          //EN ESTA PARTE ES DONDE EL USUARIO INGRESARA LOS NUMEROS A SUMAR
          Scanner n1 = new Scanner(System.in);
          Scanner n2 = new Scanner(System.in);
          System.out.print("Ingrese primer numero: "); sum1= n1.nextDouble();
          System.out.print('\n');
          System.out.print("Ingrese segundo numero: "); sum2= n2.nextDouble();
          //AQUI SE REALIZA LA OPERACION CORRESPONDIENTE
          suma= sum1+sum2;
//CUANDO LA OPERACION SE HALLA REALIZADO, LA INFORMACION DE ESTA SE ALMACENARA EN LA LINEA 55, PARA LUEGO SER ENVIADA A LA BITACORA
          sumas[a1]=sum1+"+"+sum2+"="+""+suma;
//ESTA PARTE DEL PROGRAMA PERMITE QUE EL FLUJO DEL PROGRAMA SE DETENGA HASTA QUE EL USUARIO PRESIONE LA TECLA "ENTER"
          System.out.println('\n');
          System.out.println("El resultado de la suma es: "+suma +'\n');
          System.out.println("Presione la tecla \"ENTER\" para desplegar nuevamente el Menu Principal");
          String ingrese1 = " ";
          Scanner ot1 = new Scanner(System.in);
          ingrese1 = ot1.nextLine();
          System.out.println('\n');
          break;

//ESTE SEGUNDO CASE SE UTILIZARA PARA REALIZAR LAS RESTAS
          case 2:
//ESTA OPERACION INDICA EL INDICE DONDE SE GUARDARA LA OPERACION
          a2=a2+1;
            System.out.println("Selecciono la opcion \"2. Resta de dos numeros\"");
//EN ESTA PARTE ES DONDE EL USUARIO INGRESARA LOS NUMEROS A RESTAR
            Scanner r1 = new Scanner(System.in);
            Scanner r2 = new Scanner(System.in);
            System.out.print("Ingrese primer numero: "); res1= r1.nextDouble();
            System.out.println('\n');
            System.out.print("Ingrese segundo numero: "); res2= r2.nextDouble();
            //AQUI SE REALIZA LA OPERACION CORRESPONDIENTE
            resta= res1-res2;
//CUANDO LA OPERACION SE HALLA REALIZADO, LA INFORMACION DE ESTA SE ALMACENARA EN LA LINEA 80, PARA LUEGO SER ENVIADA A LA BITACORA
            restas[a2]=res1+"-"+res2+"="+""+resta;
//ESTA PARTE DEL PROGRAMA PERMITE QUE EL FLUJO DEL PROGRAMA SE DETENGA HASTA QUE EL USUARIO PRESIONE LA TECLA "ENTER"
            System.out.println('\n');
            System.out.println("El resultado de la resta es: "+resta +'\n');
            System.out.println("Presione la tecla \"ENTER\" para desplegar nuevamente el Menu Principal");
            String ingrese2 = " ";
            Scanner ot2 = new Scanner(System.in);
            ingrese2 = ot2.nextLine();
            System.out.println('\n');
            break;

              case 3:
//ESTA OPERACION INDICA EL INDICE DONDE SE GUARDARA LA OPERACION
              a3=a3+1;
              System.out.println("Selecciono la opcion \"3. Multiplicacion de dos numeros\"");
//EN ESTA PARTE ES DONDE EL USUARIO INGRESARA LOS NUMEROS A MULTIPLICAR
              Scanner m1 = new Scanner(System.in);
              Scanner m2 = new Scanner(System.in);
              System.out.print("Ingrese primer numero: "); mul1= m1.nextDouble();
              System.out.println('\n');
              System.out.print("Ingrese segundo numero: "); mul2= m2.nextDouble();
//AQUI SE REALIZA LA OPERACION CORRESPONDIENTE
              multi= mul1*mul2;
//CUANDO LA OPERACION SE HALLA REALIZADO, LA INFORMACION DE ESTA SE ALMACENARA EN LA LINEA 104, PARA LUEGO SER ENVIADA A LA BITACORA
              ml[a3]=mul1+"*"+mul2+"="+""+multi;
//ESTA PARTE DEL PROGRAMA PERMITE QUE EL FLUJO DEL PROGRAMA SE DETENGA HASTA QUE EL USUARIO PRESIONE LA TECLA "ENTER"
              System.out.println('\n');
              System.out.println("El resultado de la resta es: "+multi +'\n');
              System.out.println("Presione la tecla \"ENTER\" para desplegar nuevamente el Menu Principal");
              String ingrese3 = " ";
              Scanner ot3 = new Scanner(System.in);
              ingrese3 = ot3.nextLine();
              System.out.println('\n');
              break;

                case 4:
//ESTA OPERACION INDICA EL INDICE DONDE SE GUARDARA LA OPERACION
                a4=a4+1;
                System.out.println("Selecciono la opcion \"4. Division de dos numeros\"");
//EN ESTA PARTE ES DONDE EL USUARIO INGRESARA LOS NUMEROS A DIVIDIR
                Scanner d1 = new Scanner(System.in);
                Scanner d2 = new Scanner(System.in);
                System.out.print("Ingrese numero dividendo: "); div1= d1.nextDouble();
                System.out.println('\n');
                System.out.print("Ingrese numero divisor: "); div2= d2.nextDouble();
                System.out.println('\n');
//EN ESTA PARTE EL PROGRAMA EVALUARA SI EL NUMERO DIVISOR ES DIFERENTE DE "0"
                if (div2!=0){
//SI EL NUMERO DIVISOR ES DIFERENTE DE "0", ENTONCES EL PROGRAMA REALIZARA LA OPERACION DE FORMA CORRECTA
                  divi= div1/div2;
                  System.out.println("El resultado de la resta es: "+divi +'\n');
//CUANDO LA OPERACION SE HALLA REALIZADO, LA INFORMACION DE ESTA SE ALMACENARA EN LA LINEA 132, PARA LUEGO SER ENVIADA A LA BITACORA
                  dv[a4]=div1+"/"+div2+"="+""+divi;

                }
//DE LO CONTARIO SI EL NUMERO DIVISOR ES IGUAL A "0" ENTONCES SE IMPRIMIRA UN ERROR
                else{
                  System.out.println("ERROR: La division entre 0 no es permitida");
                }
//ESTA PARTE DEL PROGRAMA PERMITE QUE EL FLUJO DEL PROGRAMA SE DETENGA HASTA QUE EL USUARIO PRESIONE LA TECLA "ENTER"
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
