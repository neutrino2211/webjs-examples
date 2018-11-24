# webjs REACT

This is the starter project for every react application.

## Run

```bash
$ wjs development
```

## Build

```bash
$ wjs build
```

## Test

```bash
wjs test
```

This performs a basic build test

## Android

First make your wjs-config.json look like this

```json
{
	"project-type": "react",
	"root": "dist",
	"local": false,
	"entry": "src/index.html",
    "extraModules": [],
    "android": {
		"app_name": "application-name",
		"package": "application-package-name",
		"colors": {
			"primary": "application-primary-color",
			"accent": "application-accent-color",
			"primaryDark": "application-dark-color"
		}
	}
}
```

Replace all the android values with that relevant to your app, then run

```bash
$ wjs build --android
```

This will generate an apk file with the name `<project-folder-name>.apk`.

To get the apk file ready for production you need to sign it, unfortunately wjs-cli does not do this for you so you need to follow the android documentation

## iOS

Coming soon

## Important Files

```js
//index.js
import React from 'react';
import ReactDOM from 'react-dom';
import App from './components/App';

ReactDOM.render(<App color="blue"/>, document.getElementById('root'));

```

```js
//App.js
import React, {PropTypes} from 'react';

export default class App extends React.Component {
  render() {
    return (
      <div style={{color: this.props.color}}>
        MyComponent
      </div>);
  }
}

```