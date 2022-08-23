package ai.genesislab.samplelibrary

import ai.genesislab.samplelibrary.toast.ToastLib
import ai.genesislab.samplelibrary.toast.ToastLib.Companion.sShow
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastLib.sShow(this, "efrgaegerg")
        sShow(this , "hi")


    }
}