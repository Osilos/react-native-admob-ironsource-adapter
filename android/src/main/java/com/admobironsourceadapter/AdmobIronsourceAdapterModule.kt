package com.admobironsourceadapter

import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.ironsource.mediationsdk.IronSource

@ReactModule(name = AdmobIronsourceAdapterModule.NAME)
class AdmobIronsourceAdapterModule(private val reactContext: ReactApplicationContext) :
  NativeAdmobIronsourceAdapterSpec(reactContext), LifecycleEventListener {

  init {
    reactContext.addLifecycleEventListener(this)
  }

  override fun getName(): String {
    return NAME
  }

  override fun setConsent(consent: Boolean) {
    IronSource.setConsent(consent)
  }

  override fun onHostResume() {
    IronSource.onResume(reactContext.currentActivity)
  }

  override fun onHostPause() {
    IronSource.onPause(reactContext.currentActivity)
  }

  override fun onHostDestroy() {
      // Cleanup if needed
  }

  companion object {
    const val NAME = "AdmobIronsourceAdapter"
  }
}
