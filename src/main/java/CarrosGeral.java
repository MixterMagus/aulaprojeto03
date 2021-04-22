public abstract class CarrosGeral implements Carro{
    private String marca;
    private int codigo;
    private float peso;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void getInformation(){
        System.out.println("-------------------------------------");
        System.out.println("|Marca :  "+this.marca);
        System.out.println("|Peso  :  "+this.peso);
        System.out.println("|Codigo:  "+this.codigo);
        System.out.println("-------------------------------------");
    }
}
