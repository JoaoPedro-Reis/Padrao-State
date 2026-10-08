
public class Funcionario {

    private String nome;
    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoEstagio.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean demitir() {
        return estado.demitir(this);
    }

    public boolean afastar() {
        return estado.afastar(this);
    }

    public boolean entrarFerias() {
        return estado.entrarFerias(this);
    }

    public boolean estagiar() {
        return estado.estagiar(this);
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}