public class SaqueCaixaEletronico {
    public  static void main(String[] args) {
      double saldo = 25.0;
      double valorSaque = 26.0;

      if (valorSaque <= saldo) {
        saldo = saldo - valorSaque;
        System.out.println("Seu saldo é: R$" + saldo);}

      else { 
        System.out.println("Valor do saque maior que o saldo disponível.");
        System.out.println("Seu saldo é: R$" + saldo);}
      
}
}