public class Carro implements Veiculo, Motor{
    private String nome;
    private String id;
    private String modelo;
    private String fabricante;

    public Carro (String nome, String id, String modelo, String fabricante){
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }
}



