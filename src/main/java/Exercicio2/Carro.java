package Exercicio2;

public class Carro {

    public Carro(String marca, String modelo, Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getVariante(){
        return variante;
    }

    public Integer getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVariante(String variante){
        this.variante = variante;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }
}
