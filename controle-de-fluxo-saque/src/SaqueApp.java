public class SaqueApp {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSaque = 20.0;

        String mensagem = valorSaque <= saldo ? "Saque realizado com Sucesso!" + " Seu saldo é: R$" + (saldo - valorSaque) : "Valor do saque maior que o saldo disponível. Seu saldo é: R$" + saldo;
        System.out.println(mensagem);
    }
}
