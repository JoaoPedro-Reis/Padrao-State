
public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean demitir(Funcionario funcionario) {
        return false;
    }

    public boolean afastar(Funcionario funcionario) {
        return false;
    }

    public boolean entrarFerias(Funcionario funcionario) {
        return false;
    }

    public boolean estagiar(Funcionario funcionario) {
        return false;
    }

    public boolean ativar(Funcionario funcionario) {
        return false;
    }
}