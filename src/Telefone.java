public class Telefone {

    private TipoTelefone tipo;
    private String ddi;
    private String ddd;

    private String numero;

    public Telefone(TipoTelefone tipo, String ddi, String ddd, String numero){
        this.tipo = tipo;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;

    }


    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
