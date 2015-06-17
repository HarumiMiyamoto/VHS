package vhs_producoes;

public class Gerente {
    int nota_fiscal,  idHelp ,pagamento, despesas, compra_help; 
    
 
 public  Gerente(int nota_fiscal, int idHelp, int pagamento, int despesas, int compra_help ){
  this.nota_fiscal= nota_fiscal;
  this.idHelp=idHelp;
  this.pagamento=pagamento;
  this.despesas=despesas;
  this.compra_help=compra_help;
 }

    public int getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(int nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public int getIdHelp() {
        return idHelp;
    }

    public void setIdHelp(int idHelp) {
        this.idHelp = idHelp;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public int getDespesas() {
        return despesas;
    }

    public void setDespesas(int despesas) {
        this.despesas = despesas;
    }

    public int getCompra_help() {
        return compra_help;
    }

    public void setCompra_help(int compra_help) {
        this.compra_help = compra_help;
    }
 public Gerente(int pagamento , int despesas , int compa_help){
  this.pagamento=pagamento;
  this.despesas=despesas;
  this.compra_help= compra_help;
     
     
  }
}  
