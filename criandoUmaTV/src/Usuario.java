public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Ligando a TV...");
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Desligando a TV...");
        System.out.println("TV ligada? " + smartTV.ligada);

        //Aumentar e diminuir o volume de um em um
        smartTV.aumentarVolume();

        smartTV.diminuirVolume();

        //mudando canais

        smartTV.aumentarCanal(); //Aumentando os canais um a um

        smartTV.diminuirCanal(); //Diminuindo os canais um a um

        smartTV.mudarCanal(12); //Definindo o canal desejado

    }
}
