/*RM: 558887*/
import java.util.Scanner;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime a = new Anime();
        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite o nome do anime: ");
        a.nome = texto.nextLine();
        System.out.println("Digite a classificação indicativa 10, 12, 14, 16, 18, para classificação livre digite 0 ");
        a.classificacaoIndicativa = numeros.nextInt();
        System.out.println("Digite o autor do anime: ");
        a.autor = texto.nextLine();
        System.out.println("Digite o genero do anime: ");
        a.genero = texto.nextLine();
        System.out.println("Digite a quantidade de episódios: ");
        a.qtdEpisodios = numeros.nextInt();
        System.out.println("Digite o numero de temporadas: ");
        a.numeroTemporadas = numeros.nextInt();
        a.exibirDadosAnime();
        System.out.println(a.mensagem);

        Anime meuAnime = new Anime("Jujutsu Kaisen", 12);
        meuAnime.qtdEpisodios = 48;
        meuAnime.numeroTemporadas = 2;
        meuAnime.exibirDadosAnime();
        System.out.println("\n********** MEU ANIME **********\n" + meuAnime.mensagem);
    }
}
