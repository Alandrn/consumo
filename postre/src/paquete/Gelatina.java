package paquete;

public class Gelatina {
    // Atributos
    String color;
    String sabor;


    // Métodos Getter
    public String getColor(){
        return this.color;
    }
    public String getSabor(){
        return this.sabor;
    }
    // Métodos Setter
    public void setcolor(String c){
        this.color = c;
    }
    public void setSabor(String s){
        this.sabor = s;
    }
    //Metodo para obtener toda la info de nuestros atributos
    public void mostrarInfo(){
        System.out.println("La informacion de la gelatina es:");
        System.out.println("Sabor: " + getSabor() );
        System.out.println("Color: " + getColor() );
    }

}


