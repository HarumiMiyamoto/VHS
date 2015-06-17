package vhs_producoes;

public class Help {
    String tipo;
    int id;

    public Help(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Help(String tipo) {
        this.tipo = tipo;
    }
    
}
