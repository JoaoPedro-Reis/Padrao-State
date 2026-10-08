
public class FuncionarioEstadoAtivo extends FuncionarioEstado {

    private FuncionarioEstadoAtivo() {}
    private static FuncionarioEstadoAtivo instance = new FuncionarioEstadoAtivo();
    public static FuncionarioEstadoAtivo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public boolean demitir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

    @Override
    public boolean entrarFerias(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        return true;
    }

    @Override
    public boolean afastar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        return true;
    }
}