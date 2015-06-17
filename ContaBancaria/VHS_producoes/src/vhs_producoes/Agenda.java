package vhs_producoes;

public class Agenda {
    String local_gravacao, hora, data, tipo_gravacao;
    int ID_agenda, idFilmagem;
   
   

    public Agenda(String local_gravacao, String hora, String data, String tipo_gravacao, int ID_agenda, int idFilmagem) {
        this.local_gravacao = local_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
        this.ID_agenda = ID_agenda;
        this.idFilmagem= idFilmagem;
    }

    public String getLocal_gravacao() {
        return local_gravacao;
    }

    public void setLocal_gravacao(String local_gravacao) {
        this.local_gravacao = local_gravacao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo_gravacao() {
        return tipo_gravacao;
    }

    public void setTipo_gravacao(String tipo_gravacao) {
        this.tipo_gravacao = tipo_gravacao;
    }

    public int getId() {
        return ID_agenda;
    }

    public void setId(int Id_agenda) {
        this.ID_agenda = Id_agenda;
    }

    public int getIdFilmagem() {
        return idFilmagem;
    }

    public void setIdFilmagem(int idFilmagem) {
        this.idFilmagem = idFilmagem;
    }
     

    public Agenda(String local_gravacao, String hora, String data, String tipo_gravacao, int id_Filmagem) {
        this.local_gravacao = local_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
        this.idFilmagem = id_Filmagem;
    }
    
}
