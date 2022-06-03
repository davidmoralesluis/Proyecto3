package reigns;

import javax.swing.JOptionPane;


public class Opciones {
    
    static int i = 0;   //Variable que decide los resultados de cada decisión.
    
    static void escoger(int s){ //Método que se lanza en cada turno de juego.
        switch(s){  //La opción del switch es determianda por el numero guarado en la posición respectiva a cada turno del ArrayList.
            case 0: //Cada opción contiene un dialogo con una elección, de la cual depende el resultado y variabilidad de las barras del juego. Cada opción es distinta
                i = Integer.parseInt(JOptionPane.showInputDialog("Las ratas ifestan la ciudad señor ¿Que hacemos?\n1.Preparad venenos.\n2.Son solo animales."));
                if(i==1){
                    Metodos.pue = Metodos.pue+15;
                    Metodos.eco = Metodos.eco-20;
                }else{
                    Metodos.pue = Metodos.pue-20;
                    Metodos.eco = Metodos.eco+10;
                }
                break;
            case 1:
                i = Integer.parseInt(JOptionPane.showInputDialog("Al Arzobispo le gustaría dar una misa en memoria del anterior rey\n1.Dejarle.\n2.A los muertos no les importa..."));
                if(i==1){
                    Metodos.igl = Metodos.igl+15;
                    Metodos.eco = Metodos.eco-15;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.eco = Metodos.eco+15;
                }
                break;
            case 2:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los mercaderes quieren establecer una nueva ruta de comercio con la ciudad vecina, pero tendremos que poner la mano de obra\n1.Adelante.\n2.No me interesa"));
                if(i==1){
                    Metodos.eco = Metodos.eco+15;
                    Metodos.pue = Metodos.pue-15;
                }else{
                    Metodos.eco = Metodos.eco-15;
                    Metodos.pue = Metodos.pue+15;
                }
                break;
            case 3:
                i = Integer.parseInt(JOptionPane.showInputDialog("La reina del norte nos ha enviado 40 libros, deberíamos hacer una biblioteca\n1.Así sea.\n2.Los libros solo hablan de estupideces"));
                if(i==1){
                    Metodos.pue = Metodos.pue+15;
                    Metodos.eco = Metodos.eco-15;
                }else{
                    Metodos.pue = Metodos.pue-15;
                    Metodos.eco = Metodos.eco+15;
                }
                break;
            case 4:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los presos se han escapado.¡Movilicemos las tropas!\n1.Da la orden.\n2.No harán mucho daño"));
                if(i==1){
                    Metodos.mil = Metodos.mil+30;
                    Metodos.pue = Metodos.pue+20;
                    Metodos.eco = Metodos.eco+10;
                    Metodos.igl = Metodos.igl+10;
                }else{
                    Metodos.mil = Metodos.mil-30;
                    Metodos.pue = Metodos.pue-20;
                    Metodos.eco = Metodos.eco-10;
                    Metodos.igl = Metodos.igl-10;
                }
                break;
            case 5:
                i = Integer.parseInt(JOptionPane.showInputDialog("Queremos ejecutar a varios presos, para darle una lección al pueblo.\n1.¡Salvaje!\n2.Que aprendan..."));
                if(i==1){
                    Metodos.mil = Metodos.mil+20;
                    Metodos.pue = Metodos.pue-10;
                }else{
                    Metodos.mil = Metodos.mil-10;
                }
                break;
            case 6:
                i = Integer.parseInt(JOptionPane.showInputDialog("Viene el Papa a visitarnos, preparemos un banquete a los grande \n1.Festejemos.\n2.Dios no necesita tanto..."));
                if(i==1){
                    Metodos.igl = Metodos.igl+20;
                    Metodos.eco = Metodos.eco-10;
                }else{
                    Metodos.igl = Metodos.igl-15;
                }
                break;
            case 7:
                i = Integer.parseInt(JOptionPane.showInputDialog("Hemos encontrado oro en las minas ¿Seguimos cavando?\n1.Hacedlo.\n2.No hace falta"));
                if(i==1){
                    Metodos.eco = Metodos.eco+30;
                    Metodos.pue = Metodos.pue-20;
                }else{
                    Metodos.eco = Metodos.eco+15;
                }
                break;
            case 8:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los soldados enemigos se aproximan por las puertas del sur, hay que hacer algo\n1.Llamad a las tropas.\n2.Seguro que no es para tanto"));
                if(i==1){
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue+10;
                }else{
                    Metodos.pue = Metodos.pue-20;
                }
                break;
            case 9:
                i = Integer.parseInt(JOptionPane.showInputDialog("La iglesia quiere construir una escuela para educar al pueblo\n1.Hazlo.\n2.No es tan importante"));
                if(i==1){
                    Metodos.igl = Metodos.igl+15;
                    Metodos.eco = Metodos.eco-30;
                    Metodos.pue = Metodos.pue+15;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 10:
                i = Integer.parseInt(JOptionPane.showInputDialog("Señor es el invierno más duro de los últimos 30 años el pueblo está hambriento\n1.Repartid las reservas.\n2.No puedo hacer nada."));
                if(i==1){
                    Metodos.pue = Metodos.pue+20;
                    Metodos.eco = Metodos.eco-20;
                }else{
                    Metodos.pue = Metodos.pue-40;
                }
                break;
            case 11:
                i = Integer.parseInt(JOptionPane.showInputDialog("La reina del este nos ofrece ayuda para repeler al enemigo\n1.Acepto.\n2.No lo necesitamos"));
                if(i==1){
                    Metodos.mil = Metodos.mil+30;
                    Metodos.igl = Metodos.igl-10;
                    Metodos.pue = Metodos.pue+10;
                }else{
                    Metodos.mil = Metodos.mil-20;
                }
                break;
            case 12:
                i = Integer.parseInt(JOptionPane.showInputDialog("¡Un incendio está a punto de destruir vuestro castillo mi señor!\n1.¡Salvad la guarnición!.\n2.¡Salvad el tesoro!"));
                if(i==1){
                    Metodos.igl = Metodos.igl+20;
                    Metodos.eco = Metodos.eco-30;
                    Metodos.pue = Metodos.pue+20;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.eco = Metodos.eco+30;
                    Metodos.pue = Metodos.pue-15;
                }
                break;
            case 13:
                i = Integer.parseInt(JOptionPane.showInputDialog("El río está seco otra vez mi señor, deberíamos construir un embalse\n1.Hazlo.\n2.Pasa todos los años, por uno más..."));
                if(i==1){
                    Metodos.pue = Metodos.pue+30;
                    Metodos.eco = Metodos.eco-20;
                }else{
                    Metodos.pue = Metodos.pue-30;
                }
                break;
            case 14:
                i = Integer.parseInt(JOptionPane.showInputDialog("Un barco se ha puesto en cuarentena en el puerto. Puede que sea la peste.\n ¿Repartimos medicinas por el pueblo?\n1.Medicinas para todos.\n2.Será un resfriado"));
                if(i==1){
                    Metodos.pue = Metodos.pue+20;
                    Metodos.eco = Metodos.eco-15;
                    Metodos.mil = Metodos.mil-15;
                }else{
                    Metodos.pue = Metodos.pue-30;
                    Metodos.mil = Metodos.mil+10;
                }
                break;
            case 15:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los mercaderes quieren hacer un gremio y mandar un representante a la corte\n1.Adelante.\n2.No"));
                if(i==1){
                    Metodos.igl = Metodos.igl-5;
                    Metodos.eco = Metodos.eco+25;
                    Metodos.pue = Metodos.pue-10;
                    Metodos.mil = Metodos.mil-5;
                }else{
                    Metodos.igl = Metodos.igl+5;
                    Metodos.eco = Metodos.eco-25;
                    Metodos.pue = Metodos.pue+10;
                    Metodos.mil = Metodos.mil+5;
                }
                break;
            case 16:
                i = Integer.parseInt(JOptionPane.showInputDialog("El Arzobispo quiere iniciar un peregrinaje a la tumba de San Armando\n1.Que lo haga.\n2.Esta vez no"));
                if(i==1){
                    Metodos.igl = Metodos.igl+20;
                    Metodos.eco = Metodos.eco-15;
                    Metodos.pue = Metodos.pue+10;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 17:
                i = Integer.parseInt(JOptionPane.showInputDialog("El médico de la corte habla sobre la nefasta salud de nuestro ejército y que deberíamos de invertir en ello.\n1.Si es por una buena causa...\n2.Ni en sueños."));
                if(i==1){
                    Metodos.mil = Metodos.mil+15;
                    Metodos.eco = Metodos.eco-20;
                }else{
                    Metodos.mil = Metodos.mil-20;
                }
                break;
            case 18:
                i = Integer.parseInt(JOptionPane.showInputDialog("Es vuetro cumpleaños Alteza, hagamos una fiesta.\n1.No vendrá mal.\n2.No hace falta"));
                if(i==1){
                    Metodos.igl = Metodos.igl+10;
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue+10;
                    Metodos.eco = Metodos.eco-20;
                }else{
                    Metodos.igl = Metodos.igl-5;
                    Metodos.mil = Metodos.mil-5;
                    Metodos.pue = Metodos.pue-5;
                }
                break;
            case 19:
                i = Integer.parseInt(JOptionPane.showInputDialog("Deberías de crear un museo de ciencias para mostrar la vida.\n1.Hagámoslo.\n2.No, gracias"));
                if(i==1){
                    Metodos.igl = Metodos.igl-15;
                    Metodos.eco = Metodos.eco-10;
                    Metodos.pue = Metodos.pue+10;
                }else{
                    Metodos.igl = Metodos.igl+15;
                }
                break;
            case 20:
                i = Integer.parseInt(JOptionPane.showInputDialog("Soy Maestro Courtenay, maestro del gremio de mercaderes. Aceptad estra prueba de mi gratitud\n1.Gracias.\n2.No acepto sobornos"));
                if(i==1){
                    Metodos.eco = Metodos.eco+20;
                }else{
                    Metodos.igl = Metodos.igl+15;
                    Metodos.pue = Metodos.pue+15;
                }
                break;
            case 21:
                i = Integer.parseInt(JOptionPane.showInputDialog("Vuestros soldados están forzando a los curas y a sus fieles a darles dinero a cambio de protección. ¡Debéis ponerle fin!\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.igl = Metodos.igl+10;
                    Metodos.pue = Metodos.pue+10;
                    Metodos.mil = Metodos.mil-10;
                    Metodos.eco = Metodos.eco-10;
                }else{
                    Metodos.igl = Metodos.igl-30;
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 22:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los ducados del Este se reagrupan bajo el mando de un terrible guerrero. ¡Enviad a las tropas!\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.mil = Metodos.mil-25;
                }else{
                    Metodos.pue = Metodos.pue-30;
                }
                break;
            case 23:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los salarios de los soldados son demasiado bajos, hay que pagarles mejor\n1.Si.\n2No."));
                if(i==1){
                    Metodos.mil = Metodos.mil+20;
                    Metodos.eco = Metodos.eco-15;
                }else{
                    Metodos.mil = Metodos.mil-15;
                }
                break;
            case 24:
                i = Integer.parseInt(JOptionPane.showInputDialog("La peste negra está destrozando al pueblo ¡Hay que hacer algo!\n1.¡Quemad los cadáveres!.\n2.¡Ayudad a la gente!"));
                if(i==1){
                    Metodos.igl = Metodos.igl-15;
                    Metodos.eco = Metodos.eco+10;
                    Metodos.pue = Metodos.pue-30;
                    Metodos.mil = Metodos.mil+10;
                }else{
                    Metodos.igl = Metodos.igl+10;
                    Metodos.eco = Metodos.eco-30;
                    Metodos.pue = Metodos.pue+20;
                    Metodos.mil = Metodos.mil-5;
                }
                break;
            case 25:
                i = Integer.parseInt(JOptionPane.showInputDialog("Este año no ocurre nada. Los soldados se aburren como ostras,\n1.¡Pues a entrenar!.\n2.!Dadles vino¡"));
                if(i==1){
                    Metodos.igl = Metodos.igl+5;
                    Metodos.mil = Metodos.mil-15;
                }else{
                    Metodos.pue = Metodos.pue+5;
                    Metodos.mil = Metodos.mil+25;
                    Metodos.eco = Metodos.eco-30;
                }
                break;
            case 26:
                i = Integer.parseInt(JOptionPane.showInputDialog("Llega una paloma con un mensaje:\nUn mago en una ciudad vecina ha conseguido crear un Golem\n1.¡GENERAL!.\n2.Es imposible..."));
                if(i==1){
                    Metodos.mil = Metodos.mil+10;
                    Metodos.igl = Metodos.igl-10;
                }else{
                    Metodos.igl = Metodos.igl+5;
                    Metodos.pue = Metodos.pue+10;
                }
                break;
            case 27:
                i = Integer.parseInt(JOptionPane.showInputDialog("Nuestra bella capital huele a cadáver la mitad de meses del año. Construyamos un sistema de desagües.\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.eco = Metodos.eco-20;
                    Metodos.pue = Metodos.pue+15;
                }else{
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 28:
                i = Integer.parseInt(JOptionPane.showInputDialog("El Sur reclama nuestra ayuda en su conflicto contra el Oeste. ¿Deberíamos enviar nuestro ejercito como obserbadores neutrales?\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.mil = Metodos.mil-10;
                    Metodos.eco = Metodos.eco-25;
                }else{
                    Metodos.pue = Metodos.pue-15;
                    Metodos.eco = Metodos.eco-5;
                }
                break;
            case 29:
                i = Integer.parseInt(JOptionPane.showInputDialog("Las hermanas de un convento se han puesto a maullas como gatos. Se está propagando hacia el pueblo.\n1.GENERAL.\n2.¿A caso es problema mío?."));
                if(i==1){
                    Metodos.igl = Metodos.igl+10;
                    Metodos.mil = Metodos.mil-20;
                }else{
                    Metodos.igl = Metodos.igl-20;
                    
                }
                break;
            case 30:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los habitantes de un pueblo lejano enseñan a los niños a escupir sobre los hombres del Rey. ¿Les damos su merecido?\n1.Si.\n2.A No."));
                if(i==1){
                    Metodos.igl = Metodos.igl+1;
                    Metodos.pue = Metodos.pue-10;
                }else{ 
                    Metodos.pue = Metodos.pue+10;
                }
                break;
            case 31:
                i = Integer.parseInt(JOptionPane.showInputDialog("¡Ataquemos al reino del Sur! Su poder se va extinguiendo día tras día.\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.mil = Metodos.mil-20;
                }else{
                    Metodos.pue = Metodos.pue+10;
                }
                break;
            case 32:
                i = Integer.parseInt(JOptionPane.showInputDialog("¡Los invasores usan catapultas para destruir nuestra fortaleza!\n1.¡Al ataque!.\n2.¡Defended!."));
                if(i==1){
                    Metodos.mil = Metodos.mil-20;
                }else{
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 33:
                i = Integer.parseInt(JOptionPane.showInputDialog("La cosecha es perfecta este año\n1.Alimentad al pueblo.\n2.Alimentad al ejército."));
                if(i==1){
                    Metodos.igl = Metodos.igl+10;
                    Metodos.eco = Metodos.eco+10;
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue+20;
                }else{
                    Metodos.igl = Metodos.igl+10;
                    Metodos.eco = Metodos.eco+10;
                    Metodos.mil = Metodos.mil+20;
                    Metodos.pue = Metodos.pue+10;
                }
                break;
            case 34:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los cereales están muy asequibles en este momento Mi Señor. Deberíamos reajustar el precio del pan.\n1.Aumentadlo un poco.\n2.¡Duplicadlo!."));
                if(i==1){
                    Metodos.eco = Metodos.eco+15;
                }else{
                    Metodos.pue = Metodos.pue-25;
                    Metodos.eco = Metodos.eco+30;
                }
                break;
            case 35:
                i = Integer.parseInt(JOptionPane.showInputDialog("Los habitantes de un pueblo del Oeste tienen miedo de los duendes. ¿Quien se va a encargar?\n1.Vos.\n2.La Iglesia."));
                if(i==1){
                    Metodos.pue = Metodos.pue+15;
                    Metodos.igl = Metodos.igl+15;
                }else{
                    Metodos.igl = Metodos.igl+15;
                    Metodos.pue = Metodos.pue-10;
                }
                break;
            case 36:
                i = Integer.parseInt(JOptionPane.showInputDialog("Al Arzobispo le gustaría dar una misa en memoria del anterior rey\n1.Dejarle.\n2.A los muertos no les importa..."));
                if(i==1){
                    Metodos.igl = Metodos.igl+15;
                    Metodos.eco = Metodos.eco-15;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.eco = Metodos.eco+15;
                }
                break;
            case 37:
                i = Integer.parseInt(JOptionPane.showInputDialog("Al Arzobispo dice que Dios le ha hablado y que Debemos de encontrar el Santo grial a toda cosa\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.igl = Metodos.igl+25;
                    Metodos.eco = Metodos.eco-25;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.pue = Metodos.pue+15;
                }
                break;
            case 38:
                i = Integer.parseInt(JOptionPane.showInputDialog("¡Señor! Vuestra orina huele a azalea esta mañana. Deberíais evitar cabalgar durante un tiempo\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.mil = Metodos.mil-10;
                }else{
                    Metodos.mil = Metodos.mil+10;
                }
                break;
            case 39:
                i = Integer.parseInt(JOptionPane.showInputDialog("Un milagro en el Sur: una estatua del profeta derrama lágrimas de sangre. Deberíamos proglamar que son auténticas.\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.igl = Metodos.igl+25;
                    Metodos.eco = Metodos.eco-15;
                    Metodos.pue = Metodos.pue-10;
                }else{
                    Metodos.igl = Metodos.igl-15;
                    Metodos.pue = Metodos.pue+10;
                }
                break;
            case 40:
                i = Integer.parseInt(JOptionPane.showInputDialog("Señor, los lobos se comen a nuestros hijos. ¿Podemos darles caza?\n1.Os estáis tirando un farol.\n2.Ya me encargo yo."));
                if(i==1){
                    Metodos.igl = Metodos.igl+10;
                    Metodos.eco = Metodos.eco-10;
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue-10;
                }else{
                    JOptionPane.showMessageDialog(null,"La cacería ha sido un éxito, todo el mundo está contento.");
                    Metodos.igl = Metodos.igl-10;
                    Metodos.eco = Metodos.eco+15;
                    Metodos.mil = Metodos.mil+10;
                    Metodos.pue = Metodos.pue+15;
                }
                break;
            case 41:
                i = Integer.parseInt(JOptionPane.showInputDialog("El rey del Oeste ofrece una buena suma de dinero por nuestras tierras.\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.pue = Metodos.pue-35;
                    Metodos.eco = Metodos.eco+40;
                }else{
                    Metodos.eco = Metodos.eco-15;
                }
                break;
            case 42:
                i = Integer.parseInt(JOptionPane.showInputDialog("Estáis necesitado de dinero mi señor, puedo prestarle 8000 monedas a solo un 5% de interés\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.eco = Metodos.eco+50;
                }else{
                    Metodos.eco = Metodos.eco-10;
                }
                break;
            case 43:
                i = Integer.parseInt(JOptionPane.showInputDialog("¡El Este y el Sur cordinan un ataque contra el reino!¿Pedimos ayuda al Oeste?\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.mil = Metodos.mil+20;
                    Metodos.eco = Metodos.eco-25;
                }else{
                    Metodos.pue = Metodos.pue-30;
                    Metodos.mil = Metodos.mil-20;
                }
                break;
            case 44:
                i = Integer.parseInt(JOptionPane.showInputDialog("Deberíamos de establecer un toque de queda. ¡Las calles son muy inseguras durante la noche!\n1.Si.\n2.No."));
                if(i==1){
                    Metodos.pue = Metodos.pue+15;
                    Metodos.eco = Metodos.eco-20;
                    Metodos.mil = Metodos.mil+10;
                }else{
                    Metodos.pue = Metodos.pue-20;
                    Metodos.mil = Metodos.mil-10;
                }
                break;
        }
    }
}