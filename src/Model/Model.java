package Model;

public class Model {

    private final double k = 9 * Math.pow(10, 9);
    private final double epsilonSubzero = 8.85 * Math.pow(10,-12);

    public String electricForce(double fistCharge, double secondCharge, double distance) {
        String rta = "";
        double electricForce = ((k * Math.abs(fistCharge)  * Math.abs(secondCharge)) / Math.pow(distance, 2));
        return rta + "La fuerza eléctrica es: " + electricForce + "N";
    }

    public String electricField(double charge, double distance) {
        String rta = "";
        double electricField = ((k * Math.abs(charge))) / Math.pow(distance, 2);
        return rta + "El campo eléctrico es: " + electricField + "N/C";
    }

    public String ringElectricField(double distance, double ratio, double charge){
        String rta = "";
        double E = 0.0;

        if(distance > ratio){
            E = (k * Math.abs(charge))/Math.pow(distance, 2);
        }
        else if (ratio > distance){
            double sum = Math.pow(distance, 2) + Math.pow(ratio, 2);
            E = ((k * charge * distance)/(Math.pow(sum, 3/2)));
        }
        return rta + "El campo eléctrico del anillo es: " + E + "N/C";
    }

    public String diskElectricField(double distance, double ratio, double charge){
       String rta = "";
       double area = Math.PI * Math.pow(ratio,2);
       double root = (Math.pow(ratio,2)/Math.pow(distance,2))+1;
       double o = charge / area;
       double electricField = ((2* Math.PI * k * o) * (1-(1/Math.sqrt(root))));
       return rta + "El campo eléctrico del disco es de: " + electricField + "N/C";
    }

    public String electricalFlow(double electricField, double area, double grades, double charge) {
        String rta = "";
        double electricalFlow = (electricField * area * Math.cos(grades));
        return rta + "El flujo eléctrico de la figura es de: " + electricalFlow + "Nm²/C";
    }

    public String gaussLaw(double area, double charge, double volumen){
        String rta = "";
        double volumetricDensity = charge/volumen;
        charge = volumetricDensity * volumen;
        double electricField = charge/ (area * epsilonSubzero);
        return rta + "Usando ley de gauss, el campo eléctrico es de: " + electricField + "N/C" + "\nLa carga es igual a: " + charge + "C" + " con una densidad volumétrica de: " + volumetricDensity + "C/m³";

    }

    public String potentialElectricEnergy (double firstCharge, double secondCharge, double thirdCharge, double distance, double distance13, double distance23, double point1, double point2, double point3){
        String rta = "";
        double potEnergy2 = (k*firstCharge*secondCharge)/distance;
        double potFinalEnergy2 = k*thirdCharge*((firstCharge/distance13)+(secondCharge/distance23));
        double work = -potFinalEnergy2;
        double electricPotential = k*((firstCharge/point1)+(secondCharge/point2)+(thirdCharge/point3));

        return rta + "La energía potencial entre la carga 1 y 2 es: " + potEnergy2 + "J" +"\nLa energía potencial final con una tercera carga en el sistema es: "+ potFinalEnergy2 + "J" + "\nEl trabajo con una tercera carga en el sistema es de: " + work + "J" + "\nLa energía potencial eléctrica con las tres cargas y la ubicación del punto es igual a:" + electricPotential + "V";
    }

    public String capacitance (double charge, double area, double distance){
        String rta = "";
        double electricField = charge / (area*epsilonSubzero);
        double capacitance = (area*epsilonSubzero)/distance;
        double potentialAB = charge/capacitance;
        return rta + "El campo eléctrico de las placas es de: " + electricField + "N/C" + "\nLa capacitancia es de: " + capacitance + "F" + "\nLa energía potencial eléctrica es de: " + potentialAB + "V";
    }

    public String esphericCapacitor (double ratioA, double ratioB, double charge, double ratioGauss){
        String rta = "";
        double cons = 1/(4*Math.PI*epsilonSubzero);
        double capacitance = (4*Math.PI*epsilonSubzero) * ((ratioA*ratioB)/(ratioB-ratioA));
        double electricPotential = charge * cons * ((1/ratioA)-(1/ratioB));
        double electricField = (cons * charge)/(Math.pow(ratioGauss,2));

        return rta + "El campo eléctrico del capacitor esférico es de: " + electricField + "N/C" + "\nLa energia potencial eléctrica es: " + electricPotential + "V" + "\nLa capacitancia es: " + capacitance + "F";

    }

    public String cilindricCapacitor (double lenght, double ratioA, double ratioB, double charge){
        String rta = "";
        double div = ratioB/ratioA;
        double electricPotencial = (charge/(2*Math.PI*epsilonSubzero*lenght))*(Math.log(div));
        double capacitance = (2*Math.PI*epsilonSubzero*lenght)/(Math.log(div));

        return rta + "La energía potencial del capacitor cilindrico es: " + electricPotencial + "V" + "\nLa capacitancia es de: " + capacitance + "F";
    }

    public String sumOfCapacitorsSerie (double c1, double c2, double c3, double c4){
        String rta = "";
        double sum = (1/c1)+(1/c2)+(1/c3)+(1/c4);
        return rta + "La suma de la serie de capacitores es: " + sum + "F";
    }

    public String sumOfCapacitorsParallel (double c1, double c2, double c3, double c4){
        String rta = "";
        double sum = c1 + c2 + c3 + c4;
        return rta + "La suma de los capacitores paralelos es: " + sum + "F";
    }

    public String storedEnergy (double energy){
        String rta = "";
        double div = (2*energy)/epsilonSubzero;
        double electricField = Math.sqrt(div);
        double electricField2 = (epsilonSubzero*(Math.pow(electricField,2)))/2;

        return rta + "La energía almacenada es: " + electricField2 + "J/m³";
    }
}
