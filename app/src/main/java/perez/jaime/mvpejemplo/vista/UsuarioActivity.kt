package perez.jaime.mvpejemplo.vista

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import perez.jaime.mvpejemplo.R
import perez.jaime.mvpejemplo.modelo.Usuario
import perez.jaime.mvpejemplo.presentador.UsuarioPresenter

class UsuarioActivity : AppCompatActivity(), UsuarioView {

    private lateinit var presenter: UsuarioPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = UsuarioPresenter(this)

        // Simular la carga de datos del usuario
        presenter.cargarUsuario()

    }

    override fun mostrarUsuario(usuario: Usuario) {
        // Actualizar la interfaz de usuario con los datos del usuario
        //nombreTextView.text = usuario.nombre
        //correoTextView.text = usuario.correo
    }
}