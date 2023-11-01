import * as React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Image, Button, Linking, FlatList } from 'react-native';
import { Link, NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

const Stack = createNativeStackNavigator();

function Home({navigation}){
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Currículo</Text>
      <Image source={require('./fabricio400.png')} style={styles.image}></Image>
      <Text style={styles.name}>Fabrício Dias</Text>
      <View style={styles.row}>
        <Button title='Dados Pessoais' onPress={() => navigation.navigate('Dados')}></Button>
        <Button title='Habilidades' onPress={() => navigation.navigate('Habilidades')} ></Button>
      </View>
      <View style={styles.row}>
        <Button title='Experiências' onPress={() => navigation.navigate('Experiencias')}></Button>
        <Button title='Certificados' onPress={() => navigation.navigate}></Button>
      </View>
    
    </View>
  );
}

function Dados(){
  return(
  <View style={styles.container}>
    <FlatList 
    data={[
      {key:'Email: fabriciodsilva3404@gmail.com'},
      {key:'Telefone: +55 81 99451-2075'},
      {key:'Endereço: Morro da Conceição, Recife - PE. Brasil'},
      {key: <Button title='LinkedIn' onPress={() => Linking.openURL('https://www.linkedin.com/in/fabr%C3%ADcio-dias-860252247')}></Button>},
      {key: <Button title='GitHub' onPress={() => Linking.openURL('https://github.com/fabricioddsilva')}></Button>}
      ]} renderItem={({item}) => <Text style={styles.item}>{item.key}</Text>}>
      </FlatList>
  </View>
  );
}

function Habilidades(){
  return(
  <View style={styles.container}>
    <FlatList 
    data={[
      {key:'Conhecimento em Java, Intermediario'},
      {key:'Conhecimento em DB MySQL'},
      {key:'Conhecimento do Framework SpringBoot, juntamente com Thymeleaf'},
      {key:'Conhecimento em HTML5 e CSS3, juntamente com o Framekwork Materialize'},
      {key:'Boa Comunicação em Equipe'},
      {key:'Autoditada'},
      ]} renderItem={({item}) => <Text style={styles.item}>{item.key}</Text>}>
      </FlatList>
  </View>
  );
}

function Experiencias(){
  return(
  <View style={[styles.container, styles.spaces]}>
    <View>
      <Text>Near: App Web de Busca de Lojas por Bairro do Recife, utilizando Java com Spring Boot, Thymeleaf, MySQL, HTML e CSS</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://github.com/Patyluce/Projeto-near')}></Button>
    </View>
    <View>
      <Text>Kaos School: App Web de Controle de Administradores e Alunos, utilizando Java com Spring Boot, Thymeleaf, MySQL, HTML e o Framework Materialize</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://github.com/fabricioddsilva/Kaos-School')}></Button>
    </View>
    <View>
      <Text>Site Kaos: PWA de uma Startup Pessoal, utilizando template do site Bootstrap5, e transformando em PWA utilizando JavaScript</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://github.com/fabricioddsilva/GrupoKaos')}></Button>
    </View>
  </View>
  );
}

function Certificados(){
  return(
  <View style={styles.container}>
    
      <Text>Projeto START Recife 2022 (Turma Java) - Rede Cidadã</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://drive.google.com/file/d/15fr9W4XNibD7gU1u2Gj8BZWh5tv9Mxyo/view?usp=sharing')}></Button>
    
    
      <Text>Linguagem de Programação Java Básico - Fundação Bradesco</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://drive.google.com/file/d/1hp2qRYNf2rhTHu6AjfoKveuTLIBob8wo/view?usp=sharing')}></Button>
    
  
      <Text>Linguagem de Programação Java Avançado - Fundação Bradesco</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://drive.google.com/file/d/1Wnw9xqcHXIUxVo536zqV14U2OtJQM0Qo/view?usp=sharing')}></Button>
 
 
      <Text>Lógica de Programação Essêncial - Dio</Text>
      <Button title='Link' onPress={() => Linking.openURL('https://drive.google.com/file/d/1ceYPUPL8d57U7pTJW5ImV1J5Qd7KHDKP/view?usp=sharing')}></Button>
   
  </View>
  );
}

function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Home}></Stack.Screen>
        <Stack.Screen name="Dados" component={Dados}></Stack.Screen>
        <Stack.Screen name="Habilidades" component={Habilidades}></Stack.Screen>
        <Stack.Screen name="Experiencias" component={Experiencias}></Stack.Screen>
        <Stack.Screen name="Certificados" component={Certificados}></Stack.Screen>
      </Stack.Navigator>
    </NavigationContainer>
  );
}



const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
  },
  title: {
    fontSize: 30,
    marginTop: 20
  },
  image: {
    marginTop: 20,
    width: 300,
    height: 300,
    borderRadius: 20
  },
  name: {
    fontSize: 25,
    marginTop: 20,
    fontWeight: "bold"
  },
  item: {
    padding: 10,
    fontSize: 18,
    height: 44,
  },
  row: {
    padding: 5,
    flexDirection: "row",
    flexWrap: "wrap",
    gap: 10
    
  },
  spaces: {
    flexWrap: "wrap",
    padding: 10
  }
  
  

    
  
});

export default App;
