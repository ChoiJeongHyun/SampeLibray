package ai.genesislab.samplelibrary.toast

import android.content.Context
import android.widget.Toast

/**
 * Created by genesislab_Jeong-Hyun. 2022/08/23
 */
object PToast {

    fun show(context: Context, msg: String? = ""){
        Toast.makeText(context , msg, Toast.LENGTH_SHORT).show()
    }

    fun longShow(context: Context,  msg: String? = "") {
        Toast.makeText(context , msg, Toast.LENGTH_LONG).show()
    }
}