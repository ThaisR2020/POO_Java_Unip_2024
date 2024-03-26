public class DadosInfo {
    int numeroDeIrmaos;
    double mediaFinalTurma;
    long populacaoLimeira;
    int numeroPassageirosOnibus;
    int numeroJogadoresFutebol;
    int anoAcontecimentoHistorico;
    double precoAutomovel;

    // Construtor
    public DadosInfo(int numeroDeIrmaos, double mediaFinalTurma, long populacaoLimeira, int numeroPassageirosOnibus, int numeroJogadoresFutebol, int anoAcontecimentoHistorico, double precoAutomovel) {
        this.numeroDeIrmaos = numeroDeIrmaos;
        this.mediaFinalTurma = mediaFinalTurma;
        this.populacaoLimeira = populacaoLimeira;
        this.numeroPassageirosOnibus = numeroPassageirosOnibus;
        this.numeroJogadoresFutebol = numeroJogadoresFutebol;
        this.anoAcontecimentoHistorico = anoAcontecimentoHistorico;
        this.precoAutomovel = precoAutomovel;
    }

    // Getters
    public int getNumeroDeIrmaos() {
        return numeroDeIrmaos;
    }

    public double getMediaFinalTurma() {
        return mediaFinalTurma;
    }

    public long getPopulacaoLimeira() {
        return populacaoLimeira;
    }

    public int getNumeroPassageirosOnibus() {
        return numeroPassageirosOnibus;
    }

    public int getNumeroJogadoresFutebol() {
        return numeroJogadoresFutebol;
    }

    public int getAnoAcontecimentoHistorico() {
        return anoAcontecimentoHistorico;
    }

    public double getPrecoAutomovel() {
        return precoAutomovel;
    }

    // Setters
    public void setNumeroDeIrmaos(int numeroDeIrmaos) {
        this.numeroDeIrmaos = numeroDeIrmaos;
    }

    public void setMediaFinalTurma(double mediaFinalTurma) {
        this.mediaFinalTurma = mediaFinalTurma;
    }

    public void setPopulacaoLimeira(long populacaoLimeira) {
        this.populacaoLimeira = populacaoLimeira;
    }

    public void setNumeroPassageirosOnibus(int numeroPassageirosOnibus) {
        this.numeroPassageirosOnibus = numeroPassageirosOnibus;
    }

    public void setNumeroJogadoresFutebol(int numeroJogadoresFutebol) {
        this.numeroJogadoresFutebol = numeroJogadoresFutebol;
    }

    public void setAnoAcontecimentoHistorico(int anoAcontecimentoHistorico) {
        this.anoAcontecimentoHistorico = anoAcontecimentoHistorico;
    }

    public void setPrecoAutomovel(double precoAutomovel) {
        this.precoAutomovel = precoAutomovel;
    }

    public static void main(String[] args) {
        // Cria uma instância de DadosInfo
        DadosInfo dados = new DadosInfo(2, 7.5, 300000, 45, 11, 1945, 35000.0);

        // Atualiza alguns valores usando setters
        dados.setNumeroDeIrmaos(3);
        dados.setMediaFinalTurma(8.0);
        dados.setPopulacaoLimeira(310000);
        dados.setNumeroPassageirosOnibus(50);
        dados.setNumeroJogadoresFutebol(11); // Este valor geralmente não muda
        dados.setAnoAcontecimentoHistorico(1969);
        dados.setPrecoAutomovel(45000.0);

        // Imprime os valores usando getters
        System.out.println("Número de Irmãos: " + dados.getNumeroDeIrmaos());
        System.out.println("Média Final da Turma: " + dados.getMediaFinalTurma());
        System.out.println("População de Limeira: " + dados.getPopulacaoLimeira());
        System.out.println("Número de Passageiros do Ônibus: " + dados.getNumeroPassageirosOnibus());
        System.out.println("Número de Jogadores de Futebol: " + dados.getNumeroJogadoresFutebol());
        System.out.println("Ano de um Acontecimento Histórico: " + dados.getAnoAcontecimentoHistorico());
        System.out.println("Preço do Automóvel: R$ " + dados.getPrecoAutomovel());
    }


}
