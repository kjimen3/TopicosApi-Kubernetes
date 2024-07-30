package co.com.bancolombia.apiTopicosJacoco.domain.topico;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha_de_creacion,
        Status status,
        String usuario,
        String curso){

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_de_creacion(), topico.getStatus(), topico.getUsuario().toString(), topico.getCurso());
    }
}
