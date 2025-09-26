package xlsx.reader.spread.sheets.viewer.editor.screen.base

import com.google.android.gms.ads.nativead.NativeAd

interface IAdsControl {
    fun onNativeAdLoaded(nativeAd: NativeAd?)

    fun onAdFailedToLoad()
}