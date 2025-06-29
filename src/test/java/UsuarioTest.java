import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void actualizarPeso_deberiaAsignarNuevoPeso() {
        Usuario usuario = new Usuario("Victor", 100.0);
        usuario.actualizarPeso(92.0);

        // Test que va a fallar
        assertEquals(92.0, usuario.getPeso(), 0.01, "El peso no se actualizó correctamente");
    }
}
