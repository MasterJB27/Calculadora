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
      String[] sumas = new String[50];
      String[] restas = new String[50];
      String[] ml = new String[50];
      String[] dv = new String[50];
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
//ESTE CASE SE ENCARGARA DE LAS MULTIPLICACIONES
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
//ESTE CASE SE ENCARGARA DE LAS DIVISIONES
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

//ESTE CASE SE UTILIZARA PARA PODER MOSTRAR LA BITACORA O HISTORIAL DE LAS OPERACIONES QUE SE VALLAN REALIZANDO
                case 5:
                System.out.println("Usted realizo las siguientes operaciones: " +'\n');
//ESTAS VARIABLES SON LAS QUE INDICAN EL PUNTO DE INCIO DE CADA UNO DE LOS INDICES
                int cs=0, cr=0, cm=0, cd=0;
//EN ESTA PARTE EL PROGRAMA EVALUARA SI LA CONDICION SE CUMPLE Y DE SER ASI, SE EJECUTARA UN CICLO WHILE
                  while(cs<50){
//SE UTILIZO UNA SERIE DE IF EN LOS CUALES SE EVALUARA EL MOMENTO EN EL CUAL LOS INDICES YA NO CONTENGAN NINGUNA OPERACIONE
//PARA ASI PODER OMITIR ESOS INDICES
                    if(sumas[cs]==null){
                      if(restas[cr]==null){
                        if(ml[cm]==null){
                          if(dv[cd]==null){
//EN EL MOMENTO EN QUE LOS INDICES SIN UTILIZAR SEAN DESCARTADOS, EL PROGRAMA EJECUTARA LA PARTE DEL PROGRAMA QUE LO DETENDRA HASTA QUE EL USUARIO PRESIONE "ENTER"
                          System.out.println("Presione \"Enter\" para desplegar nuevamente el Menu Principal");
                            String ingrese5 = " ";
                            Scanner ot5 = new Scanner(System.in);
                            ingrese5 = ot5.nextLine();
                            System.out.println('\n');
                            break;
//DE LO CONTRARIO, SI LOS INDICE SI CONTIENEN INFORMACION GUARDADA, SE PROCEDERA A IMPRIMIR CADA UNO DE ESOS INDICES EN ESTA PARTE DONDE SE DECLARARON LOS ELESE
                          }else{
                            System.out.println(dv[cd]);
//ESTA OPERACION LO QUE PERMITE ES QUE LA POSICION DEL INDICE VALLA INCREMENTANDO HASTA QUE NO SE ENCUENTR NINGUNA INFORMACION
                          cd=cd+1;}
                        }else{
                          System.out.println(ml[cm]);
//ESTA OPERACION LO QUE PERMITE ES QUE LA POSICION DEL INDICE VALLA INCREMENTANDO HASTA QUE NO SE ENCUENTR NINGUNA INFORMACION
                          cm=cm+1;
                        }
                      }else{
                        System.out.println(restas[cr]);
//ESTA OPERACION LO QUE PERMITE ES QUE LA POSICION DEL INDICE VALLA INCREMENTANDO HASTA QUE NO SE ENCUENTR NINGUNA INFORMACION
                        cr=cr+1;
                      }

                    }else{
                      System.out.println(sumas[cs]);
//ESTA OPERACION LO QUE PERMITE ES QUE LA POSICION DEL INDICE VALLA INCREMENTANDO HASTA QUE NO SE ENCUENTR NINGUNA INFORMACION
                      cs=cs+1;
                    }

          }


break;
              }
            }while(ing!=7);
      }
    }
