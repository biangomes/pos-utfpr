public class TstConta {
    public static void main(String[] args) throws NumException {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNumeroConta(20);
        pj.setCnpj(30);
        pj.getEnder().setRua("castilho");
        pj.getResponsavel().setCpf(15);
        pj.getResponsavel().setNome("Beatriz");

        System.out.println(pj.getNumeroConta());
        pj.validar();
        System.out.println(pj.getCnpj());
        System.out.println(pj.getEnder().getRua());
        System.out.println(pj.getResponsavel().getCpf());
        pj.getResponsavel().verifDoc();
        System.out.println(pj.getResponsavel().getNome());
    }
}