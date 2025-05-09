//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int masa = 75; //Masa se establece en kgs.
        double estatura = 1.65; //en metros
        double IMC = masa/Math.pow(estatura, 2);
        /*IMC = 75 / (1.65)2  */
        System.out.println("La persona tiene una masa,kg.estatura.");
                if(IMC < 16){
                    System.out.println("La persona tiene delgadez severa ");
        } else if (IMC<18.5){
            System.out.println("La persona tiene delgadez moderada");
        } else if (IMC<30){
            System.out.println("La persona tiene sobrepeso");
        } else if (IMC<35) {
            System.out.println("La persona tiene obesidad leve");
        } else if (IMC<40) {
            System.out.println("La persona tiene obesidad media");
        }else {
            System.out.println("La persona tiene obesidad morbida");
        }

        }

    }
