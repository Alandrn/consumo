public class Main {
    public static void main(String[] args) {
        double consumo = 8;

        System.out.println("De acuerdo al consumo de tu vehiculo se determino que:");
        if (consumo > 16){
            System.out.println("Este vehiculo es muy ahorrador");
        } else if (consumo > 15){
            System.out.println("Este vehiculo, si ahorra");
        } else if (consumo>14){
            System.out.println("Este vehiculo gasta moderada moderadamente");
        } else if (consumo > 12) {
            System.out.println("Este vehiculo gasta combustible excesivamente");
        } else  {
            System.out.println("Este vehiculo te va a dejar pobre");
        }

    }

}