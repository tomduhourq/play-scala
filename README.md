# Play! 2 for Scala tutorial

This is a project intended to be a tutorial to start using *Play! 2 Framework with Scala*, and for my own because I had quite a mess managing to run everyhting on my IDE.

I am using **Scala 2.11.5** and **Intellij IDEA 14 Community Edition** (this is important to my belief because the scala plugin doesn't have support for Play! in com edition).

## Install 

  Download the activator (previous play command) from:

  [Play! 2 official site](https://www.playframework.com/download)
    
  Unzip the activator to the location you like and open your .bashrc or .zshrc and add:
 
  ````bash
  export PATH=$PATH:/path/to/activator
  ````
  
  You should be able to run ````$ activator````
  
  Wherever you want to start building your application type 
  ````$ activator new [app-name] [template-name]```` 
  with template-name being ````play-scala```` in our case.
  
  Next
  ````
  $ cd app-name
  [app-name] $ activator
  [app-name] $ idea with-sources=yes
  [app-name] $ exit
  ````
  Now we have created IntelliJ Idea project files. Launch IntelliJ, and select *file > open*. Go to your app folder and see if it gets detected as an IntelliJ project. 
  
  Open it.
  
## Damn Import 
  
  As I mentioned before, I had some issues importing the app to Intellij and getting the dependencies correctly detected.
  Obviously, first make sure you can import the project as a *sbt* project.
  
  My personal solution was to:
  
  ````sbt clean```` + 
  delete all ````.idea```` and all ````.iml```` files + 
  ````sbt idea```` inside the project's folder

## I hope this has been of some help to anyone, enjoy Play!ng with Scala

## Extra: Debugging

  In the *Run -> Edit Configurations* section, add a new *Remote* configuration and:
  
  ````
Set a name
Transport: Socket
Debugger mode: Attach
Host: localhost
Port: 9999
Select module you imported
  ````
  After applying this hit
   ````
  $ activator -jvm-debug 9999
  $ run
  ````

Many of the tips here were taken from [FPerezP blog](http://blog.fperezp.com/2014/07/13/first-steps-with-play-framework-and-intellij-idea/)
