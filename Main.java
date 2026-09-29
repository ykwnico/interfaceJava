static void main() {

//        // Aqui instanciamos a classe Televisao, e puxamos o metodo da interface Ligavel
        Televisao televisao = new Televisao();
        televisao.ligar();
//        // Resultado: A TV está ligada


        // Aqui instanciamos a classe Carro, preenchemos o construtor e temos as saídas
        Carro carro = new Carro("HB20", "1234756789", "Comfort", "Hyundai");


        IO.println("Nome do carro: " + carro.getNome());
        IO.println("ID do carro: " + carro.getId());
        IO.println("Modelo do carro: " + carro.getModelo());
        IO.println("Fabricante do carro: " + carro.getFabricante());
        // Resultado:
        // Nome do carro: HB20
        //ID do carro: 1234756789
        //Modelo do carro: Comfort
        //Fabricante do carro: Hyundai
    }

