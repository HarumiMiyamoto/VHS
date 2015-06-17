package vhs_producoes;

public class Cliente {
    
    String nome, rg, cpf, endereco, email, telefone;
    int ID_cliente;

    public Cliente(String nome, String rg, String cpf, String endereco, String email, String telefone, int ID_cliente) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.ID_cliente = ID_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return ID_cliente;
    }

    public void setId(int Id) {
        this.ID_cliente = ID_cliente;
    }

    public Cliente(String nome, String rg, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
}
