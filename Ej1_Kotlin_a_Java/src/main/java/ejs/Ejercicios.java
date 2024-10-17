package ejs;

public class Ejercicios {

    public void ej2(){
        int energia = 80;
        // En java se usa el operador ternario para comprobar la condicion
        String estado = (energia > 50) ? "Personaje fuerte" : "Personaje debil";
        System.out.println(estado);
    }

    public void ej4(){
        for (int i = 0; i<=5; i++){
            if(i == 3){
                continue; // Usamos continue para saltar la iteracion del bucle
            }
            System.out.println("Numero:" + i);
        }
    }

    public void ej6(){
        String personaje = null; // A diferencia de kotlin, no hay que indicar que pueda ser o no nula, ya que cualquier variable por defecto puede ser null

        if (personaje != null){
            System.out.println("Personaje: " + personaje);
        }else {
            System.out.println("No hay personaje");
        }
    }
}
