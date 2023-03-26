package org.example;

public class Receita implements Cloneable{
    private int Ovos;
    private int CaixaLeite;
    private int ColherFarinhaDeTrigo;

    public Receita(int Ovos, int CaixaLeite, int ColherFarinhaDeTrigo) {
        super();
        this.Ovos = Ovos;
        this.CaixaLeite = CaixaLeite;
        this.ColherFarinhaDeTrigo = ColherFarinhaDeTrigo;
    }

    public int getOvos() {
        return Ovos;
    }

    public void setOvos(int Ovos) {
        this.Ovos = Ovos;
    }

    public int getCaixaLeite() {
        return CaixaLeite;
    }

    public void setCaixaLeite(int CaixaLeite) {
        this.CaixaLeite = CaixaLeite;
    }

    public int getColherFarinhaDeTrigo() {
        return ColherFarinhaDeTrigo;
    }

    public void setColherFarinhaDeTrigo(int ColherFarinhaDeTrigo) {
        this.ColherFarinhaDeTrigo = ColherFarinhaDeTrigo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Receita { " +
                "Numero de Ovos = " + Ovos + "" +
                ", Caixa de leite = " + CaixaLeite + "" +
                ", Colher de farinha = " + ColherFarinhaDeTrigo + "" +
                '}';
    }
}
