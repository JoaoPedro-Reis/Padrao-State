import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionario estagio

    @Test
    public void deveDemitirFuncionarioEstagio() {
        funcionario.setEstado(FuncionarioEstadoEstagio.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveAfastarFuncionarioEstagio() {
        funcionario.setEstado(FuncionarioEstadoEstagio.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void deveEntrarFeriasFuncionarioEstagio() {
        funcionario.setEstado(FuncionarioEstadoEstagio.getInstance());
        assertTrue(funcionario.entrarFerias());
        assertEquals(FuncionarioEstadoFerias.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveEstagiarFuncionarioEstagio() {
        funcionario.setEstado(FuncionarioEstadoEstagio.getInstance());
        assertFalse(funcionario.estagiar());
    }

    @Test
    public void deveAtivarFuncionarioEstagio() {
        funcionario.setEstado(FuncionarioEstadoEstagio.getInstance());
        assertTrue(funcionario.ativar());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    // Funcionario ativo

    @Test
    public void deveDemitirFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveAfastarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveEntrarFeriasFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.entrarFerias());
        assertEquals(FuncionarioEstadoFerias.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveEstagiarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertFalse(funcionario.estagiar());
    }

    @Test
    public void naoDeveAtivarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertFalse(funcionario.ativar());
    }

    // Funcionario de ferias

    @Test
    public void deveDemitirFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveAfastarFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveEntrarFeriasFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.entrarFerias());
    }

    @Test
    public void naoDeveEstagiarFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.estagiar());
    }

    @Test
    public void deveAtivarFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.ativar());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    // Funcionario afastado

    @Test
    public void deveDemitirFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveAfastarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveEntrarFeriasFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.entrarFerias());
    }

    @Test
    public void naoDeveEstagiarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.estagiar());
    }

    @Test
    public void deveAtivarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.ativar());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    // Funcionario demitido

    @Test
    public void naoDeveDemitirFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveAfastarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveEntrarFeriasFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.entrarFerias());
    }

    @Test
    public void naoDeveEstagiarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.estagiar());
    }

    @Test
    public void deveAtivarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertTrue(funcionario.ativar());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

}