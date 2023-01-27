public class Main {
    public static void main(String[] args) {
        IphoneFactory iphoneX = new IphoneFactory(TipoIphone.IPHONE_X, "Preto", "5.8 ", "A11 Bionic", "2716 mAh");
        IphoneFactory iphone9 = new IphoneFactory(TipoIphone.IPHONE_9, "Vermelho", "4.7 ", "A13 Bionic", "2942 mAh");
        IphoneFactory iphone13Mini = new IphoneFactory(TipoIphone.IPHONE_13_MINI, "Azul", "5.4 ", "A15 Bionic", "2815 mAh");

        iphoneX.exibirDetalhes();
        iphone9.exibirDetalhes();
        iphone13Mini.exibirDetalhes();
    }
}