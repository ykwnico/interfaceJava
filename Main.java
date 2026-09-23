static void main() {

        // Aqui instanciamos a classe Televisao, e puxamos o metodo da interface Ligavel
        Televisao televisao = new Televisao();
        televisao.ligar();
        // Resultado: A TV está ligada


        // Aqui instanciamos a classe Carro, preenchemos o construtor e temos as saídas
        Carro carro = new Carro("sandero", "sei nao", "hb20", "marrom");


        IO.println("Nome do carro: " + carro.getNome());
        IO.println("ID do carro: " + carro.getId());
        IO.println("Modelo do carro: " + carro.getModelo());
        IO.println("Fabricante do carro: " + carro.getFabricante());
        // Resultado:
        // Nome do carro: sandero
        //ID do carro: sei nao
        //Modelo do carro: hb20
        //Fabricante do carro: marrom
    }

