public class FuncionarioEstadoFerias extends FuncionarioEstado {

    private FuncionarioEstadoFerias() {}
    private static FuncionarioEstadoFerias instance = new FuncionarioEstadoFerias();
    public static FuncionarioEstadoFerias getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ferias";
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

    @Override
    public boolean afastar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        return true;
    }
}