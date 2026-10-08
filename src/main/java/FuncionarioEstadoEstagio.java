public class FuncionarioEstadoEstagio extends FuncionarioEstado {

    private FuncionarioEstadoEstagio() {}
    private static FuncionarioEstadoEstagio instance = new FuncionarioEstadoEstagio();
    public static FuncionarioEstadoEstagio getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Estagio";
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
    public boolean entrarFerias(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        return true;
    }
}