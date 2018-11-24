# webjs TASK

This is the starter project for every wjs-cli task.

## Publish

To publish the package, run
```bash
$ wjs publish <path-to-package> --type=task
```

## Test

```bash
wjs test
```

This performs a basic build test

## Important Files

```js
//engine.js
/**
 * cwd is the directory the task is running in
 * args is the command line arguments converted to an object e.g the arguments of
 * wjs run <your-task> --print --text="Hello World" will be {print:true,text:"Hello World"}
 * utils contains the wjs utility object e.g build,compile,chdir,parseConf e.t.c
 */
module.exports = function(cwd,args,utils){
    console.log("Hi i am running in "+cwd+" and the option print is "+args.print+" with text as "+args.text);
}
```