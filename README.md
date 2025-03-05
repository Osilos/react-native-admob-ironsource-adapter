
# react-native-admob-ironsource-adapter

Wrapper of ironsource adapter for admob mediation.

This should be used with Google Mobile Ads (Admob) : https://github.com/invertase/react-native-google-mobile-ads
Follow their step of installation and configuration before installing this package.

Follow the step for android and ios integration of ironsource as a mediation partner for admob:
- https://developers.google.com/admob/android/mediation/ironsource
- https://developers.google.com/admob/ios/mediation/ironsource

When the admob guide ask you to install package or write you this librairy instead.

## Installation

```sh

# Install the admob module
npm install react-native-google-mobile-ads

# Install the ironsource adapter for admob mediation
npm install react-native-admob-ironsource-adapter
```

Add the maven repositories
```
    maven {
      url = uri("https://android-sdk.is.com/")
    }
```

## Expo User

For expo user, this librairy only works for development build, it didn't work in Expo Go.

Add the maven repositories with "expo-build-properties"

## Usage


```js
import IronSourceAdapter from 'react-native-admob-ironsource-adapter';

// ...

const result = IronSourceAdapter.setConsent(true);
```


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)


