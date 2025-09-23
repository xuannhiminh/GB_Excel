package com.xlsx.reader.spread.sheets.viewer.editor.utils

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
         const val PUBLIC_LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjKN3Ud9WAK4agEoc9eUwtFw/da7h4jQAF2Hbh5DVoxTWdV4AG1W81knUOhn0EpqYXy+mModXMoZW95dD565bBxrdWCsTxmbRAcj+X85iub9MqSJWDZonhgZ6LjX4RMoCa7tPobEqILPWKDprz/MU3Fi3g0k884byr3Bfufj5ZIhezQB9mJm6fLf75tO5EQMGe4CIGDJo9P6KkcI7gFiIzO2Ia2v/oopo+nz0x20WMuYV1UQlAoTXIIVu47XtUgYUdQxrjfnh8k5s3d0VlXzJJeDIQBxHHI/1QOR8OlWX2Eumre9zaR2OIk9H+6ayOMEOaK6iKpbBei87vNqvsSGy/QIDAQAB"
     }
 }