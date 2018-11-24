# webjs VUE

This is the starter project for every vue application.

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
	"project-type": "vue",
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
import Vue from 'vue';
import App from "./App.vue"


/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  template: "<App/>"
});
```

```html
<!--App.vue-->
<template>
    <div>
        <img src="assets/logo.png">
        <h1>{{ msg }}</h1>
        <h2>Essential Links</h2>
        <ul>
            <li><a href="https://vuejs.org" target="_blank">Core Docs</a></li>
            <li><a href="https://forum.vuejs.org" target="_blank">Forum</a></li>
            <li><a href="https://gitter.im/vuejs/vue" target="_blank">Gitter Chat</a></li>
            <li><a href="https://twitter.com/vuejs" target="_blank">Twitter</a></li>
            <br>
            <li><a href="http://vuejs-templates.github.io/webpack/" target="_blank">Docs for This Template</a></li>
        </ul>
        <h2>Ecosystem</h2>
        <ul>
            <li><a href="http://router.vuejs.org/" target="_blank">vue-router</a></li>
            <li><a href="http://vuex.vuejs.org/" target="_blank">vuex</a></li>
            <li><a href="http://vue-loader.vuejs.org/" target="_blank">vue-loader</a></li>
            <li><a href="https://github.com/vuejs/awesome-vue" target="_blank">awesome-vue</a></li>
        </ul>
    </div>
</template>

<script>
export default {
    data: function(){
        return {
            msg: 'Welcome to Your Vue.js App bundled with Parcel!!'
        }
    }
}
</script>

<style scoped>
html{
    text-align: center;
}
#app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
}

h1, h2 {
    font-weight: normal;
}

ul {
    list-style-type: none;
    padding: 0;
}

li {
    display: inline-block;
    margin: 0 10px;
}

a {
    color: #42b983;
}

</style>
```