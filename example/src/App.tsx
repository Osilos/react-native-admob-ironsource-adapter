import { Text, View, StyleSheet, Pressable } from 'react-native';
import IronSourceAdapter from 'react-native-admob-ironsource-adapter';

export default function App() {
  const setConsentIronSource = () => {
    IronSourceAdapter.setConsent(true);
  };
  return (
    <View style={styles.container}>
      <Pressable onPress={setConsentIronSource}>
        <Text>Press to send consent.</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
