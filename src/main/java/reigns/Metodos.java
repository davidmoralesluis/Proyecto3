package reigns;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class Metodos {
    
    static int pue = 50, eco= 50, igl = 50, mil = 50; //Las 4 variables que van a ser representadas más adelante.
    static int edad = 0; //Variable que cuenta las veces que se ha cumplido el bucle de juego.
    
    
    public static void menu() {   //Menú del juego.
        String opcion; //Variable que para determinar que opción escoge el jugador.
        int op = 0; //Variable para el switch.
        
        do{
            try{
                opcion = JOptionPane.showInputDialog("Bienvenido a Reigns\n\n ¿Que desea hacer?\n\n\n1.Jugar\n2.Ayuda\n3.Salir"); //String que convertiremos en un int.
                if (opcion == null){    //Si el jugador le da al botón de cancelar(devuelve un null) en vez de dar un error rompa.
                    break;
                }
                else{
                    op = Integer.parseInt(opcion);  //Variable parseada para el switch
                    switch(op) {
                        case 1:
                            jugar();    //Llama al método jugar, el tronco del programa.
                            op = 3;     //Iguala la variable del switch a 3 para que no cumpla la condición de while y salga del bucle.
                            break;
                        case 2:
                            tutorial(); //Llama al metodo tutorial que enseña un mensaje por pantalla.
                        case 3:
                            break; 
                    }
                }
            }catch(NumberFormatException e){    //Try-catch que recojen un error de formato, por si el jugador introduce letras u otros caracteres.
                JOptionPane.showMessageDialog(null,"Por favor introduzca un valor válido");
            }
        }while(op != 3 );
    }

    public static void tutorial(){     //Método tutorial que enseña por pantalla un mensaje de ayuda.
        JOptionPane.showMessageDialog(null,"Bienvenido a Reigns\n\n"
        + "Reigns es un juego por turnos en el que encarnas a un nuevo rey elegido para gobernar, y las reglas son sencillas:\n\n"
        + "El jugador tiene delante 4 barras que representan distintos poderes en el reino: el pueblo, la economía, el poder militar y la iglesia.\n"
        + "Sabiendo esto, durante la partida se tomarán distintas decisiones que cambiarán el balance de esas barras. Si cualquiera de\n las barras se vacía o completa has perdido."
        + "\nCada turno de reigns representa un año de reinado, intenta aguantar lo suficiente para delegar tus deberes al siguiente\n pretendiente a monarca.");
    }
    
    public static String leer(File fich){  //Método que lee la primera linea de un archivo de texto.
        Scanner sc = null;  //Creamos un Scanner.
        String i = null;    //Creamos el String a devolver por el método.
        
        try{
            sc = new Scanner(fich); //Hacemos que el Scanner reciva un fichero.
            i = sc.nextLine();  //Metemos en un String la primera linea del archivo.
        }catch (FileNotFoundException ex){  //try-catch por si no encientra el fichero.
            JOptionPane.showMessageDialog(null,"No se ha encontrado el nombre del rey");    //Mensaje a devolver si no encuentra el archivo.
        }finally{
            sc.close(); //Se cierra el flujo.
        }
        return i;
    }
    
     public static void nombre(){  //Método para pedir el Nombre y meterlo en un fichero
        try {
            FileWriter fich = new FileWriter("fichero.txt");    //Creamos un FileWriter de nombre fich que escriba en un archivo llamado fichero.txt
            fich.write(JOptionPane.showInputDialog(null,"Introduce el nombre del nuevo rey"));  //Recibimos el String por teclado y se escribe.
            fich.close();   //Se cierra el flujo.
        }catch (IOException e){ //Catch para errores IOException.
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error, prueba con otro nombre"); //Mensaje a sacar por pantalla si ocurre la excepción.
        }catch (NullPointerException e){    //Catch para errores de tipo NullPointerException
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error, prueba con otro nombre"); //Mensaje a sacar por pantalla si ocurre la excepción.
        }
    }
    
     public static String barras(){    //Método que crea y saca por pantalla la representación de las variables a gestionar en el juego junto con el nombre del rey y su edad.
         File fich = new File("fichero.txt");   //Instanciamos el fichero para usarlo más tarde.
         
         String i;  //String que recibe la barra que representa la iglesia.
         String e;  //String que recibe la barra que representa la economía.
         String m;  //String que recibe la barra que representa el poder militar.
         String p;  //String que recibe la barra que representa el pueblo.
         String todo;   //String que recibe todas las barras y las devuelve junto con el nombre y edad del rey al final del método.
         
         //A continuación están una serie de "if else" que definen las barras, son todos iguales y funcionan de la misma forma. Dependiendo de los valores entre los que se encuentre la variable le dan un aspecto.
         
         if (pue <= 0)
             p = "Pueblo                    [_____________________]";
         else if (pue > 0 && pue <= 10)
             p = "Pueblo                    [##___________________]";
         else if (pue > 10 && pue <= 20)
             p = "Pueblo                    [####_________________]";
         else if (pue > 20 && pue <= 30)
             p = "Pueblo                    [######_______________]";
         else if (pue > 30 && pue <= 40)
             p = "Pueblo                    [########_____________]";
         else if (pue > 40 && pue <= 50)
             p = "Pueblo                    [##########___________]";
         else if (pue > 50 && pue <= 60)
             p = "Pueblo                    [############_________]";
         else if (pue > 60 && pue <= 70) 
             p = "Pueblo                    [##############_______]";
         else if (pue > 70 && pue <= 80)
             p = "Pueblo                    [################_____]";
         else if (pue > 80 && pue <= 90)
             p = "Pueblo                    [##################___]";
         else if (pue > 90 && pue < 100)
             p = "Pueblo                    [####################_]";
         else if (pue == 100 || pue > 100)
             p = "Pueblo                    [#####################]";
         else
             p = "pepino";
         if (eco <= 0)
             e = "Economía              [_____________________]";
         else if (eco > 0 && eco <= 10)
             e = "Economía              [##___________________]";
         else if (eco > 10 && eco <= 20)
             e = "Economía              [####_________________]";
         else if (eco > 20 && eco <= 30)
             e = "Economía              [######_______________]";
         else if (eco > 30 && eco <= 40)
             e = "Economía              [########_____________]";
         else if (eco > 40 && eco <= 50)
             e = "Economía              [##########___________]";
         else if (eco > 50 && eco <= 60)
             e = "Economía              [############_________]";
         else if (eco > 60 && eco <= 70) 
             e = "Economía              [##############_______]";
         else if (eco > 70 && eco <= 80)
             e = "Economía              [################_____]";
         else if (eco > 80 && eco <= 90)
             e = "Economía              [##################___]";
         else if (eco > 90 && eco < 100)
             e = "Economía              [####################_]";
         else if (eco == 100 || eco > 100)
             e = "Economía              [#####################]";
         else
             e = "pepino";
         if (mil <= 0)
             m = "Poder Militar         [_____________________]";
         else if (mil > 0 && mil <= 10)
             m = "Poder Militar         [##___________________]";
         else if (mil > 10 && mil <= 20)
             m = "Poder Militar         [####_________________]";
         else if (mil > 20 && mil <= 30)
             m = "Poder Militar         [######_______________]";
         else if (mil > 30 && mil <= 40)
             m = "Poder Militar         [########_____________]";
         else if (mil > 40 && mil <= 50)
             m = "Poder Militar         [##########___________]";
         else if (mil > 50 && mil <= 60)
             m = "Poder Militar         [############_________]";
         else if (mil > 60 && mil <= 70) 
             m = "Poder Militar         [##############_______]";
         else if (mil > 70 && mil <= 80)
             m = "Poder Militar         [################_____]";
         else if (mil > 80 && mil <= 90)
             m = "Poder Militar         [##################___]";
         else if (mil > 90 && mil < 100)
             m = "Poder Militar         [####################_]";
         else if (mil == 100 || mil > 100)
             m = "Poder Militar         [#####################]";
         else
             m = "pepino";
         if (igl <= 0)
             i = "Religión                  [_____________________]";
         else if (igl > 0 && igl <= 10)
             i = "Religión                  [##___________________]";
         else if (igl > 10 && igl <= 20)
             i = "Religión                  [####_________________]";
         else if (igl > 20 && igl <= 30)
             i = "Religión                  [######_______________]";
         else if (igl > 30 && igl <= 40)
             i = "Religión                  [########_____________]";
         else if (igl > 40 && igl <= 50)
             i = "Religión                  [##########___________]";
         else if (igl > 50 && igl <= 60)
             i = "Religión                  [############_________]";
         else if (igl > 60 && igl <= 70) 
             i = "Religión                  [##############_______]";
         else if (igl > 70 && igl <= 80)
             i = "Religión                  [################_____]";
         else if (igl > 80 && igl <= 90)
             i = "Religión                  [##################___]";
         else if (igl > 90 && igl < 100)
             i = "Religión                  [####################_]";
         else if (igl == 100 || igl > 100)
             i = "Religión                  [#####################]";
         else
             i = "pepino";
         if(edad == 1)
            todo = i+"\n\n"+p+"\n\n"+m+"\n\n"+e+"\n\n\n\nEl rey "+leer(fich)+" lleva vivo "+edad+" año.";   //String en el que guardamos las barras y la el número de rondas.
         else
             todo = i+"\n\n"+p+"\n\n"+m+"\n\n"+e+"\n\n\n\nEl rey "+leer(fich)+" lleva vivo "+edad+" años.";
         return todo;
     }
    
    public static int perder(){    //Método que salta cuando una de las barras se llena o vacía. Tiene la misma estructura que el método barras(). Al final de cada elección salta una imagen personalizada por cada muerte.
        reigns.Imagenes obx = new reigns.Imagenes();
        if (pue >= 100){
            JOptionPane.showMessageDialog(null,"El pueblo es demasiado numeroso y hay rumores recientes de que nuevos lideres\n le quieren muerto.");
            obx.inicializar("Como decían los rumores había gente en su contra, lo cual termino en un sutil envenenamiento", "imagenes/envenenado.png", "El rey ha muerto");
            return 1;
        }else if (pue <= 0) {
            JOptionPane.showMessageDialog(null,"El pueblo está harto de los malos tratos y vienen hacia el castillo, su reino\n está muerto y quieren algo a cambio.");
            obx.inicializar("El castillo es saqueado, buestra corte se dispersa y solo os quedan como últimos subditos las palomas", "imagenes/palomas.png", "El rey ha muerto");
            return 1;
        }else if (mil >= 100){
            JOptionPane.showMessageDialog(null,"Nuestro ejército es demasiado fuerte y se ha hartado de que usted esté\n al mando, vienen hacia aquí");
            obx.inicializar("Mientras habla con su consejero una flecha atraviesa la puerta y termina en un lugar en el que no debería estar", "imagenes/flecha.png", "El rey ha muerto");
            return 1;
        }else if (mil <= 0) {
            JOptionPane.showMessageDialog(null,"Nuestro poder militar es tan malo que cualquier batalla nos llevaría a \nla ruina.");
            obx.inicializar("Acompañado por los ultimos soldados fieles a la Corona, moris en las escaleras del trono", "imagenes/cabeza.png", "El rey ha muerto");
            return 1;
        }else if (igl >= 100) {
            JOptionPane.showMessageDialog(null,".La iglesia tiene demasiado porder, nadie le sigue, solo quedan 5 \npersonas en la corte.");
            obx.inicializar("Los debotos de la iglesia llegan al castillo y no dudan en quemarle cual hereje", "imagenes/quemado.png", "El rey ha muerto");
            return 1;
        }else if (igl <= 0) {
            JOptionPane.showMessageDialog(null,"La iglesia ha perdido todo su poder, el pueblo se levanta en armas en su\n contra, solo queda escapar.");
            obx.inicializar("Una multitud sedienta de libertad os masacra durante vuestra tentativa evasión", "imagenes/pica.png", "El rey ha muerto");
            return 1;
        }else if (eco >= 100) {
            JOptionPane.showMessageDialog(null,"Todo el dinero del reino se focaliza en los mercaderes, son demasiado\n ricos.");
            obx.inicializar("Intentando huir ante la caida de la corona te ves encerrado por perros de los mercaderes", "imagenes/perros.png", "El rey ha muerto");
            return 1;
        }else if (eco <= 0) {
            JOptionPane.showMessageDialog(null,"No nos queda dinero su alteza y el reino es pobre como nosotros.");
            obx.inicializar("Acabais tirados en un charco del bosque cercano, muriendo de inhanición", "imagenes/tirado.png", "El rey ha muerto");
            return 1;
        }else;   
        
            return 0;
    }
    
    public static void ganar(){ //Método que salta al salir del loop de juego habiendo pasado 45 rondas.
        Imagenes obx = new Imagenes();  //Inicializamos un objeto de la clase Imagenes que devuelve un Frame con texto y una imagen.
        obx.inicializar("Habéis logrado evitar la muerte. Entrando a tu vejez le entregas la corona al siguiente candidato, y le deseas mucha suerte.", "imagenes/corona.png", "¡Felicidades!");
    }
     
    public static void jugar(){    //Método troncal del programa.
        Random rd = new Random();   //Instanciamos in objeto de la clase random.
        File fich = new File("fichero.txt");    //Instanciamos un objeto de la clase file que referencie a nuetro fichero.
        nombre();   //Método que usamos para recoger el nombre que introduzca el jugador.
        JOptionPane.showMessageDialog(null,"El nuevo rey ha sido elegido:\n\nSaludad al rey " + leer(fich));    //Sale un mensaje con el nombre que ha introducido el jugador.
        List<Integer> k = new ArrayList<>();    //Instanciamos un ArrayList.
        for(int i = 0; i < 45; i++){    //Este for llena el ArrayList con numeros en aumento desde el 0 hasta el 45.
            k.add(i);
        }
        Collections.shuffle(k,rd);  //Usando el método shuffle en nuestro ArrayList y usando objeto Random mueve las posiciones del ArrayList de forma aleatoria, dejando un ArrayList de 45 números sin repetición ordenados de forma aleatoria.
        for(int i = 0; i < 45; i++){    //Este bucle For es el loop de juego. Cada vuelta incrementa la variable edad, llama al método escoger() con la posición del ArrayList correspondiente al turno y después enseña por pantalla la gestión de las barras.
            edad++;
            Opciones.escoger(k.get(i));
            JOptionPane.showMessageDialog(null,barras());
            if (perder() == 1)  //Cada vuelta del bucle también llama al método perder() que devuelve un int con valor 1 si se cumplen las condiciones para perder.
                break;  //Si se cumplen las condiciones el bucle se rompe.
        }
        if (edad == 45){    //Fuera del bucle hay in if con la condición de que si han pasado 45 turnos el jugador gana.
            ganar();    //Llama al método ganar.
        }
        baseData.Bd.insert(edad);
        pue = 50;
        igl = 50;
        mil = 50;
        eco = 50;
        edad = 0;
    }
    
   
}
