package co.edu.sena.oop;

import java.util.Scanner;

public class app {
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        int Opcion;

        Data data = new Data();

        System.out.println(" Miscelanea ");
        System.out.println("------------------");
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("99. Reiniciar");
        System.out.println("Digite una Opción");
        Opcion = scr.nextInt();
        switch (Opcion){
            case 1: {
                //submenu Operadores
                System.out.println("Categoria Operadores");
                System.out.println("1. Área de un triángulo");
                System.out.println("2. Suma dos números");
                System.out.println("3. Número al cuadrado");
                System.out.println("4. Euros a Dólares");
                System.out.println("5. Area y perímetro de un cuadrado");
                System.out.println("6. Area y volúmen de un cilindro");
                System.out.println("7. Radio y Longuitud de Circuferencia");
                System.out.println("8. Promedio de tres números");
                System.out.println("Digite una Opción");
                Opcion = scr.nextInt();
                switch (Opcion){
                    case 1:{
                        System.out.println("------------------");
                        System.out.println("1. Área de un triángulo");
                        System.out.println("Digite la base:");
                        num1 =  scr.nextDouble();
                        System.out.println("Digite la altura:");
                        num2 = scr.nextDouble();
                        System.out.println("El área del triangulo es: " + data.areaTriangulo(num1, num2));
                    };
                    break;
                    case 2:{
                        System.out.println("--------------");
                        System.out.println("2. Suma dos números");
                        System.out.println("Ingrese Primer Número");
                        num1 =scr.nextDouble();
                        System.out.println("Ingrese Segundo Número");
                        num2 =scr.nextDouble();
                        System.out.println("El resultado es: " + data.Sumadosnúmeros(num1,num2));
                    };
                    break;
                    case 3:{
                        System.out.println("------------");
                        System.out.println("3. Número al cuadrado");
                        System.out.println("Ingrese Número");
                        num1 =scr.nextDouble();
                        System.out.println(" El número elevado al Cuadrado es: " + data.Númeroalcuadrado(num1));
                        System.out.println("   ");
                    };
                    break;
                    case 4:{
                        System.out.println("--------------");
                        System.out.println("4. Euros a Dólares");
                        System.out.println(" Ingrese Valor euro");
                        num1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el valor es: " + data.Convertidordeeurosadólares(num1)+ "USD.");
                    };
                    break;
                    case 5:{
                        System.out.println("--------------");
                        System.out.println("5. Area y perímetro de un cuadrado");
                        System.out.println("ingrese lado cuadrado en centimetros");
                        num1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el area del cuadrado es: " + data.Areadeuncuadrado(num1)+ "cm2.");
                    };
                    break;
                    case 6:{
                        System.out.println("--------------");
                        System.out.println("6. Area y volúmen de un cilindro");
                        System.out.println("ingrese radio de cilindro en centimetros");
                        num1 =scr.nextDouble();
                        System.out.println("ingrese la altura del cilindro en centimetro ");
                        System.out.println("  ");
                        System.out.println("el area del cilindro es: " + data.Areadeuncilindro(num1, num2)+ "cm2");
                        System.out.println("  ");
                        System.out.println("el area del cuadrado es: " + data.volumendeuncilindro(num1, num2)+ "cm2");
                    };
                    break;
                    case 7:{
                        System.out.println("--------------");
                        System.out.println("7. Radio y Longuitud de una Circuferencia");
                        System.out.println("ingrese lado en centimetro");
                        num1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println(" la longitud del circulo es: " + data.RadioyLonguituddeCircuferencia(num1)+ "cm2.");
                        System.out.println("  ");
                        System.out.println("el area del circulo es: " + data.RadioyLonguituddeCircuferencia(num1)+ "cm.");
                        System.out.println("  ");
                    };
                    break;
                    case 8:{
                        System.out.println("--------------");
                        System.out.println("8. Promedio de tres números");
                        System.out.println("ingrese Primer número");
                        num1 =scr.nextDouble();
                        System.out.println("ingrese segundo número");
                        num1 =scr.nextDouble();
                        System.out.println("ingrese tercer número");
                        num1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el promedio de los 3 números es: " +data.Promedio(num1, num2, num3));
                    };
                    break;
                    default: {
                        System.out.println("Opción no valida");
                    };
                    break;
                };
            };
            break;
            case 2:{
                //submenu Condicionales
                System.out.println("1. ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("6. ");
                System.out.println("7. ");
                System.out.println("Digite una Opción");
            };
            break;
            case 3:{
                //submenu Ciclos
                System.out.println("1. ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("6. ");
                System.out.println("7. ");
                System.out.println("Digite una Opción");
            };
            break;
            case 99:{System.out.println("Reiniciar");};
            break;
            default: System.out.println("Opción no valida");
                break;
        };


    };
};
