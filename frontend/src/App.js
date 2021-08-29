import React, { Component } from 'react';
import './App.css';
import {PostRequest} from './PostRequest';

class App extends Component {
  render() {
    return (
      <div className="App">
        <div>
		<PostRequest />
	</div>
      </div>
    );
  }
}

export default App;