# webjs JAVASCRIPT

This is the starter project for every javascript application.

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
	"project-type": "javascript",
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
import * as app from "../webjs_modules/app";

class App {
    constructor (root){
        root.innerHTML = "<h1>Hello World</h1>";
    }

    onViewLoad(){
        console.log("Done")
    }
}

app.load(document.getElementById("js-main"),App);
```