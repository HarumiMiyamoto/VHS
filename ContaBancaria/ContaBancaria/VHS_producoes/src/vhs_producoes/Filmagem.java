package vhs_producoes;

public class Filmagem {
    int idFilmagem,idHelp;
    String Descr_filmagem, data_entrega;

    public Filmagem(int idFilmagem,int idHelp , String Descr_filmagem, String data_entrega) {
        this.idFilmagem = idFilmagem;
        this.idHelp=idHelp;
        this.Descr_filmagem = Descr_filmagem;
        this.data_entrega = data_entrega;
    }

    public int getIdFilmagem() {
        return idFilmagem;
    }

    public void setIdFilmagem(int idFilmagem) {
        this.idFilmagem = idFilmagem;
    }

    public int getIdHelp() {
        return idHelp;
    }

    public void setIdHelp(int idHelp) {
        this.idHelp = idHelp;
    }


    public String getDescr_filmagem() {
        return Descr_filmagem;
    }

    public void setDescr_filmagem(String Descr_filmagem) {
        this.Descr_filmagem = Descr_filmagem;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Filmagem(String Descr_filmagem, String data_entrega) {
        this.Descr_filmagem = Descr_filmagem;
        this.data_entrega = data_entrega;
    }

    public Filmagem(int idHelp, String Descr_filmagem, String data_entrega) {
        this.idHelp = idHelp;
        this.Descr_filmagem = Descr_filmagem;
        this.data_entrega = data_entrega;
    }
    
    
}
