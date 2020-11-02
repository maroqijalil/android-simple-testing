package my.maroqi.application.moviecatalogue.utility

import android.os.Build
import androidx.annotation.RequiresApi

class ListCaster {
    companion object {
        fun getStringList(listString: ArrayList<String>?): String {
            var str = ""

            if (listString != null) {
                listString.forEachIndexed { index, it ->
                    if (index < listString.size - 1)
                        str += "$it, "
                    else
                        str += it
                }
            }

            return str
        }

        @RequiresApi(Build.VERSION_CODES.N)
        fun getStringListFromMap(listString: Map<String, String>?): String {
            var str = ""

            if (listString != null) {
                var index = 0

                listString.forEach { _, v ->
                    if (index < listString.size - 1)
                        str += "$v, "
                    else
                        str += v

                    index++
                }
            }

            return str
        }
    }
}