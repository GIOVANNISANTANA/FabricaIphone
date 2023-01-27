public class IphoneFactory implements Iphone{
    private TipoIphone tipo;
    private String cor;
    private String tela;
    private String processador;
    private String bateria;

    public IphoneFactory(TipoIphone tipo, String cor, String tela, String processador, String bateria){
        this.tipo = tipo;
        this.cor = cor;
        this.tela = tela;
        this.processador = processador;
        this.bateria = bateria;
    }


    public void selectType(TipoIphone tipo) {
        this.tipo = tipo;
        System.out.println("Modelo de Iphone selecionado: " + tipo);
    }

    public void exibirDetalhes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Tela: " + tela);
        System.out.println("Processador: " + processador);
        System.out.println("Bateria: " + bateria );
        System.out.println("");
    }

    @Override
    public void selecionaTipo(TipoIphone tipo) {

    }
}
