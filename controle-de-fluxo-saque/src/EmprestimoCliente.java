public class EmprestimoCliente {
    public static void main(String[] args) {
        String Conta = "Prata";

        switch (Conta) {
            case "Bronze": {
                System.out.println("Cliente seu emprestimo foi aprovado no valor R$1.000,00.");
            } break;
            case "Prata": {
                System.out.println("Cliente seu emprestimo foi aprovado no valor R$2.000,00.");
            } break;
            case "Ouro": {
                System.out.println("Cliente seu emprestimo foi aprovado no valor R$3.000,00.");
            }
            default:
                break;
        }
    }
}
