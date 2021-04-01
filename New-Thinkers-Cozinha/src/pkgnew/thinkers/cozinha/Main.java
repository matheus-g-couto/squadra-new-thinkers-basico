package pkgnew.thinkers.cozinha;

import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author Matheus Couto
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Iniciando os trabalhos do restaurante");
        System.out.println("----------------------------------------------------------------------");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Ingrediente feijao = new Ingrediente("Feijão", format.parse("05/05/2021"));
        Ingrediente farinha = new Ingrediente("Farinha", format.parse("23/07/2021"));
        Ingrediente arroz = new Ingrediente("Arroz", format.parse("05/05/2021"));
        Ingrediente carneDePorco = new Ingrediente("Carne de Porco", format.parse("11/05/2021"));
        Ingrediente linguica = new Ingrediente("Linguiça", format.parse("11/05/2021"));
        Ingrediente champignon = new Ingrediente("Champignon", format.parse("20/04/2021"));
        Ingrediente brocolis = new Ingrediente("Brocólis", format.parse("20/04/2021"));
        Ingrediente macarrao = new Ingrediente("Macarrão", format.parse("22/06/2021"));
        Ingrediente carne = new Ingrediente("Carne", format.parse("11/05/2021"));
        Ingrediente molho = new Ingrediente("Molho", format.parse("08/09/2021"));

        // Cozinha Mineira
        Cozinha cozinhaMineira = new Cozinha("Mineira", 14, 20, "Feijoada");
        Ingrediente[] ingMineira = {feijao, farinha, arroz, carneDePorco, linguica};
        cozinhaMineira.setIngredientes(ingMineira);

        Funcionario funcM1 = new Funcionario("Matheus", "Chef");
        Funcionario funcM2 = new Funcionario("Enzo", "Cozinheiro");
        Funcionario funcM3 = new Funcionario("Alan", "Garçom");
        Funcionario funcM4 = new Funcionario("Tássia", "Garçonete");
        Funcionario[] funcMineira = {funcM1, funcM2, funcM3, funcM4};
        cozinhaMineira.setFuncionarios(funcMineira);

        // Cozinha Chinesa
        Cozinha cozinhaChinesa = new Cozinha("Chinesa", 10, 21, "Yakisoba");
        Ingrediente[] ingChinesa = {champignon, brocolis, macarrao, carne};
        cozinhaChinesa.setIngredientes(ingChinesa);

        Funcionario funcC1 = new Funcionario("Laura", "Chef");
        Funcionario funcC2 = new Funcionario("Carlos", "Cozinheiro");
        Funcionario funcC3 = new Funcionario("Lucas", "Garçom");
        Funcionario[] funcChinesa = {funcC1, funcC2, funcC3};
        cozinhaChinesa.setFuncionarios(funcChinesa);

        // Cozinha Italiana
        Cozinha cozinhaItaliana = new Cozinha("Italiana", 13, 22, "Pizza");
        Ingrediente[] ingItaliana = {molho, macarrao, carne};
        cozinhaItaliana.setIngredientes(ingItaliana);

        Funcionario funcI1 = new Funcionario("Alberto", "Chef");
        Funcionario funcI2 = new Funcionario("Sávio", "Garçom");
        Funcionario[] funcItaliana = {funcI1, funcI2};
        cozinhaItaliana.setFuncionarios(funcItaliana);

        Cozinha[] restaurante = {cozinhaMineira, cozinhaChinesa, cozinhaItaliana};
        System.out.println("Cozinhas disponíveis no nosso restaurante: \n");
        for (int i = 0; i < restaurante.length; i++) {
            System.out.println("Cozinha " + restaurante[i].getTipo() + ":");
            System.out.println("    horário de funcionamento: de " + restaurante[i].getHoraAbertura() + " à " + restaurante[i].getHoraFechamento());
            System.out.println("    prato principal: " + restaurante[i].getPratoPrincipal());
            System.out.println("    funcionários: ");

            Funcionario[] func = restaurante[i].getFuncionarios();
            for (int j = 0; j < restaurante[i].getFuncionarios().length; j++) {
                System.out.println("        " + func[j].getNome() + " — " + func[j].getAtividade());
            }

            System.out.println("");
        }
    }
}
