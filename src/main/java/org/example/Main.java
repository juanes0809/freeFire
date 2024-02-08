package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Datos del jugador
        String nickname;
        String nicknameBD="juanes";
        String contrasena;
        String contrasenaBD="jez0809*";
        Integer nivelVida=70;
        Integer contadorSkils=0;
        Integer contadorDisparos=0;
        Integer precioSkillVida=100000;
        Integer danoDisparos=-5;
        boolean estaMuerto=false;

        String juego1="free fire";
        String juego2="Fifa 24";
        String juegoSeleccionado;

        Scanner lea = new Scanner(System.in);

        //Proceso:
        System.out.println("*****Ingresando*****");
        System.out.println("*****Bienvenido*****");
        System.out.println("---------------------");

        System.out.println("Digita tu nickName: ");
        nickname=lea.nextLine();

        System.out.println("Digita tu contraseña: ");
        contrasena=lea.nextLine();

        //Rutina para verificar el perfil:
        if (nickname.equals(nicknameBD) && contrasena.equals(contrasenaBD)){
            System.out.println("Bienvenido a PSPLUS "+nickname);
            //Rutina para iniciar el juego
            System.out.println("Seleccione un juego: ");
            juegoSeleccionado=lea.nextLine();
            if (juegoSeleccionado.equals(juego1)){
                //Entramos a free fire
                do {
                    //RANDOM (disparo o no)
                    Random random=new Random();
                    int disparo=random.nextInt((2));

                    if (disparo==1){
                        //Le dieron
                        contadorDisparos=contadorDisparos+1;
                        nivelVida=nivelVida-5;
                        System.out.println("Te dispararon, tu vida quedo en: "+nivelVida);
                        if (nivelVida==0){
                            estaMuerto=true;
                            break;
                        }
                    }else {
                        //no le dieron
                        System.out.println("Esquivo la bala...");
                        contadorDisparos=0;
                    }
                }while (estaMuerto==false);
                System.out.println("Estas Muerto!!!");

            }else {
                System.out.println("Servidores no disponbles...");
            }

        }else {
            System.out.println("Usuario no encontrado...");
        }








    }
}