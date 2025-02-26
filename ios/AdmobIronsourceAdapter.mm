#import "AdmobIronsourceAdapter.h"
#import "IronSource/IronSource.h"

@implementation AdmobIronsourceAdapter
RCT_EXPORT_MODULE()

- (void) setConsent:(BOOL)value {
  [IronSource setConsent:value];
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeAdmobIronsourceAdapterSpecJSI>(params);
}

@end
