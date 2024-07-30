package co.com.bancolombia.apiTopicosJacoco.domain.topico;

import jakarta.validation.constraints.NotNull;
import co.com.bancolombia.apiTopicosJacoco.domain.usuario.DatosUsuario;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        DatosUsuario usuario,
        String curso){
}