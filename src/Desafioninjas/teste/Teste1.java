package Desafioninjas.teste;

import Desafioninjas.dominio.Ninja;

public class Teste1 {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        Ninja konohamaru = new Ninja();
        Ninja sasuke = new Ninja();


        naruto.name = "naruto";
        naruto.age = 13;
        naruto.missionName = "matar alguem1";
        naruto.dificultNivel = "E";
        naruto.Status = "concluida";

        konohamaru.name = "konohamaru";
        konohamaru.age = 15;
        konohamaru.missionName = "matar alguem2";
        konohamaru.dificultNivel = "C";
        konohamaru.Status = "concluida";

        sasuke.name = "sasuke";
        sasuke.age = 18;
        sasuke.missionName = "matar alguem3";
        sasuke.dificultNivel = "D";
        sasuke.Status = "concluida";

        if ((naruto.age >= 15) && ((naruto.dificultNivel != "C") || (naruto.dificultNivel != "D"))) {
            naruto.Status = "Status da missao: concluida";
            System.out.println ("nome do ninja: " + naruto.name + "\n" +
                    "idade do ninja: " + naruto.age + "\n" +
                    "nome da missao: " + naruto.missionName + "\n" +
                    "dificuldade da missao: " + naruto.dificultNivel + "\n" +
                    naruto.Status);
            System.out.println("-----------------------------------------");
        } else {
            System.out.println ("nome do ninja: " + naruto.name + "\n" +
                    "idade do ninja: " + naruto.age + "\n" +
                    "nome da missao: " + naruto.missionName + "\n" +
                    "dificuldade da missao: " + naruto.dificultNivel + "\n" +
                    "Status da missao: nao cocluida");
            System.out.println("-----------------------------------------");

        }




        if ((konohamaru.age >= 15) && ((konohamaru.dificultNivel != "C") || (konohamaru.dificultNivel != "D"))) {
        System.out.println ("nome do ninja: " + konohamaru.name + "\n" +
                "idade do ninja: " + konohamaru.age + "\n" +
                "nome da missao: " + konohamaru.missionName + "\n" +
                "dificuldade da missao: " + konohamaru.dificultNivel + "\n" +
                konohamaru.Status);
        System.out.println("-----------------------------------------");
    } else {
        System.out.println ("nome do ninja: " + konohamaru.name + "\n" +
                "idade do ninja: " + konohamaru.age + "\n" +
                "nome da missao: " + konohamaru.missionName + "\n" +
                "dificuldade da missao: " + konohamaru.dificultNivel + "\n" +
                "Status da missao: nao cocluida");
        System.out.println("-----------------------------------------");

    }



        if ((sasuke.age >= 15) && ((sasuke.dificultNivel != "C") || (sasuke.dificultNivel != "D"))) {
            System.out.println ("nome do ninja: " + sasuke.name + "\n" +
                    "idade do ninja: " + sasuke.age + "\n" +
                    "nome da missao: " + sasuke.missionName + "\n" +
                    "dificuldade da missao: " + sasuke.dificultNivel + "\n" +
                    sasuke.Status);
            System.out.println("-----------------------------------------");
        } else {
            System.out.println ("nome do ninja: " + sasuke.name + "\n" +
                    "idade do ninja: " + sasuke.age + "\n" +
                    "nome da missao: " + sasuke.missionName + "\n" +
                    "dificuldade da missao: " + sasuke.dificultNivel + "\n" +
                    "Status da missao: nao cocluida");
            System.out.println("-----------------------------------------");

        }

    }
}

