package perez.jaime.mvpejemplo.presentador

import perez.jaime.mvpejemplo.modelo.Usuario
import perez.jaime.mvpejemplo.vista.UsuarioView

class UsuarioPresenter(private val view: UsuarioView) {

    fun cargarUsuario() {
        // En una aplicación real, aquí obtendrías los datos del usuario desde el Modelo
        val usuario = Usuario("Ejemplo Usuario", "ejemplo@email.com")
        view.mostrarUsuario(usuario)
    }

}