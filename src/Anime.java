/*RM: 558887*/
public class Anime {
    String nome;
    int classificacaoIndicativa;
    String genero;
    String autor;
    int qtdEpisodios;
    int numeroTemporadas;
    String mensagem;

    /**Construtor vazio criado para poder criar o objeto na Main**/
    public Anime() {

    }
    public Anime (String nome, int classificacao){
        this.nome = nome;
        this.classificacaoIndicativa = classificacao;
    }

    public int mediaEpisodiosPorTemporada(){
        return qtdEpisodios / numeroTemporadas;
    }
    public String exibirClassificacao(int classifica){
        this.classificacaoIndicativa = classifica;
        String indicacao;
        if (classifica == 0){
            indicacao = "LIVRE PARA TODOS OS PÚBLICOS.";
        }else if(classifica == 10){
            indicacao = "NÃO RECOMENDADO PARA MENORES DE 10 ANOS.";
        }else if(classifica == 12){
            indicacao = "NÃO RECOMENDADO PARA MENORES DE 12 ANOS.";
        }else if(classifica == 14){
            indicacao = "NÃO RECOMENDADO PARA MENORES DE 14 ANOS.";
        }else if(classifica == 16){
            indicacao = "NÃO RECOMENDADO PARA MENORES DE 16 ANOS.";
        }else{
            indicacao = "NÃO RECOMENDADO PARA MENORES DE 18 ANOS.";
        }
        return indicacao;
    }
    public String exibirDadosAnime(){
        String mensagem = "Nome do anime: " + this.nome + "\nDe acordo com o Ministério da Justiça, esse Anime é: "
                + exibirClassificacao(classificacaoIndicativa)
                + "\nA média de episódios por temporada é de: "
                + mediaEpisodiosPorTemporada()
                + " episódios.";
        this.mensagem = mensagem;
        return mensagem;
    }
}
