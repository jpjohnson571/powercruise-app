import React, { Component } from 'react';
import {
  Button,
  StyleSheet,
  Text,
  View, Image, ImageBackground
} from 'react-native';

export default class Login extends Component {
  constructor(props) {
    super(props);

  }

  render() {
    const {} = this.props;
    return (
      <View style={styles.container}>
        <ImageBackground 
          style={{flex: 3, opacity: 600}}
          source={{uri:'https://static.wixstatic.com/media/a571c4_2979d17d540249c49f07ab3de14227e8~mv2_d_1366_2168_s_2.jpg/v1/fill/w_1366,h_1256,al_c,q_85/a571c4_2979d17d540249c49f07ab3de14227e8~mv2_d_1366_2168_s_2.png'}}>
          <Image source={{uri: 'https://static.wixstatic.com/media/a571c4_e75c11cd64a14837b775a44d19471854~mv2.png/v1/fill/w_789,h_500,al_c/a571c4_e75c11cd64a14837b775a44d19471854~mv2.png'}}
                 style={{flex: 2, paddingLeft: 370, width: 100, height: 200}}/>
          <Text style={styles.instructions}>
            Login in With Google or Facebook!
          </Text>
          <View style={{flex: 5, paddingTop: 100}}>
          <Button
            title='Login with FB'
            color='#000000'
          />
          <Button
            title='Login with Google'
            color='#000000'
          />
        </View>
        </ImageBackground>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column'
  },
  welcome: {
    fontSize: 24,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    fontSize: 14,
    fontWeight: 'bold',
    textAlign: 'center',
    color: '#000000',
    marginBottom: 5,
  },
});
