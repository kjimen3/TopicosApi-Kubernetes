package co.com.bancolombia.apiTopicosJacoco.domain.topico;

import co.com.bancolombia.apiTopicosJacoco.domain.usuario.DatosUsuario;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fecha_de_creacion, String status, DatosUsuario usuario, String curso) {
}
