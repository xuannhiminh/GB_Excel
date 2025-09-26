package xlsx.reader.spread.sheets.viewer.editor.utils

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import java.util.Currency
import java.util.Locale

class AppUtils {

     companion object {
         fun getCurrencySymbol(currencyCode: String, locale: Locale = Locale.getDefault()): String {
             return Currency.getInstance(currencyCode)
                 .getSymbol(locale)
         }
        fun isWidgetNotAdded(context: Context, widgetClass: Class<*>): Boolean {
            val appWidgetManager = AppWidgetManager.getInstance(context)
            val appWidgetIds = appWidgetManager.getAppWidgetIds(ComponentName(context, widgetClass))
            return appWidgetIds.isEmpty()
        }
         const val PDF_DETAIL_EZLIB = 0L // 0 mean use EZ lib pdf detail, 1 mean use SoLib PDF detail
         const val FOLDER_EXTERNAL_IN_DOWNLOADS = "SheetsReaderGB"
         const val PUBLIC_LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxF8vXD0+tyiwa63y0efkpf0WvwzZh2ZkqXE6h4y8XJt5YoAq9Mf96qMvZcHvi18sv5bxZLGSIJOA8+k1ixM8gK38BkuKQN2p2sx9t3VvGdesKqNEHEdQXvYjPgg2GxMv2fSvW3NKoeN1r9ueUr7xcf6WZFtCsZCEyWr//U7nSzfGFQZBz3muLoOAjPaiUUs7j4xrW/2KbUKeplBRrJDC7BPMLivhH4B+bGO2WO+9YtCU0DGt8OY9AgYQQEqw4RDG72Mxxi9/PqzSmz7utTx+R83n3f6o54PbmbH/QNXj3upNAwbM2apLVSg6i7YTZbfvAR+2JzP31BwpI9MOmD2WFQIDAQAB"
     }
 }