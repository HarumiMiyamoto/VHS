package vhs_producoes;

public class Venda {
    int IdVendas,ID_funcionario,ID_cliente,idFilmagem;
    String data;
    int valor;

    public Venda(int IdVendas,  int ID_funcionario,int ID_cliente, int idFilmagem, String data ,int valor) {
        this.IdVendas = IdVendas;
        this.ID_funcionario=ID_funcionario;
        this.ID_cliente=ID_cliente;
        this.ID_funcionario=ID_funcionario;
        this.data = data;
        this.valor=valor ;
    }

    public Venda(int ID_funcionario, int ID_cliente, int idFilmagem, String data, int valor) {
        this.ID_funcionario = ID_funcionario;
        this.ID_cliente = ID_cliente;
        this.idFilmagem = idFilmagem;
        this.data = data;
        this.valor = valor;
    }

    public int getIdVendas() {
        return IdVendas;
    }

    public void setIdVendas(int IdVendas) {
        this.IdVendas = IdVendas;
    }

    public int getID_funcionario() {
        return ID_funcionario;
    }

    public void setID_funcionario(int ID_funcionario) {
        this.ID_funcionario = ID_funcionario;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getIdFilmagem() {
        return idFilmagem;
    }

    public void setIdFilmagem(int idFilmagem) {
        this.idFilmagem = idFilmagem;
    }

   

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Venda(String data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   public Venda(String data, int valor) {
       this.data= data;
       this.valor=valor;
   }
    
}
