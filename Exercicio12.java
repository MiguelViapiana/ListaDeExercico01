public class Exercicio12 {
    public static void executar(){
        int num = Prompt.lerInteiro("\nDigite o número do mês desejado: ");
        switch (num) {
            case 1:
                System.out.println("Mês: Janeiro");
                break;
            case 2:
                System.out.println("Mês: Fevereiro");
                break;
            case 3:
                System.out.println("Mês: Março");
                break;
            case 4:
                System.out.println("Mês: Abril");
                break;
            case 5:
                System.out.println("Mês: Maio");
                break;
            case 6:
                System.out.println("Mês: Junho");
                break;
            case 7:
                System.out.println("Mês: Julho");
                break;
            case 8:
                System.out.println("Mês: Agosto");
                break;
            case 9:
                System.out.println("Mês: Setembro");
                break;
            case 10:
                System.out.println("Mês: Outubro");
                break;
            case 11:
                System.out.println("Mês: Novembro");
                break;
            case 12:
                System.out.println("Mês: Dezembro");
                break;
            default:
                System.out.println("Mês inválido!!");
                break;
        }
    }
}
