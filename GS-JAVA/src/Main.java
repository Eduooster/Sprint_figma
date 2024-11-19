public class Main {
    public static void main(String [] args){
        Organico banana = new Organico("Banana","alimentos");

        PontoColeta pontoColeta1 = new PontoColeta(LocalColeta.IBIRAPUERA, "7:00a até 17:00", 50,banana);

        Pessoa pessoa1 = new Pessoa("abreu", 14,"xxxxxx","yyyyy");

        pessoa1.doarResiduo(pontoColeta1,banana);
        System.out.println(pessoa1.getHistorico_residuos_doados());

    }
}
