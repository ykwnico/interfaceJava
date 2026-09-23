static void main() {

        Televisao televisao = new Televisao();

        televisao.ligar();
        Carro carro = new Carro("sandero", "sei nao", "hb20", "marrom");

        IO.println("Nome do carro: " + carro.getNome());
        IO.println("ID do carro: " + carro.getId());
        IO.println("Modelo do carro: " + carro.getModelo());
        IO.println("Fabricante do carro: " + carro.getFabricante());
    }

