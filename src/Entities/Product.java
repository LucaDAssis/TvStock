package Entities;

public class Product {

    public String name;
    public double price;
    //quantity atributo da classe
    public int quantity;

    //construtor depois dos atributos
    public Product(String name, double price, int quantity){
        //palavra this é uma referencia para o objeto
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        //usando this. para usar o quantity do atributo e não o parametro
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        //aqui usando novamente o this.
        this.quantity -= quantity;
    }

    //Aqui estou reescrevendo o String padrão e aplicando o metodo da minha escolha para faciliar o processo.
    //também usei uma mascara de formatação para deixa com duas casas decimais %.2f.
    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity +
                " units, total: $ " +  String.format("%.2f", totalValueInStock());
    }
}
