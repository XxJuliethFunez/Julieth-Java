package co.edu.sena.oop;

public class Data {

    public double areaTriangulo(double num1, double num2) {
        return (num1 * num2) / 2;
    }

    public double Sumadosnúmeros(double num1, double num2) {

        return num1 + num2;
    }

    public double Númeroalcuadrado(double num1) {
        return Math.pow(num1, 2);
    }

    public double Convertidordeeurosadólares(double num1) {
        return num1 * 1.08;
    }

    public double Areadeuncuadrado(double num1) {
        return Math.pow(num1, 2);
    }
    public double perimetrodeuncuadrado(double num1) {

        return num1 * 4;
    }

    public double  Areadeuncilindro(double num1, double num2) {

        return ((2*3.1416)*num1)*(num1 + num2);
    }
    public double volumendeuncilindro(double num1, double num2) {

        return 3.1416 * Math.pow(num1, 2)*num2;
    }
    public double RadioyLonguituddeCircuferencia(double num1) {

        return (num1 * num1);
    }
    public double  Promedio(double num1, double num2, double num3) {
        return (num1 + num2 + num3)/3;
    };

};
