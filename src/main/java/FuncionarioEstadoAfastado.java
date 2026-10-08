
public class FuncionarioEstadoAfastado extends FuncionarioEstado {

    private FuncionarioEstadoAfastado() {}
    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();
    public static FuncionarioEstadoAfastado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Afastado";
    }

    @Override
    public boolean demitir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

    @Override
    public boolean ativar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        return true;
    }
}