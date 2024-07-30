package co.com.bancolombia.apiTopicosJacoco.domain.usuario;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private  String nombre;
    private String correoElectronico;

    public Usuario(DatosUsuario usuario) {
        this.nombre = usuario.nombre();
        this.correoElectronico = usuario.correoElectronico();
    }

    public Usuario actualizarDatos(DatosUsuario datosUsuario){
        this.nombre = datosUsuario.nombre();
        this.correoElectronico = datosUsuario.correoElectronico();
        return this;
    }

    @Override
    public String toString() {
        return  "Nombre='" + nombre + '\'' +
                ", Correo electronico='" + correoElectronico + '\'' +
                '}';
    }
}
