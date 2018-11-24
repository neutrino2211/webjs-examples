# webjs ANGULAR

This is the starter project for every angular application.

## Run

```bash
$ wjs development
```

## Build

```bash
$ wjs build
```

## Android

First make your wjs-config.json look like this

```json
{
	"project-type": "angular",
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
//./components/Main.component.ts
import { Component } from '@angular/core';

@Component({
    selector: 'my-app',
    template: `
        <div>
            <h1>{{text}}</h1>
        </div>`,
    styles: [
        'h1 { font-weight: 300; }',
        'div {display: flex;justify-content: center;align-items: center;width: 100%;height: 100%;}'
    ]
})

export class MainComponent {
    text: string = 'Hello World from Angular! 📦 🚀';

    constructor() {}
}
```