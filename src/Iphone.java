import java.util.Date;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private Long numeroSerial;

    private String modelo;

    private String cor;

    private Integer memoriaTotal;

    private Integer tamanhoTela;

    private Date dataFabricacao;


    public Iphone(Long numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public Long getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(Long numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMemoriaTotal() {
        return memoriaTotal;
    }

    public void setMemoriaTotal(Integer memoriaTotal) {
        this.memoriaTotal = memoriaTotal;
    }

    public Integer getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Integer tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void checarBateria() {
        System.out.println("Checando Bateria");
    }

    public void verificaMemoriaDisponivel() {
        System.out.println("Verificando memória disponível");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma aba nova");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }
}