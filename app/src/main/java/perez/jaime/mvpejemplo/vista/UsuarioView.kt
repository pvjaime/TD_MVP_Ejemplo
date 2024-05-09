package perez.jaime.mvpejemplo.vista

import perez.jaime.mvpejemplo.modelo.Usuario

interface UsuarioView {
    fun mostrarUsuario(usuario: Usuario)
}