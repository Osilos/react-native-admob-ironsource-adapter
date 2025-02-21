import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  setConsent(consent: boolean): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('AdmobIronsourceAdapter');
