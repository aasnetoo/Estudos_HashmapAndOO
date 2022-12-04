import java.util.List;

public class Contato {

    public String nome;
    public String sobrenome;
    private String empresa;
    private String Telefone;
    private String email;

    List<Telefone> telefones;

    public Contato (String nome, String sobrenome, String empresa, List<Telefone> telefones){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.empresa = empresa;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone() {
        return Telefone;
    }


    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
