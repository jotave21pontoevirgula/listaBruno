import android.os.Bundle
import android.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import android.os.VibrationEƯect
import android.os.Vibrator
import android.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.EditText
import com.example.lista.R


class MainActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextNumero = findViewById<EditText>(R.id.t1)
        val textoDoEditText = editTextNumero.text.toString()
        val numero: Int? = textoDoEditText.toIntOrNull()
        if (numero != null) {
            Log.d("MainActivity", "Número: $numero")
        } else {
            Log.d("MainActivity", "Texto inválido, não é um número.")
        }
        fun vibrar(context: MainActivity, tempo: Long) {
            val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            val vibrationEƯect =
                VibrationEƯect.createOneShot(tempo, VibrationEƯect.DEFAULT_AMPLITUDE);
            vibrator.run {
                vibrate(vibrationEƯect);
            }
        }

        fun() {
            vibrar(this, 500)
        }
    }
}



