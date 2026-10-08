
public class FuncionarioEstadoDemitido extends FuncionarioEstado {

    private FuncionarioEstadoDemitido() {}
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static FuncionarioEstadoDemitido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Demitido";
    }

    @Override
    public boolean ativar(Funcionario funcionario) {
        // Recontratação
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        return true;
    }
}