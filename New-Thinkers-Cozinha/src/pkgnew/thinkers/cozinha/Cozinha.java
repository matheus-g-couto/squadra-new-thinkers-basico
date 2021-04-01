package pkgnew.thinkers.cozinha;

/**
 *
 * @author Matheus Couto
 */
public class Cozinha {

    private String tipo;
    private int numeroCozinheiros;
    private int tempoPreparo;
    private int horaAbertura;
    private int horaFechamento;
    private String pratoPrincipal;
    private int numeroPratos;

    private Ingrediente ingredientes[];
    private Funcionario funcionarios[];

    public Cozinha() {
    }

    public Cozinha(String tipo, int horaAbertura, int horaFechamento, String pratoPrincipal) {
        this.tipo = tipo;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroCozinheiros() {
        return numeroCozinheiros;
    }

    public void setNumeroCozinheiros(int numeroCozinheiros) {
        this.numeroCozinheiros = numeroCozinheiros;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public int getNumeroPratos() {
        return numeroPratos;
    }

    void setNumeroPratos(int n) {
        numeroPratos = n;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    void prepararPratos() {
        //O que eu preciso fazer para preparar um prato?
    }

    void lavarLouca() {

    }

}
