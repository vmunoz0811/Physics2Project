package Controller;

import Model.Model;
import View.Window;

public class Controller {

    private Model model;
    private Window view;
    private int menu, menuCharges, menuMed, menuField, menuFigures, menuFigures2, menuCap, menuSum;

    public Controller() {
        model = new Model();
        view = new Window();
        menu = 0;
        menuField = 0;
        menuCharges = 0;
        menuFigures = 0;
        menuFigures2 = 0;
        menuCap = 0;
        menuMed = 0;
        menuSum = 0;
        init();
    }

    public void init() {
        try {
            do {
                menu = view.readInt("FÍSICA ELÉCTRICA" +
                        "\n Selecciona la opción a realizar" +
                        "\n 1. Fuerza electrica" +
                        "\n 2. Campo eléctrico" +
                        "\n 3. Flujo eléctrico" +
                        "\n 4. Ley de Gauss" +
                        "\n 5. Energía potencial y energia potencial eléctrica" +
                        "\n 6. Capacitancia" +
                        "\n 7. Suma de capacitores" +
                        "\n 8. Energía almacenada" +
                        "\n 0. Salir");

                switch (menu) {
                    case 1:
                        double firstCharge = view.readDouble("Ingrese el valor de la primera carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                firstCharge = firstCharge * Math.pow(10, -6);
                                break;
                            case 2:
                                firstCharge = firstCharge * Math.pow(10, -12);
                                break;
                            case 3:
                                firstCharge = firstCharge * Math.pow(10, -9);
                                break;
                            case 4:
                                firstCharge = firstCharge;
                                break;
                        }
                        double secondCharge = view.readDouble("Ingrese el valor de la segunda carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                secondCharge = secondCharge * Math.pow(10, -6);
                                break;
                            case 2:
                                secondCharge = secondCharge * Math.pow(10, -12);
                                break;
                            case 3:
                                secondCharge = secondCharge * Math.pow(10, -9);
                                break;
                            case 4:
                                secondCharge = secondCharge;
                                break;
                        }
                        double distance = view.readDouble("Ingrese la distancia entre las dos cargas");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distance = distance / 1000;
                                break;
                            case 2:
                                distance = distance / 100;
                                break;
                            case 3:
                                distance = distance;
                                break;
                        }
                        view.showInfo(model.electricForce(firstCharge, secondCharge, distance));
                        break;

                    case 2:
                        menuField = view.readInt("Campo eléctrico" +
                                "\n Selecciona una opción" +
                                "\n 1. Campo eléctrico" +
                                "\n 2. Campo eléctrico de un anillo" +
                                "\n 3. Campo eléctrico de un disco");
                        switch (menuField) {
                            case 1:
                                double charge = view.readDouble("Ingrese el valor de la carga");
                                menuCharges = view.readInt("Cargas" +
                                        "\n Selecciona una opción" +
                                        "\n 1. Micro (E-6)" +
                                        "\n 2. Pico (E-12)" +
                                        "\n 3. Nano (E-9)" +
                                        "\n 4. N/A");
                                switch (menuCharges) {
                                    case 1:
                                        charge = charge * Math.pow(10, -6);
                                        break;
                                    case 2:
                                        charge = charge * Math.pow(10, -12);
                                        break;
                                    case 3:
                                        charge = charge * Math.pow(10, -9);
                                        break;
                                    case 4:
                                        charge = charge;
                                        break;
                                }
                                double distanceField = view.readDouble("Ingrese la distancia");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        distanceField = distanceField / 1000;
                                        break;
                                    case 2:
                                        distanceField = distanceField / 100;
                                        break;
                                    case 3:
                                        distanceField = distanceField;
                                        break;
                                }
                                view.showInfo(model.electricField(charge, distanceField));
                                break;
                            case 2:
                                double chargeFieldRing = view.readDouble("Ingrese la carga");
                                menuCharges = view.readInt("Cargas" +
                                        "\n Selecciona una opción" +
                                        "\n 1. Micro (E-6)" +
                                        "\n 2. Pico (E-12)" +
                                        "\n 3. Nano (E-9)" +
                                        "\n 4. N/A");
                                switch (menuCharges) {
                                    case 1:
                                        chargeFieldRing = chargeFieldRing * Math.pow(10, -6);
                                        break;
                                    case 2:
                                        chargeFieldRing = chargeFieldRing * Math.pow(10, -12);
                                        break;
                                    case 3:
                                        chargeFieldRing = chargeFieldRing * Math.pow(10, -9);
                                        break;
                                    case 4:
                                        chargeFieldRing = chargeFieldRing;
                                        break;
                                }
                                double distanceFieldRing = view.readDouble("Ingrese la distancia");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        distanceFieldRing = distanceFieldRing / 1000;
                                        break;
                                    case 2:
                                        distanceFieldRing = distanceFieldRing / 100;
                                        break;
                                    case 3:
                                        distanceFieldRing = distanceFieldRing;
                                        break;
                                }
                                double ratioRing = view.readDouble("Ingrese el valor del radio del anillo");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioRing = ratioRing / 1000;
                                        break;
                                    case 2:
                                        ratioRing = ratioRing / 100;
                                        break;
                                    case 3:
                                        ratioRing = ratioRing;
                                        break;
                                }
                                view.showInfo(model.ringElectricField(distanceFieldRing, ratioRing, chargeFieldRing));
                                break;
                            case 3:
                                double chargeFieldDisk = view.readDouble("Ingrese la carga");
                                menuCharges = view.readInt("Cargas" +
                                        "\n Selecciona una opción" +
                                        "\n 1. Micro (E-6)" +
                                        "\n 2. Pico (E-12)" +
                                        "\n 3. Nano (E-9)" +
                                        "\n 4. N/A");
                                switch (menuCharges) {
                                    case 1:
                                        chargeFieldDisk = chargeFieldDisk * Math.pow(10, -6);
                                        break;
                                    case 2:
                                        chargeFieldDisk = chargeFieldDisk * Math.pow(10, -12);
                                        break;
                                    case 3:
                                        chargeFieldDisk = chargeFieldDisk * Math.pow(10, -9);
                                        break;
                                    case 4:
                                        chargeFieldDisk = chargeFieldDisk;
                                        break;
                                }
                                double distanceFieldDisk = view.readDouble("Ingrese la distancia");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        distanceFieldDisk = distanceFieldDisk / 1000;
                                        break;
                                    case 2:
                                        distanceFieldDisk = distanceFieldDisk / 100;
                                        break;
                                    case 3:
                                        distanceFieldDisk = distanceFieldDisk;
                                        break;
                                }
                                double ratioDisk = view.readDouble("Ingrese el valor del radio del anillo");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioDisk = ratioDisk / 1000;
                                        break;
                                    case 2:
                                        ratioDisk = ratioDisk / 100;
                                        break;
                                    case 3:
                                        ratioDisk = ratioDisk;
                                        break;
                                }
                                view.showInfo(model.diskElectricField(distanceFieldDisk, ratioDisk, chargeFieldDisk));
                                break;
                        }

                    case 3:
                        double chargeElectricalFlow = view.readDouble("Ingrese el valor de la carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                chargeElectricalFlow = chargeElectricalFlow * Math.pow(10, -6);
                                break;
                            case 2:
                                chargeElectricalFlow = chargeElectricalFlow * Math.pow(10, -12);
                                break;
                            case 3:
                                chargeElectricalFlow = chargeElectricalFlow * Math.pow(10, -9);
                                break;
                            case 4:
                                chargeElectricalFlow = chargeElectricalFlow;
                                break;
                        }
                        view.showInfo("A continuación eligirá la figura para identificar el área sobre el que se trabajará");
                        menuFigures = view.readInt("Figuras" +
                                "\n Selecciona una opción" +
                                "\n 1. Cilindro" +
                                "\n 2. Cuadrado" +
                                "\n 3. Paralelogramo" +
                                "\n 4. Circunferencia");
                        switch (menuFigures) {
                            case 1:
                                double ratioCilin = view.readDouble("Ingrese el radio del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioCilin = ratioCilin / 1000;
                                        break;
                                    case 2:
                                        ratioCilin = ratioCilin / 100;
                                        break;
                                    case 3:
                                        ratioCilin = ratioCilin;
                                        break;
                                }
                                double areaCilindric = 2 * Math.PI * Math.pow(ratioCilin, 2);
                                double electricFieldCilindric = view.readDouble("Ingrese el campo eléctrico del cilindro");
                                double gradesCilindric = view.readDouble("Ingrese los grados de la superficie gaussiana");
                                view.showInfo(model.electricalFlow(electricFieldCilindric, areaCilindric, gradesCilindric, chargeElectricalFlow));
                                break;
                            case 2:
                                double lado = view.readDouble("Ingrese la medida del lado del cuadrado ");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        lado = lado / 1000;
                                        break;
                                    case 2:
                                        lado = lado / 100;
                                        break;
                                    case 3:
                                        lado = lado;
                                        break;
                                }
                                double squareArea = lado * lado;
                                double electricFieldSquare = view.readDouble("Ingrese el campo eléctrico del cilindro");
                                double gradesSquare = view.readDouble("Ingrese los grados de la superficie gaussiana");
                                view.showInfo(model.electricalFlow(electricFieldSquare, squareArea, gradesSquare, chargeElectricalFlow));
                                break;
                            case 3:
                                double base = view.readDouble("Ingrese la base del paralelogramo");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        base = base / 1000;
                                        break;
                                    case 2:
                                        base = base / 100;
                                        break;
                                    case 3:
                                        base = base;
                                        break;
                                }
                                double high = view.readDouble("Ingrese la altura del paralelogramo");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        high = high / 1000;
                                        break;
                                    case 2:
                                        high = high / 100;
                                        break;
                                    case 3:
                                        high = high;
                                        break;
                                }
                                double areaParale = base * high;
                                double electricFieldParale = view.readDouble("Ingrese el campo eléctrico del paralelogramo");
                                double gradesParalel = view.readDouble("Ingrese los grados de la superficie gaussiana");
                                view.showInfo(model.electricalFlow(electricFieldParale, areaParale, gradesParalel, chargeElectricalFlow));
                                break;
                            case 4:
                                double ratioCirc = view.readDouble("Ingrese el radio del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioCirc = ratioCirc / 1000;
                                        break;
                                    case 2:
                                        ratioCirc = ratioCirc / 100;
                                        break;
                                    case 3:
                                        ratioCirc = ratioCirc;
                                        break;
                                }
                                double areaCirc = Math.PI * Math.pow(ratioCirc, 2);
                                double electricFieldCirc = view.readDouble("Ingrese el campo eléctrico de la circunferencia");
                                double gradesCirc = view.readDouble("Ingrese los grados de la superficie gaussiana");
                                view.showInfo(model.electricalFlow(electricFieldCirc, areaCirc, gradesCirc, chargeElectricalFlow));
                                break;
                        }
                    case 4:
                        double chargeGaussLaw = view.readDouble("Ingrese el valor de la carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                chargeGaussLaw = chargeGaussLaw * Math.pow(10, -6);
                                break;
                            case 2:
                                chargeGaussLaw = chargeGaussLaw * Math.pow(10, -12);
                                break;
                            case 3:
                                chargeGaussLaw = chargeGaussLaw * Math.pow(10, -9);
                                break;
                            case 4:
                                chargeGaussLaw = chargeGaussLaw;
                                break;
                        }
                        menuFigures2 = view.readInt("Figuras" +
                                "\n Selecciona una opción" +
                                "\n 1. Cilindro" +
                                "\n 2. Esferas");
                        switch (menuFigures2) {
                            case 1:
                                double ratioCilin2 = view.readDouble("Ingrese el radio del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioCilin2 = ratioCilin2 / 1000;
                                        break;
                                    case 2:
                                        ratioCilin2 = ratioCilin2 / 100;
                                        break;
                                    case 3:
                                        ratioCilin2 = ratioCilin2;
                                        break;
                                }
                                double highCilin = view.readDouble("Ingrese el radio del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        highCilin = highCilin / 1000;
                                        break;
                                    case 2:
                                        highCilin = highCilin / 100;
                                        break;
                                    case 3:
                                        highCilin = highCilin;
                                        break;
                                }
                                double areaCilin2 = (2 * Math.PI * ratioCilin2 * highCilin) + (2 * Math.PI * Math.pow(ratioCilin2, 2));
                                double volumenCilin2 = (Math.PI * Math.pow(ratioCilin2, 2) * highCilin);
                                view.showInfo(model.gaussLaw(areaCilin2, chargeGaussLaw, volumenCilin2));
                                break;
                            case 2:
                                double ratioEsphere = view.readDouble("Ingrese el radio del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioEsphere = ratioEsphere / 1000;
                                        break;
                                    case 2:
                                        ratioEsphere = ratioEsphere / 100;
                                        break;
                                    case 3:
                                        ratioEsphere = ratioEsphere;
                                        break;
                                }
                                double areaEsphere = 4 * Math.PI * Math.pow(ratioEsphere, 2);
                                double volumenEsphere = (4 * Math.PI * Math.pow(ratioEsphere, 3)) / 3;
                                view.showInfo(model.gaussLaw(areaEsphere, chargeGaussLaw, volumenEsphere));
                                break;
                        }
                    case 5:
                        double firstChargeEP = view.readDouble("Ingrese el valor de la primera carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                firstChargeEP = firstChargeEP * Math.pow(10, -6);
                                break;
                            case 2:
                                firstChargeEP = firstChargeEP * Math.pow(10, -12);
                                break;
                            case 3:
                                firstChargeEP = firstChargeEP * Math.pow(10, -9);
                                break;
                            case 4:
                                firstChargeEP = firstChargeEP;
                                break;
                        }
                        double secondChargeEP = view.readDouble("Ingrese el valor de la segunda carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                secondChargeEP = secondChargeEP * Math.pow(10, -6);
                                break;
                            case 2:
                                secondChargeEP = secondChargeEP * Math.pow(10, -12);
                                break;
                            case 3:
                                secondChargeEP = secondChargeEP * Math.pow(10, -9);
                                break;
                            case 4:
                                secondChargeEP = secondChargeEP;
                                break;
                        }
                        double distanceEP = view.readDouble("Ingrese la distancia entre las dos cargas");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distanceEP = distanceEP / 1000;
                                break;
                            case 2:
                                distanceEP = distanceEP / 100;
                                break;
                            case 3:
                                distanceEP = distanceEP;
                                break;
                        }
                        double thirdChargeEP = view.readDouble("Imagine que entra una tercera carga en el sistema. Ingrese el valor de la tercera carga carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                thirdChargeEP = thirdChargeEP * Math.pow(10, -6);
                                break;
                            case 2:
                                thirdChargeEP = thirdChargeEP * Math.pow(10, -12);
                                break;
                            case 3:
                                thirdChargeEP = thirdChargeEP * Math.pow(10, -9);
                                break;
                            case 4:
                                thirdChargeEP = thirdChargeEP;
                                break;
                        }
                        double distanceEP13 = view.readDouble("Ingrese la distancia entre la carga 1 y 3");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distanceEP13 = distanceEP13 / 1000;
                                break;
                            case 2:
                                distanceEP13 = distanceEP13 / 100;
                                break;
                            case 3:
                                distanceEP13 = distanceEP13;
                                break;
                        }
                        double distanceEP23 = view.readDouble("Ingrese la distancia entre la carga 2 y 3");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distanceEP23 = distanceEP23 / 1000;
                                break;
                            case 2:
                                distanceEP23 = distanceEP23 / 100;
                                break;
                            case 3:
                                distanceEP23 = distanceEP23;
                                break;
                        }

                        view.showInfo("Imagine también que se ubica un punto dentro el sistema, ingrese las distancias del punto a cada una de las cargas");

                        double distancePoint = view.readDouble("Ingrese la distancia entre la carga 1 y el punto A");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distancePoint = distancePoint / 1000;
                                break;
                            case 2:
                                distancePoint = distancePoint / 100;
                                break;
                            case 3:
                                distancePoint = distancePoint;
                                break;
                        }
                        double distancePoint2 = view.readDouble("Ingrese la distancia entre la carga 2 y el punto A");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distancePoint2 = distancePoint2 / 1000;
                                break;
                            case 2:
                                distancePoint2 = distancePoint2 / 100;
                                break;
                            case 3:
                                distancePoint2 = distancePoint2;
                                break;
                        }
                        double distancePoint3 = view.readDouble("Ingrese la distancia entre la carga 3 y el punto A");
                        menuMed = view.readInt("Mediciones" +
                                "\n Selecciona una opción" +
                                "\n 1. mm" +
                                "\n 2. cm" +
                                "\n 3. m");
                        switch (menuMed) {
                            case 1:
                                distancePoint3 = distancePoint3 / 1000;
                                break;
                            case 2:
                                distancePoint3 = distancePoint3 / 100;
                                break;
                            case 3:
                                distancePoint3 = distancePoint3;
                                break;
                        }
                        view.showInfo(model.potentialElectricEnergy(firstChargeEP, secondChargeEP, thirdChargeEP, distanceEP, distanceEP13, distanceEP23, distancePoint, distancePoint2, distancePoint3));
                        break;
                    case 6:
                        double chargeCap = view.readDouble("Ingrese el valor de la primera carga");
                        menuCharges = view.readInt("Cargas" +
                                "\n Selecciona una opción" +
                                "\n 1. Micro (E-6)" +
                                "\n 2. Pico (E-12)" +
                                "\n 3. Nano (E-9)" +
                                "\n 4. N/A");
                        switch (menuCharges) {
                            case 1:
                                chargeCap = chargeCap * Math.pow(10, -6);
                                break;
                            case 2:
                                chargeCap = chargeCap * Math.pow(10, -12);
                                break;
                            case 3:
                                chargeCap = chargeCap * Math.pow(10, -9);
                                break;
                            case 4:
                                chargeCap = chargeCap;
                                break;
                        }
                        menuCap = view.readInt("Capacitancia" +
                                "\n Selecciona una opción" +
                                "\n 1. Capacitancia" +
                                "\n 2. Capacitor esférico" +
                                "\n 3. Capacitor cilíndico");
                        switch (menuCap) {
                            case 1:
                                double ladoSq = view.readDouble("Ingrese la medida del lado del cuadrado ");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ladoSq = ladoSq / 1000;
                                        break;
                                    case 2:
                                        ladoSq = ladoSq / 100;
                                        break;
                                    case 3:
                                        ladoSq = ladoSq;
                                        break;
                                }
                                double distancePlaca = view.readDouble("Ingrese la distancia entre las placas");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        distancePlaca = distancePlaca / 1000;
                                        break;
                                    case 2:
                                        distancePlaca = distancePlaca / 100;
                                        break;
                                    case 3:
                                        distancePlaca = distancePlaca;
                                        break;
                                }
                                double squareArea = ladoSq * ladoSq;
                                view.showInfo(model.capacitance(chargeCap, squareArea, distancePlaca));
                            case 2:
                                double ratioA = view.readDouble("Ingrese el radio interno de la esfera");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioA = ratioA / 1000;
                                        break;
                                    case 2:
                                        ratioA = ratioA / 100;
                                        break;
                                    case 3:
                                        ratioA = ratioA;
                                        break;
                                }
                                double ratioB = view.readDouble("Ingrese el radio externo de la esfera");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioB = ratioB / 1000;
                                        break;
                                    case 2:
                                        ratioB = ratioB / 100;
                                        break;
                                    case 3:
                                        ratioB = ratioB;
                                        break;
                                }
                                double ratioGauss = view.readDouble("Ingrese el radio externo de la esfera");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioGauss = ratioGauss / 1000;
                                        break;
                                    case 2:
                                        ratioGauss = ratioGauss / 100;
                                        break;
                                    case 3:
                                        ratioGauss = ratioGauss;
                                        break;
                                }
                                view.showInfo(model.esphericCapacitor(ratioA, ratioB, chargeCap, ratioGauss));
                                break;
                            case 3:
                                double ratioAEs = view.readDouble("Ingrese el radio interno del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioAEs = ratioAEs / 1000;
                                        break;
                                    case 2:
                                        ratioAEs = ratioAEs / 100;
                                        break;
                                    case 3:
                                        ratioAEs = ratioAEs;
                                        break;
                                }
                                double ratioBEs = view.readDouble("Ingrese el radio externo del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        ratioBEs = ratioBEs / 1000;
                                        break;
                                    case 2:
                                        ratioBEs = ratioBEs / 100;
                                        break;
                                    case 3:
                                        ratioBEs = ratioBEs;
                                        break;
                                }
                                double lenghtEs = view.readDouble("Ingrese la longitud del cilindro");
                                menuMed = view.readInt("Mediciones" +
                                        "\n Selecciona una opción" +
                                        "\n 1. mm" +
                                        "\n 2. cm" +
                                        "\n 3. m");
                                switch (menuMed) {
                                    case 1:
                                        lenghtEs = lenghtEs / 1000;
                                        break;
                                    case 2:
                                        lenghtEs = lenghtEs / 100;
                                        break;
                                    case 3:
                                        lenghtEs = lenghtEs;
                                        break;
                                }
                                view.showInfo(model.cilindricCapacitor(lenghtEs, ratioAEs, ratioBEs, chargeCap));
                                break;
                        }
                        break;
                    case 7:
                        menuSum = view.readInt("Suma de capacitores" +
                                "\n Selecciona una opción" +
                                "\n 1. En serie" +
                                "\n 2. En paralelo" );
                        switch (menuSum){
                            case 1:
                                double cap1 = view.readDouble("Ingrese la capacitancia 1 de la serie");
                                double cap2 = view.readDouble("Ingrese la capacitancia 2 de la serie");
                                double cap3 = view.readDouble("Ingrese la capacitancia 3 de la serie");
                                double cap4 = view.readDouble("Ingrese la capacitancia 4 de la serie");
                                view.showInfo(model.sumOfCapacitorsSerie(cap1,cap2,cap3,cap4));
                                break;
                            case 2:
                                double cap11 = view.readDouble("Ingrese la capacitancia 1 del paralelo");
                                double cap21 = view.readDouble("Ingrese la capacitancia 2 del paralelo");
                                double cap31 = view.readDouble("Ingrese la capacitancia 3 del paralelo");
                                double cap41 = view.readDouble("Ingrese la capacitancia 4 del paralelo");
                                view.showInfo(model.sumOfCapacitorsParallel(cap11,cap21,cap31,cap41));
                                break;
                        }
                    case 8:
                        double energy = view.readDouble("Ingrese la energía usada en el sistema");
                        view.showInfo(model.storedEnergy(energy));
                        break;
                    case 0:
                        view.showInfo("Hasta luego");
                        break;
                    default:
                        view.warningMessage("Selecciona una opción valida.");
                        break;
                }
            } while (menu != 0);
        } catch (NumberFormatException formato) {
            view.showInfo("No debes ingresar letra, ni simbolos dentro del menu :)");
            init();
        }
    }

}
