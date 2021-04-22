public enum TesteEnum {
    ABACATE(1,"abacate"),
    MACA(2,"maçã"),
    UVA(3,"uva");

    private int cod;
    private String nome;

    TesteEnum(final int cod,final String nome){
        this.cod = cod;
        this.nome = nome;
    }
}
