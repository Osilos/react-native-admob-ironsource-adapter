package com.admobironsourceadapter

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.ironsource.mediationsdk.IronSource

@ReactModule(name = AdmobIronsourceAdapterModule.NAME)
class AdmobIronsourceAdapterModule(reactContext: ReactApplicationContext) :
  NativeAdmobIronsourceAdapterSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  override fun setConsent(consent: Boolean) {
      IronSource.setConsent(consent)
  }

  companion object {
    const val NAME = "AdmobIronsourceAdapter"
  }
}
