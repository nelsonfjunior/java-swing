
package revisaoprova;

class Pessoa {
    private String nome;
    private String cidade;
    private String sistema;
    private String versao;
    private String memoria;
    private String processador;
    private String hd;

    public Pessoa(String nome, String cidade, String sistema, String versao, String memoria, String processador, String hd) {
        this.nome = nome;
        this.cidade = cidade;
        this.sistema = sistema;
        this.versao = versao;
        this.memoria = memoria;
        this.processador = processador;
        this.hd = hd;
    }
    
    
    public Object[] obterDados(){
        return new Object[] {nome, cidade, sistema, versao, memoria, processador, hd};
    }
    
}
