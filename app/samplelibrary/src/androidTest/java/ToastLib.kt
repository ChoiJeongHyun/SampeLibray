import android.content.Context
import android.widget.Toast

/**
 * Created by genesislab_Jeong-Hyun. 2022/08/23
 */
class ToastLib {

    companion object {
        fun sShow(context: Context , msg: String? = ""){
            Toast.makeText(context, msg , Toast.LENGTH_SHORT).show()
        }
    }
}