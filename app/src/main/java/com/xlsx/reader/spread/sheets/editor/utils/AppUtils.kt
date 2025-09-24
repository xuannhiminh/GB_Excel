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
         const val PUBLIC_LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh9aRvWOCOxbhgeK3Yxn5AwxFuU1UsbCs9AJ1ksGKcmFPDpIpV37doDoH9Ti8Bvw08Tmpm2X5ZJ0/mufA1UJYb7bYLjmqLMWyw9NLdp+ZVeCFqbCLeEbuVtx+xh00yNjYDdtWeYUEVb8JD3CtLQ8Lt4yGO9wyeQaadIvjPLoqLZujM8cfrFm9hhFwpkPIj8w6pXfJUC1ZQ+xP+sZ8Ul2MZq/k6qzAbmsMLukT/tJYHjfCBqxndpskNpDdnz5IlzuofIo8qpCO2d+LSCjlq4xeIBaXDulcilufsEYN0K22tijj0BKRs0pxuazsvMUNmft2t4kw2WwFdTa9JmiH1KYjNQIDAQAB"
     }
 }